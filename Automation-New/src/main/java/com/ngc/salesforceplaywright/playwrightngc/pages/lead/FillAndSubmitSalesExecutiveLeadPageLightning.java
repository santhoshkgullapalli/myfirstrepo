package com.ngc.salesforceplaywright.playwrightngc.pages.lead;

import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.locators.LeadPageLocators;
import com.ngc.salesforceplaywright.playwrightngc.models.LeadModelsLightning.LeadDTOLightning;

public class FillAndSubmitSalesExecutiveLeadPageLightning {
    private final Page page;
    private LeadPageLocators leadPageLocators;

    public FillAndSubmitSalesExecutiveLeadPageLightning(Page page) {
        this.leadPageLocators = new LeadPageLocators(page);
        this.page = page;
    }

    private FillAndSubmitSalesExecutiveLeadPageLightning fillOutLeadPage(LeadDTOLightning lead) {

        return this;
    }

    private void clickBottomRowSaveButton() {
        leadPageLocators.getBottomRowSaveButtonLocator().click();
        page.navigate(page.url());
    }

    public void submitLead(LeadDTOLightning lead) {
        fillOutLeadPage(lead).clickBottomRowSaveButton();
    }



}
