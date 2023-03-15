package com.ngc.salesforceplaywright.playwrightngc;


import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TestController {
    @Getter
    private static final String TEST_ENV = "devbill";
    @Getter
    private static final String BROWSER_TO_BE_USED = "chrome";
    @Getter
    private static final Boolean HEADLESS = false;
    @Getter
    private static final Integer BROWSERSPEED = 2000;
}
