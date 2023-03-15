package com.ngc.salesforceplaywright.playwrightngc.locators.ecaLocators;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import lombok.Getter;

@Getter
public class EcaPage3Locators {
    private final Locator firstNameLocator;
    private final Locator lastNameLocator;
    private final Locator titleLocator;
    private final Locator ownershipPercentageLocator;
    private final Locator socialSecurityNumberLocator;
    private final Locator dateOfBirthLocator;
    private final Locator driverLicenseNumberLocator;
    private final Locator driverLicenseStateLocator;
    private final Locator driverLicenseExpirationDateLocator;
    private final Locator streetLocator;
    private final Locator cityLocator;
    private final Locator stateLocator;
    private final Locator zipLocator;
    private final Locator additionalGuarantorFirstNameLocator;
    private final Locator additionalGuarantorLastNameLocator;
    private final Locator additionalGuarantorTitleLocator;
    private final Locator additionalGuarantorOwnershipPercentageLocator;
    private final Locator additionalGuarantorMobileNumberLocator;
    private final Locator additionalGuarantorEmailAddressLocator;
    private final Locator additionalGuarantorButtonLocator;
    private final Locator nextButtonLocator;

    public EcaPage3Locators(Page page) {
        this.firstNameLocator = page.locator("null");
        this.lastNameLocator = page.locator("null");
        this.titleLocator = page.locator("null");
        this.ownershipPercentageLocator = page.locator("null");
        this.socialSecurityNumberLocator = page.locator("null");
        this.dateOfBirthLocator = page.locator("null");
        this.driverLicenseNumberLocator = page.locator("null");
        this.driverLicenseExpirationDateLocator = page.locator("null");
        this.driverLicenseStateLocator = page.locator("null");
        this.streetLocator = page.locator("null");
        this.cityLocator = page.locator("null");
        this.stateLocator = page.locator("null");
        this.zipLocator = page.locator("null");
        this.additionalGuarantorButtonLocator = page.locator("");
        this.additionalGuarantorFirstNameLocator = page.locator("");
        this.additionalGuarantorLastNameLocator = page.locator("");
        this.additionalGuarantorTitleLocator = page.locator("");
        this.additionalGuarantorOwnershipPercentageLocator = page.locator("");
        this.additionalGuarantorMobileNumberLocator = page.locator("");
        this.additionalGuarantorEmailAddressLocator = page.locator("");
        this.nextButtonLocator = page.locator("button:has-text(\"Next\")");
    }
}
