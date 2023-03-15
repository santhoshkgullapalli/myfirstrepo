package com.ngc.salesforceplaywright.playwrightngc.pages.dealerApplicationPages;


import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.locators.LsrLocators.LsrApplicationsHomeLocators;
import com.ngc.salesforceplaywright.playwrightngc.locators.LsrLocators.LsrDealerNewShortFormApplicationLocators;
import com.ngc.salesforceplaywright.playwrightngc.locators.LsrLocators.LsrDealerNewStandardFormApplicationLocators;
import com.ngc.salesforceplaywright.playwrightngc.locators.LsrLocators.LsrProfileHomePageLocators;
import com.ngc.salesforceplaywright.playwrightngc.models.DealerApplicationDTO;

import lombok.extern.java.Log;

@Log
public class FillAndSubmitLsrDealerApplicationPage {
    private final Page page;
    private LsrProfileHomePageLocators lsrProfileHomePageLocators;
    private LsrApplicationsHomeLocators lsrApplicationsHomeLocators;
    private LsrDealerNewShortFormApplicationLocators lsrDealerNewShortFormApplicationLocators;
    public FillAndSubmitLsrDealerApplicationPage(Page page) {
        this.lsrProfileHomePageLocators = new LsrProfileHomePageLocators(page);
        this.lsrApplicationsHomeLocators = new LsrApplicationsHomeLocators(page);
        this.lsrDealerNewShortFormApplicationLocators = new LsrDealerNewShortFormApplicationLocators(page);
        new LsrDealerNewStandardFormApplicationLocators(page);
        this.page = page;
    }

    private void clickOnApplicationsTab() {
        lsrProfileHomePageLocators.getApplicationTabLocator().click();
        page.navigate(page.url());
    }

    private void clickOnNewButton() {
        lsrApplicationsHomeLocators.getNewButtonLocator().click();
        page.navigate(page.url());
    }

    private void fillOutShortFormDealerApplication(DealerApplicationDTO dealerApplication) {
        page.pause();
        lsrDealerNewShortFormApplicationLocators.getFederalTaxIdLocator()
                .fill(dealerApplication.getBusinessInformation().getFederalTaxId());
        page.pause();
        lsrDealerNewShortFormApplicationLocators.getExactLegalNameLocator()
                .fill(dealerApplication.getBusinessInformation().getExactLegalBusinessName());
        lsrDealerNewShortFormApplicationLocators.getDbaNameLocator()
                .fill(dealerApplication.getBusinessInformation().getDbaName());
        lsrDealerNewShortFormApplicationLocators.getBusinessAuctionAccessNumberLocator()
                .fill(dealerApplication.getBusinessInformation().getBusinessAuctionAccessNumber());
        lsrDealerNewShortFormApplicationLocators.getCountryDropdownLocator().selectOption(dealerApplication.getAppCountry());
        lsrDealerNewShortFormApplicationLocators.getDriverLicenseNumberLocator()
                .fill(dealerApplication.getBusinessInformation().getDriversLicenseNumber());
        lsrDealerNewShortFormApplicationLocators.getDriverLicenseExpireDateLocator()
                .fill(dealerApplication.getBusinessInformation().getDriverLicenseExpireDate());
        page.locator("#datePicker div:has-text(\"SunMonTueWedThuFriSat 1234567 891011121314 15161718192021 22232425262728 2930311\")").click();
        lsrDealerNewShortFormApplicationLocators.getSourcePortfolioManagerTextBoxLocator().fill(dealerApplication.getBusinessInformation().getSourcePortfolioManager());
        page.pause();
    }

    private void clickShortFormApplicationBottomRowSaveAndContinueButton() {
        lsrDealerNewShortFormApplicationLocators.getBottomSaveAndContinueButtonLocator().click();
        page.navigate(page.url());
    }

    private void fillOutStandardDealerApplicationForm(DealerApplicationDTO dealerApplication) {
        var text = page.locator("th:has-text(\"Application ID\")").allTextContents();
        for (String string : text) {
            log.info(string);
        }
        page.pause();
    }

    public void createNewDealerApplication(DealerApplicationDTO dealerApplication) {
        clickOnApplicationsTab();
        clickOnNewButton();
        fillOutShortFormDealerApplication(dealerApplication);
        clickShortFormApplicationBottomRowSaveAndContinueButton();
        fillOutStandardDealerApplicationForm(dealerApplication);
        page.navigate(page.url());
    }
}