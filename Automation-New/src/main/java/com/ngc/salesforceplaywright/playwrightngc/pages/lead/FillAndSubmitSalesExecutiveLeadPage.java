package com.ngc.salesforceplaywright.playwrightngc.pages.lead;

import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.locators.LeadPageLocators;
import com.ngc.salesforceplaywright.playwrightngc.models.LeadModels.LeadDTO;

public class FillAndSubmitSalesExecutiveLeadPage {
    private final Page page;
    private LeadPageLocators leadPageLocators;

    public FillAndSubmitSalesExecutiveLeadPage(Page page) {
        this.leadPageLocators = new LeadPageLocators(page);
        this.page = page;
    }

    private FillAndSubmitSalesExecutiveLeadPage fillOutLeadPage(LeadDTO lead) {

        return this;
    }

    private void clickBottomRowSaveButton() {
        leadPageLocators.getBottomRowSaveButtonLocator().click();
        page.navigate(page.url());
    }

    public void submitLead(LeadDTO lead) {
        fillOutLeadPage(lead).clickBottomRowSaveButton();
    }



}
