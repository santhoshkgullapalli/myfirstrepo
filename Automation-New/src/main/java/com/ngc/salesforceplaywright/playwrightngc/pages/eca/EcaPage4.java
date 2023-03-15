package com.ngc.salesforceplaywright.playwrightngc.pages.eca;

import java.io.File;
import java.nio.file.Paths;

import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.TestController;


public class EcaPage4 {
    private final Page page;
    private static final String MAINFILEDIRECTORY = System.getProperty("user.dir");
    private static final String ARTICLESOFINCORPORATIONFILENAME = "articlesOfIncorporation.pdf";
    private static final String ARTICLESOFORGANIZATIONFILENAME = "articlesOfOrganization.pdf";


    public EcaPage4(Page page) {
        this.page = page;

    }
        
    public void uploadEcaPage4Documents() {
        uploadDocuments().clickNextButton();
    }

    public void uploadEcaPage4Documents(String appId) {
        var url = String.format(
                "https://nextgearcapital--%s.sandbox.my.salesforce-sites.com/dealers/applicationApp?id=%s&pageId=applicationPage4",
                TestController.getTEST_ENV(), appId);
        page.navigate(url);
        uploadDocuments();
    }

    private EcaPage4 uploadDocuments() {
        page.setInputFiles("input[type='file']",
                Paths.get(MAINFILEDIRECTORY + File.separator + String.format("/src/main/files/%s",ARTICLESOFINCORPORATIONFILENAME)));
        waitForCompleteProgressBar();
        page.setInputFiles("input[type='file']",
                Paths.get(MAINFILEDIRECTORY + File.separator + String.format("/src/main/files/%s", ARTICLESOFORGANIZATIONFILENAME)));
        waitForCompleteProgressBar();

        return this;
    }

    private void clickNextButton() {
        page.navigate(page.url());
    }

    private void waitForCompleteProgressBar() {
        page.waitForSelector("div[role=\"progressbar\"]:has-text(\"Progress: 100%\")");
    }
}
