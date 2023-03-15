package com.ngc.salesforceplaywright.playwrightngc.pages.eca;

import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.locators.ecaLocators.EcaPage1Locators;
import com.ngc.salesforceplaywright.playwrightngc.models.DealerApplicationDTO;
import com.ngc.salesforceplaywright.playwrightngc.utils.RandomGen;

public class EcaPage1 {
    private final Page page;
    private EcaPage1Locators ecaPage1Locators;

    public EcaPage1(Page page) {
        this.ecaPage1Locators = new EcaPage1Locators(page);
        this.page = page;
    }

    private EcaPage1 fillOutEcaPage1(DealerApplicationDTO dealerApplication) {
        page.pause();
        ecaPage1Locators.getBusinessEntityTypeDropDownButtonLocator().click();
      
        page.locator(String.format("lightning-base-combobox-item[role=\"option\"]:has-text(\"%s\")",dealerApplication.getBusinessInformation().getBusinessEntityType())).click();
        ecaPage1Locators.getDateBusinessStartedLocator().fill(RandomGen.getTodaysDate());
        if (Boolean.TRUE.equals(dealerApplication.getBusinessInformation().getCreditNeeds().getIsProductTypeRetail())) {
            ecaPage1Locators.getProductTypeRetailCheckBoxLocator().click();
            ecaPage1Locators.getRequestedLineofCreditAmountRetailLocator().fill(dealerApplication.getBusinessInformation().getCreditNeeds().getRequestedLineofCreditAmountRetail());
        }
        if (Boolean.TRUE.equals(dealerApplication.getBusinessInformation().getCreditNeeds().getIsProductTypeSalvage())) {
            ecaPage1Locators.getProductTypeSalvageCheckBoxLocator().click();
            ecaPage1Locators.getRequestedLineofCreditAmountSalvageLocator().fill(dealerApplication.getBusinessInformation().getCreditNeeds().getRequestedLineofCreditAmountSalvage());
        }
        if (Boolean.TRUE.equals(dealerApplication.getBusinessInformation().getCreditNeeds().getIsProductTypeWholesale())) {
            ecaPage1Locators.getProductTypeWholesaleCheckBoxLocator().click();
            ecaPage1Locators.getRequestedLineofCreditAmountWholesaleLocator().fill(dealerApplication.getBusinessInformation().getCreditNeeds().getRequestedLineofCreditAmountWholesale());
        }
        if (Boolean.TRUE.equals(dealerApplication.getBusinessInformation().getCreditNeeds().getIsProductTypeHeavyTruck())) {
            ecaPage1Locators.getProductTypeHeavyTruckCheckBoxLocator().click();
            ecaPage1Locators.getRequestedLineofCreditAmountHeavyTruckLocator().fill(dealerApplication.getBusinessInformation().getCreditNeeds().getRequestedLineofCreditAmountHeavyTruck());
        }
        page.pause();
        return this;
    }

    private void clickNextButton() {
        ecaPage1Locators.getNextButtonLocator().click();
        page.navigate(page.url());
    }

    public void submitEcaPage1(DealerApplicationDTO dealerApplication) {
        fillOutEcaPage1(dealerApplication).clickNextButton();
    }
}
