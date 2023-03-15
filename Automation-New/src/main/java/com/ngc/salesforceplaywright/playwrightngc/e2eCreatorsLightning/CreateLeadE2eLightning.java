package com.ngc.salesforceplaywright.playwrightngc.e2eCreatorsLightning;

import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.enums.Profile;
import com.ngc.salesforceplaywright.playwrightngc.models.LeadModelsLightning.LeadDTOLightning;
import com.ngc.salesforceplaywright.playwrightngc.pages.lead.FillAndSubmitSalesExecutiveLeadPageLightning;
import com.ngc.salesforceplaywright.playwrightngc.pages.lead.leadPagesLightning.FillAndSubmitSystemAdminLeadPageLightning;

public class CreateLeadE2eLightning {
    protected LeadDTOLightning lead;
    protected FillAndSubmitSalesExecutiveLeadPageLightning fillAndSubmitSalesExecutiveLeadPageLightning;
    protected FillAndSubmitSystemAdminLeadPageLightning fillAndSubmitSystemAdminLeadPageLightning;

    public CreateLeadE2eLightning(Page page) {
        this.fillAndSubmitSalesExecutiveLeadPageLightning = new FillAndSubmitSalesExecutiveLeadPageLightning(page);
        this.fillAndSubmitSystemAdminLeadPageLightning = new FillAndSubmitSystemAdminLeadPageLightning(page);
    }

    public void submitLead(LeadDTOLightning lead, Profile profile) {
        if (profile.getFullName().equals(Profile.SALES_EXECUTIVE.getFullName())) {
        fillAndSubmitSalesExecutiveLeadPageLightning.submitLead(lead);
        }
        if (profile.getFullName().equals(Profile.SYS_ADMIN.getFullName())) {
            fillAndSubmitSystemAdminLeadPageLightning.submitLead(lead);
        }
    }
}
