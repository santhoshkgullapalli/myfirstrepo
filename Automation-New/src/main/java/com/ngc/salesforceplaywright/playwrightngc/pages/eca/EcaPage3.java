package com.ngc.salesforceplaywright.playwrightngc.pages.eca;

import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.builders.dealerAppBuilders.DealerApplicationAdditionalGuarantorBuilder;
import com.ngc.salesforceplaywright.playwrightngc.locators.ecaLocators.EcaPage3Locators;
import com.ngc.salesforceplaywright.playwrightngc.models.AdditionalGuarantorDTO;
import com.ngc.salesforceplaywright.playwrightngc.models.DealerApplicationDTO;

public class EcaPage3 {
    private final Page page;
    private EcaPage3Locators ecaPage3Locators;

    public EcaPage3(Page page) {
        this.page = page;
        this.ecaPage3Locators = new EcaPage3Locators(page);
    }

    private EcaPage3 fillOutEcaPage3(DealerApplicationDTO dealerApplication) {
        ecaPage3Locators.getTitleLocator().fill(dealerApplication.getGuarantor().getTitle());
        ecaPage3Locators.getOwnershipPercentageLocator().fill(dealerApplication.getGuarantor().getOwnershipPercentage());
        ecaPage3Locators.getSocialSecurityNumberLocator().fill(dealerApplication.getGuarantor().getSocialSecurityNumber());
        ecaPage3Locators.getDateOfBirthLocator().fill(dealerApplication.getGuarantor().getDateOfBirth());
        ecaPage3Locators.getDriverLicenseNumberLocator().fill(dealerApplication.getGuarantor().getDriverLicenseNumber());
        ecaPage3Locators.getDriverLicenseStateLocator().fill(dealerApplication.getGuarantor().getDriverLicenseState());
        ecaPage3Locators.getDriverLicenseExpirationDateLocator().fill(dealerApplication.getGuarantor().getDriverLicenseExpiration());
        ecaPage3Locators.getStreetLocator().fill(dealerApplication.getGuarantor().getAddress().getStreet());
        ecaPage3Locators.getCityLocator().fill(dealerApplication.getGuarantor().getAddress().getCity());
        ecaPage3Locators.getStateLocator().fill(dealerApplication.getGuarantor().getAddress().getState());
        ecaPage3Locators.getZipLocator().fill(dealerApplication.getGuarantor().getAddress().getZip());

        var additionalGuarantors = DealerApplicationAdditionalGuarantorBuilder.buildAdditionalGuarantors(dealerApplication.getGuarantor().getAdditionalGuarantors());
        
        if (!additionalGuarantors.isEmpty()){
            ecaPage3Locators.getAdditionalGuarantorButtonLocator().click();
        }
        for (AdditionalGuarantorDTO additionalGuarantor : additionalGuarantors) {
            ecaPage3Locators.getAdditionalGuarantorFirstNameLocator().fill(additionalGuarantor.getFirstName());
            ecaPage3Locators.getAdditionalGuarantorLastNameLocator().fill(additionalGuarantor.getLastName());
            ecaPage3Locators.getAdditionalGuarantorTitleLocator().fill(additionalGuarantor.getTitle());
            ecaPage3Locators.getAdditionalGuarantorOwnershipPercentageLocator().fill(additionalGuarantor.getOwnershipPercentage());
            ecaPage3Locators.getAdditionalGuarantorMobileNumberLocator().fill(additionalGuarantor.getCellPhone());
            ecaPage3Locators.getAdditionalGuarantorEmailAddressLocator().fill(additionalGuarantor.getEmail());
            ecaPage3Locators.getAdditionalGuarantorButtonLocator().click();
        }   
        return this;
    }
    private void clickNextButton() {
        ecaPage3Locators.getNextButtonLocator().click();
        page.navigate(page.url());
    }
    public void submitEcaPage3(DealerApplicationDTO dealerApplication) {
        fillOutEcaPage3(dealerApplication).clickNextButton();
    }
}
