package com.ngc.salesforceplaywright.playwrightngc.locators.underwriterLocators;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import lombok.Getter;

@Getter
public class UnderwriterDealerNewStandardFormApplicationLocators {
    private final Locator newAddressButtonLocator;
    private final Locator newBankAccountButtonLocator;
    private final Locator newLineOfCreditButtonLocator;
    private final Locator newFloorPlanSourceButtonLocator;
    private final Locator newSignerButtonLocator;
    private final Locator newDocumentButtonLocator;
    private final Locator submitApplicationButton;
    private final Locator topSaveButtonLocator;
    private final Locator bottomSaveButtonLocator;
    private final Locator topCancelButtonLocator;
    private final Locator bottomCancelButtonLocator;
    private final Locator applicationIdLocator;
    private final Locator federalTaxIdLocator;
    private final Locator exactLegalNameLocator;
    private final Locator dbaNameLocator;
    private final Locator dbaName2Locator;
    private final Locator businessAuctionAccessNumberLocator;
    private final Locator countryDropdownLocator;
    private final Locator driverLicenseNumberLocator;
    private final Locator driverLicenseExpireDateLocator;
    private final Locator sourcePortfolioManagerLocatorSearchButtonLocator;
    private final Locator sourceSalesExecutiveLocatorSearchButtonLocator;
    private final Locator sourceThirdPartySearchButtonLocator;
    private final Locator bottomSaveAndContinueButtonLocator;


    public UnderwriterDealerNewStandardFormApplicationLocators(Page page) {
        this.newAddressButtonLocator = page.locator("");
        this.newBankAccountButtonLocator = page.locator("");
        this.newLineOfCreditButtonLocator = page.locator("");
        this.newFloorPlanSourceButtonLocator = page.locator("");
        this.newSignerButtonLocator = page.locator("");
        this.newDocumentButtonLocator = page.locator("");
        this.submitApplicationButton = page.locator("");
        this.topSaveButtonLocator = page.locator("");
        this.bottomSaveButtonLocator = page.locator("");
        this.topCancelButtonLocator = page.locator("");
        this.applicationIdLocator = page.locator("text=Application ID");
        this.federalTaxIdLocator = page.locator("text=Federal Tax ID");
        this.exactLegalNameLocator = page.locator("text=*Exact Legal Name");
        this.dbaNameLocator = page.locator("text=DBA Name (if applicable)");
        this.dbaName2Locator = page.locator("text=DBA Name Two (if applicable)");
        this.businessAuctionAccessNumberLocator = page.locator("text=Business Auction Access #");
        this.countryDropdownLocator = page.locator("text=Country");
        this.driverLicenseNumberLocator = page.locator("text=Dealer License #");
        this.driverLicenseExpireDateLocator = page.locator("text=Dealer License Exp Date");
        this.sourcePortfolioManagerLocatorSearchButtonLocator = page.locator("img[alt=\"Source Portfolio Manager Lookup \\(New Window\\)\"]");
        this.sourceSalesExecutiveLocatorSearchButtonLocator = page.locator("img[alt=\"Source Sales Executive Lookup \\(New Window\\)\"]");
        this.sourceThirdPartySearchButtonLocator = page.locator("img[alt=\"Source Third Party Lookup \\(New Window\\)\"]");
        this.bottomSaveAndContinueButtonLocator = page.locator("input[name=\"j_id0\\:EntryForm\\:FormEntryBlock\\:j_id74\\:bottom\\:j_id75\"]");
        this.bottomCancelButtonLocator = page.locator("input[name=\"j_id0\\:EntryForm\\:FormEntryBlock\\:j_id74\\:bottom\\:j_id76\"]");
    }
}
