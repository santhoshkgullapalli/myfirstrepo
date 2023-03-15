package com.ngc.salesforceplaywright.playwrightngc.pages.lead.leadPagesLightning;

import com.microsoft.playwright.Page;

public class NewLeadPage {
    private final Page page;
   
    public NewLeadPage (Page page) {
        this.page = page;
    }

    public NewLeadPage clickOnLeadTab() {
        page.locator("div[role=\"navigation\"] >> text=Leads").click();
        return this;
    }
    public NewLeadPage clickOnNewButton() {
        page.locator("input:has-text(\"New\")").click();
        page.navigate(page.url());
        return this;
    }
}
