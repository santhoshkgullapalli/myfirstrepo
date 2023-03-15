package com.ngc.salesforceplaywright.playwrightngc.locators.LsrLocators;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import lombok.Getter;

@Getter
public class LsrApplicationsHomeLocators {
    private final Locator newButtonLocator;

    public LsrApplicationsHomeLocators(Page page) {
        this.newButtonLocator = page.locator("input:has-text(\"New\")");
    }
}
