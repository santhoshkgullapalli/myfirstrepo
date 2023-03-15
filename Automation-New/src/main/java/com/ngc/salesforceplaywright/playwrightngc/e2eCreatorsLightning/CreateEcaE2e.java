package com.ngc.salesforceplaywright.playwrightngc.e2eCreatorsLightning;

import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.models.DealerApplicationDTO;
import com.ngc.salesforceplaywright.playwrightngc.pages.eca.EcaPage1;
import com.ngc.salesforceplaywright.playwrightngc.pages.eca.EcaPage2;
import com.ngc.salesforceplaywright.playwrightngc.pages.eca.EcaPage3;
import com.ngc.salesforceplaywright.playwrightngc.pages.eca.EcaPage4;
import com.ngc.salesforceplaywright.playwrightngc.pages.eca.EcaShortFormPage;

public class CreateEcaE2e {
    protected EcaShortFormPage ecaShortFormPage;
    protected EcaPage1 ecaPage1;
    protected EcaPage2 ecaPage2;
    protected EcaPage3 ecaPage3;
    protected EcaPage4 ecaPage4;

    public CreateEcaE2e(Page page) {
        this.ecaShortFormPage = new EcaShortFormPage(page);
        this.ecaPage1 = new EcaPage1(page);
        this.ecaPage2 = new EcaPage2(page);
        this.ecaPage3 = new EcaPage3(page);
        this.ecaPage4 = new EcaPage4(page);
    }

    public void ecaNeedHelp(DealerApplicationDTO dealerApplication) {
        ecaShortFormPage.iWantHelp(dealerApplication);
    }

    public void submitEcaApp(DealerApplicationDTO dealerApplication) {
        ecaShortFormPage.submitShortFormPage(dealerApplication);
        ecaPage1.submitEcaPage1(dealerApplication);
        ecaPage2.submitEcaPage2(dealerApplication);
        ecaPage3.submitEcaPage3(dealerApplication);
        ecaPage4.uploadEcaPage4Documents();
    }

}
