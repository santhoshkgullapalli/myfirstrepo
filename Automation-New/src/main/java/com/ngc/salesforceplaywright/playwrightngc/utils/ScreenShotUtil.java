package com.ngc.salesforceplaywright.playwrightngc.utils;

import com.microsoft.playwright.Page;
import lombok.experimental.UtilityClass;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Paths;

@UtilityClass
public class ScreenShotUtil{

        public static void captureTestScreenshot(Page page,String folderPath,String testMethodName,String timeStamp) {
        page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get(String.format("%s%s:%s.png",folderPath,testMethodName,timeStamp)))
                .setFullPage(true));
    }
}
    