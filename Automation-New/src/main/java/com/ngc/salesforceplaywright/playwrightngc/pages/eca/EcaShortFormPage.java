package com.ngc.salesforceplaywright.playwrightngc.pages.eca;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;
import com.ngc.salesforceplaywright.playwrightngc.locators.ecaLocators.EcaShortFormLocators;
import com.ngc.salesforceplaywright.playwrightngc.models.DealerApplicationDTO;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EcaShortFormPage {
    private final EcaShortFormLocators ecaShortFormLocators;
    private final Page page;


    public EcaShortFormPage(Page page) {
        this.page = page;
        this.ecaShortFormLocators = new EcaShortFormLocators(page);
    }

    private void fillOutEcaShortFormPage(DealerApplicationDTO dealerApp) {

        ecaShortFormLocators.getCountryPickListLocator().selectOption(new SelectOption().setLabel("United States of America"));
        ecaShortFormLocators.getLanguagePickListLocator().first().selectOption("English");
        ecaShortFormLocators.getFirstNameLocator().fill(dealerApp.getSigner().getFirstName());
        ecaShortFormLocators.getLastNameLocator().fill(dealerApp.getSigner().getLastName());
        ecaShortFormLocators.getEmailLocator().fill(dealerApp.getSigner().getEmail());
        if (Boolean.TRUE.equals(dealerApp.getContactHasDealerLicense())) {
            ecaShortFormLocators.getDealerHasDealerLicenseLocator().click();
        }
        ecaShortFormLocators.getMobileNumberLocator().fill(dealerApp.getSigner().getCellPhone());
        ecaShortFormLocators.getBusinessPhoneNumberLocator().fill(dealerApp.getBusinessInformation().getBusinessPhoneNumber());
        ecaShortFormLocators.getCompanyNameLocator().fill(dealerApp.getBusinessInformation().getExactLegalBusinessName());
        ecaShortFormLocators.getAuctionAccessNumberLocator().fill(dealerApp.getBusinessInformation().getBusinessAuctionAccessNumber());
        ecaShortFormLocators.getBusinessAddressLocator().fill(dealerApp.getBusinessInformation().getAddress().getStreet());
        ecaShortFormLocators.getStateLocator().selectOption(dealerApp.getBusinessInformation().getAddress().getState());
        ecaShortFormLocators.getCityLocator().fill(dealerApp.getBusinessInformation().getAddress().getCity());
        ecaShortFormLocators.getZipLocator().fill(dealerApp.getBusinessInformation().getAddress().getZip());

    }

    private void clickContinueButton() {
        ecaShortFormLocators.getContinueButtonLocator().click();
    }

    private void handleSmartStreetsPopup() {
        ecaShortFormLocators.getSmartyStreetPopupUseThisAddressButtonLocator().click();
        ecaShortFormLocators.getSmartyStreetPopupSubmitButtonLocator().click();
    
    }

    private void navigateToEcaPage1() {
        ecaShortFormLocators.getEcaPage1NavigateButtonLocator().click();
    }

    private void navigateToNeedHelpPage() {
        ecaShortFormLocators.getIWantHelpButtonLocator().click();
    }

    public void iWantHelp(DealerApplicationDTO ecaDealerApp) {
        fillOutEcaShortFormPage(ecaDealerApp);
        clickContinueButton();
        handleSmartStreetsPopup();
        navigateToNeedHelpPage();
    }

    public void submitShortFormPage(DealerApplicationDTO ecaDealerApp) {
        fillOutEcaShortFormPage(ecaDealerApp);
        clickContinueButton();
        handleSmartStreetsPopup();
        navigateToEcaPage1();
    }
}
