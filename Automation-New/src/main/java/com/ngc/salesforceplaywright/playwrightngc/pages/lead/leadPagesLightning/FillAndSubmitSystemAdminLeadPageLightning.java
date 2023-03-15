package com.ngc.salesforceplaywright.playwrightngc.pages.lead.leadPagesLightning;

import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.locators.LeadPageLocators;
import com.ngc.salesforceplaywright.playwrightngc.models.LeadModelsLightning.LeadDTOLightning;

public class FillAndSubmitSystemAdminLeadPageLightning {
    private final Page page;
    private LeadPageLocators leadPageLocators;

    public FillAndSubmitSystemAdminLeadPageLightning(Page page) {
        this.leadPageLocators = new LeadPageLocators(page);
        this.page = page;
    }
    
    private FillAndSubmitSystemAdminLeadPageLightning fillOutLeadPage(LeadDTOLightning lead) {
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
