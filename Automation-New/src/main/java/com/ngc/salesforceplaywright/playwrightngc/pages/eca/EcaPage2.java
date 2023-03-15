package com.ngc.salesforceplaywright.playwrightngc.pages.eca;

import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.locators.ecaLocators.EcaPage2Locators;
import com.ngc.salesforceplaywright.playwrightngc.models.DealerApplicationDTO;

public class EcaPage2 {
    private final Page page;
    private EcaPage2Locators ecaPage2Locators;

    public EcaPage2(Page page) {
        this.page = page;
        this.ecaPage2Locators = new EcaPage2Locators(page);
    }

    private EcaPage2 fillOutEcaPage2(DealerApplicationDTO dealerApplication) {
        ecaPage2Locators.getBankRoutingNumberLocator().fill(dealerApplication.getBankAccount().getBankRoutingNumber());
        ecaPage2Locators.getBankCheckingAccountNumberLocator().fill(dealerApplication.getBankAccount().getCheckingAccountNumber());
        ecaPage2Locators.getBankNameLocator().fill(dealerApplication.getBankAccount().getBankName());
        ecaPage2Locators.getBankCityLocator().fill(dealerApplication.getBankAccount().getBankCity());
        ecaPage2Locators.getBankStateLocator().selectOption(dealerApplication.getBankAccount().getBankState());
        return this;
    }

    private void clickNextButton() {
        ecaPage2Locators.getNextButtonLocator().click();
        page.navigate(page.url());
    }

    public void submitEcaPage2(DealerApplicationDTO dealerApplication) {
        fillOutEcaPage2(dealerApplication).clickNextButton();
    }
}
