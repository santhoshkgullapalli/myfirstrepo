package com.ngc.salesforceplaywright.playwrightngc.e2eCreators;


import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.enums.Profile;
import com.ngc.salesforceplaywright.playwrightngc.models.DealerApplicationDTO;
import com.ngc.salesforceplaywright.playwrightngc.pages.dealerApplicationPages.FillAndSubmitLsrDealerApplicationPage;
import com.ngc.salesforceplaywright.playwrightngc.pages.dealerApplicationPages.FillAndSubmitUnderwriterDealerApplicationPage;

public class CreateDealerApplicationE2e {
    protected DealerApplicationDTO dealerApplication;

    protected FillAndSubmitLsrDealerApplicationPage fillAndSubmitLsrDealerApplicationPage;
    protected FillAndSubmitUnderwriterDealerApplicationPage fillAndSubmitUnderwriterDealerApplicationPage;

    public CreateDealerApplicationE2e(Page page) {
        this.fillAndSubmitLsrDealerApplicationPage = new FillAndSubmitLsrDealerApplicationPage(page);
        this.fillAndSubmitUnderwriterDealerApplicationPage = new FillAndSubmitUnderwriterDealerApplicationPage(page);

    }

    public void submitDealerApplication(DealerApplicationDTO dealerApplication, Profile profile) {
        if (profile.getFullName().equals(Profile.LENDING_SERVICES_REPRESENTATIVE.getFullName())) {
            fillAndSubmitLsrDealerApplicationPage.createNewDealerApplication(dealerApplication);
        }
        if (profile.getFullName().equals(Profile.UNDERWRITER.getFullName())) {
            fillAndSubmitUnderwriterDealerApplicationPage.createNewDealerApplication(dealerApplication);
        }
    
    }
}
