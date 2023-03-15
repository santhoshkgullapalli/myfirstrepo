package com.ngc.salesforceplaywright.playwrightngc.locators.LsrLocators;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import lombok.Getter;

@Getter
public class LsrProfileHomePageLocators {
    private final Locator applicationQueueTabLocator;
    private final Locator applicationTabLocator;
    private final Locator financingOrganizationsTabLocator;
    private final Locator contractQueuesTabLocator;
    private final Locator stipulationTabLocator;



    public LsrProfileHomePageLocators(Page page) {
        this.applicationQueueTabLocator = page.locator("");
        this.applicationTabLocator = page.locator("a:has-text(\"Applications\")");
        this.financingOrganizationsTabLocator = page.locator("");
        this.contractQueuesTabLocator = page.locator("");
        this.stipulationTabLocator = page.locator("");
    }

}
