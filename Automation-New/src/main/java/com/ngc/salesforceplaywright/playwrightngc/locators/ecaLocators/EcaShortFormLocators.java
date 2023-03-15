package com.ngc.salesforceplaywright.playwrightngc.locators.ecaLocators;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import lombok.Getter;

@Getter
public class EcaShortFormLocators {
    private final Locator countryPickListLocator;
    private final Locator languagePickListLocator;
    private final Locator firstNameLocator;
    private final Locator lastNameLocator;
    private final Locator emailLocator;
    private final Locator mobileNumberLocator;
    private final Locator preferredMethodOfCommLocator;
    private final Locator dealerHasDealerLicenseLocator;
    private final Locator dealerDoesNotHaveDealerLicenseLocator;
    private final Locator businessPhoneNumberLocator;
    private final Locator auctionAccessNumberLocator;
    private final Locator businessAddressLocator;
    private final Locator companyNameLocator;
    private final Locator cityLocator;
    private final Locator stateLocator;
    private final Locator zipLocator;
    private final Locator smartyStreetPopupUseThisAddressButtonLocator;
    private final Locator smartyStreetPopupSubmitButtonLocator;
    private final Locator continueButtonLocator;
    private final Locator iWantHelpButtonLocator;
    private final Locator ecaPage1NavigateButtonLocator;

    public EcaShortFormLocators(Page page) {
        this.countryPickListLocator = page.locator("select[name=\"countryPick\"]");
        this.languagePickListLocator = page.locator("select[name=\"preferredLanguagePicklist\"]");
        this.firstNameLocator = page.locator("input[name=\"FirstName\"]");
        this.lastNameLocator = page.locator("input[name=\"LastName\"]");
        this.emailLocator = page.locator("input[name=\"Email\"]");
        this.mobileNumberLocator = page.locator("input[name=\"MobilePhone\"]");
        this.preferredMethodOfCommLocator = page.locator("select[name=\"methodOfContact\"]");
        this.dealerHasDealerLicenseLocator = page.locator("label:has-text(\"Yes\")");
        this.dealerDoesNotHaveDealerLicenseLocator = page.locator("label:has-text(\"No\")");
        this.businessPhoneNumberLocator = page.locator("input[name=\"BusinessPhone\"]");
        this.companyNameLocator = page.locator("input[name=\"Company\"]");
        this.auctionAccessNumberLocator = page.locator("[placeholder=\"\\35 \\#\\#\\#\\#\\#\\#\"]");
        this.businessAddressLocator = page.locator("input[name=\"Street\"]");
        this.cityLocator = page.locator("input[name=\"City\"]");
        this.stateLocator =       page.locator("select[name=\"statePicklist\"]");
        this.zipLocator = page.locator("input[name=\"PostalCode\"]");
        this.smartyStreetPopupUseThisAddressButtonLocator = page.locator("text=Use this Address");
        this.smartyStreetPopupSubmitButtonLocator = page.locator("button:has-text(\"Submit\")");
        this.continueButtonLocator = page.locator("button:has-text(\"Continue\")");
        this.iWantHelpButtonLocator = page.locator(
                "button:has-text(\"I want help from a sales team member.A Sales Representative will contact you wit\")");
        this.ecaPage1NavigateButtonLocator = page.locator("button:has-text(\"I want to complete the application now.The following 5 step process will take ap\")");

    }

}
