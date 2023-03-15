package com.ngc.salesforceplaywright.playwrightngc.locators.underwriterLocators;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import lombok.Getter;

@Getter
public class UnderwriterApplicationsHomeLocators {
    private final Locator newButtonLocator;

    public UnderwriterApplicationsHomeLocators(Page page) {
        this.newButtonLocator = page.locator("input:has-text(\"New\")");
    }
}
