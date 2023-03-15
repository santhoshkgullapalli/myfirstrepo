package com.ngc.salesforceplaywright.playwrightngc.e2eCreators;

import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.enums.Profile;
import com.ngc.salesforceplaywright.playwrightngc.models.LeadModels.LeadDTO;
import com.ngc.salesforceplaywright.playwrightngc.pages.lead.FillAndSubmitSalesExecutiveLeadPage;
import com.ngc.salesforceplaywright.playwrightngc.pages.lead.leadPages.FillAndSubmitSystemAdminLeadPage;

public class CreateLeadE2e {
    protected LeadDTO lead;
    protected FillAndSubmitSalesExecutiveLeadPage fillAndSubmitSalesExecutiveLeadPage;
    protected FillAndSubmitSystemAdminLeadPage fillAndSubmitSystemAdminLeadPage;

    public CreateLeadE2e(Page page) {
        this.fillAndSubmitSalesExecutiveLeadPage = new FillAndSubmitSalesExecutiveLeadPage(page);
        this.fillAndSubmitSystemAdminLeadPage = new FillAndSubmitSystemAdminLeadPage(page);
    }

    public void submitLead(LeadDTO lead, Profile profile) {
        if (profile.getFullName().equals(Profile.SALES_EXECUTIVE.getFullName())) {
            fillAndSubmitSalesExecutiveLeadPage.submitLead(lead);
        }
        if (profile.getFullName().equals(Profile.SYS_ADMIN.getFullName())) {
            fillAndSubmitSystemAdminLeadPage.submitLead(lead);
        }
    }
}
