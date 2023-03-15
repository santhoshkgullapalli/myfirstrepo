package com.ngc.salesforceplaywright.playwrightngc.browser;

import com.microsoft.playwright.*;
import com.ngc.salesforceplaywright.playwrightngc.TestController;

import lombok.experimental.UtilityClass;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@UtilityClass
public class DriverFactory {
    private static final Map<String, Supplier<Page>> driverMap = new HashMap<>();

    private final String PROFILE = "profile.default_content_setting_values.notifications";

    private final Boolean HEADLESS = TestController.getHEADLESS();

    private final Integer SLOWMO = TestController.getBROWSERSPEED();

    private static final Supplier<Page> chromium = () -> {
        Browser browser;

        Map<String, Object> prefs = new HashMap<>();
        prefs.put(PROFILE, 2);
        browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(HEADLESS).setSlowMo(SLOWMO));
        BrowserContext context = browser.newContext();
        return context.newPage();
    };

    private static final Supplier<Page> firefoxDriver = () -> {
        Browser browser;

        Map<String, Object> prefs = new HashMap<>();
        prefs.put(PROFILE, 2);
        browser = Playwright
                .create()
                .firefox()
                .launch(new BrowserType.LaunchOptions().setHeadless(HEADLESS).setSlowMo(SLOWMO));
        BrowserContext context = browser.newContext();
        return context.newPage();
    };

    private static final Supplier<Page> webkit = () -> {
        Browser browser;

        Map<String, Object> prefs = new HashMap<>();
        prefs.put(PROFILE, 2);
        browser = Playwright
                .create()
                .webkit()
                .launch(new BrowserType.LaunchOptions().setHeadless(HEADLESS).setSlowMo(SLOWMO));
        BrowserContext context = browser.newContext();
        return context.newPage();
    };

    static {
        driverMap.put("chrome", chromium);
        driverMap.put("firefox", firefoxDriver);
        driverMap.put("webkit", webkit);
    }

    public static final Page getDriver(String type) {
        return driverMap.get(type.toLowerCase()).get();
    }

}
