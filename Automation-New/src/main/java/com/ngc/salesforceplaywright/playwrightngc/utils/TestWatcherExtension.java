package com.ngc.salesforceplaywright.playwrightngc.utils;

import com.microsoft.playwright.Page;
import lombok.Data;
import lombok.Setter;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class TestWatcherExtension implements TestWatcher {
    public static boolean testHasIssues;
    private static final SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Page page;


    @Override
    public void testAborted(ExtensionContext extensionContext, Throwable throwable) {
        testHasIssues = true;
        System.out.println("MyTestWatcher.testAborted");
        System.out.println("testMethod = " + extensionContext.getTestMethod());
        System.out.println("throwable = " + throwable);
    }

    @Override
    public void testDisabled(ExtensionContext extensionContext, Optional<String> optional) {
        testHasIssues = true;
        System.out.println("MyTestWatcher.testDisabled");
        System.out.println("testMethod = " + extensionContext.getTestMethod());
        System.out.println("optional = " + optional);
    }

    @Override
    public void testFailed(ExtensionContext extensionContext, Throwable throwable) {
        testHasIssues = true;
        System.out.println("MyTestWatcher.testFailed");
        System.out.println("testMethod = " + extensionContext.getTestMethod());
        var timeStamp = timeStampUtility();
        File newFile = new File(String.format("src/test/resources/%s:%s.txt",extensionContext.getTestMethod(),timeStamp));
        writeUsingFileWriter(throwable.toString(),newFile);
        ScreenShotUtil.captureTestScreenshot(page,"src/test/resources/",extensionContext.getTestMethod().toString(),timeStamp);

        System.out.println("throwable = " + throwable);
    }

    @Override
    public void testSuccessful(ExtensionContext extensionContext) {
        testHasIssues = false;
        System.out.println("MyTestWatcher.testSuccessful");
        System.out.println("testMethod = " + extensionContext.getTestMethod());
    }

    private static void writeUsingFileWriter(String data,File file) {
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private String timeStampUtility(){
        Date date = new Date();
        return sdf3.format(new Timestamp(date.getTime()));
    }
}