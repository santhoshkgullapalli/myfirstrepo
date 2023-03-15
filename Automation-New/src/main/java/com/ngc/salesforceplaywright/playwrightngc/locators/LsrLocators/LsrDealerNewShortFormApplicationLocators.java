package com.ngc.salesforceplaywright.playwrightngc.locators.LsrLocators;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import lombok.Getter;

@Getter
public class LsrDealerNewShortFormApplicationLocators {
    private final Locator federalTaxIdLocator;
    private final Locator exactLegalNameLocator;
    private final Locator dbaNameLocator;
    private final Locator businessAuctionAccessNumberLocator;
    private final Locator countryDropdownLocator;
    private final Locator driverLicenseNumberLocator;
    private final Locator driverLicenseExpireDateLocator;
    private final Locator sourcePortfolioManagerTextBoxLocator;
    private final Locator sourceSalesExecutiveTextBoxLocator;
    private final Locator sourceThirdPartyTextBoxLocator;
    private final Locator sourcePortfolioManagerSearchButtonLocator;
    private final Locator sourceSalesExecutiveSearchButtonLocator;
    private final Locator sourceThirdPartySearchButtonLocator;
    private final Locator bottomSaveAndContinueButtonLocator;
    private final Locator bottomCancelButtonLocator;

    public LsrDealerNewShortFormApplicationLocators(Page page) {
        this.federalTaxIdLocator = page.locator("input[name=\"j_id0\\:EntryForm\\:FormEntryBlock\\:BussInfo\\:FedIdLev1\\:federalID\"]");
        this.exactLegalNameLocator = page.getByLabel("*Exact Legal Name");
        this.dbaNameLocator = page.getByLabel("DBA Name (if applicable)");
        this.businessAuctionAccessNumberLocator = page.getByLabel("Business Auction Access #");
        this.countryDropdownLocator = page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Country"));
        this.driverLicenseNumberLocator = page.getByLabel("Dealer License #");
        this.driverLicenseExpireDateLocator = page.getByLabel("Dealer License Exp Date");
        this.sourcePortfolioManagerSearchButtonLocator = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Source Portfolio Manager Lookup (New Window)"));
        this.sourceSalesExecutiveSearchButtonLocator = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Source Sales Executive Lookup (New Window)"));
        this.sourceThirdPartySearchButtonLocator = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Source Third Party Lookup (New Window)"));
        this.sourcePortfolioManagerTextBoxLocator = page.locator("input[name=\"j_id0\\:EntryForm\\:FormEntryBlock\\:BussInfo\\:j_id85\\:j_id87\"]");
        this.sourceSalesExecutiveTextBoxLocator = page.locator("input[name=\"j_id0\\:EntryForm\\:FormEntryBlock\\:BussInfo\\:j_id88\\:j_id90\"]");
        this.sourceThirdPartyTextBoxLocator = page.locator("input[name=\"j_id0\\:EntryForm\\:FormEntryBlock\\:BussInfo\\:j_id91\\:j_id93\"]");
        this.bottomSaveAndContinueButtonLocator = page.locator("input[name=\"j_id0\\:EntryForm\\:FormEntryBlock\\:j_id74\\:bottom\\:j_id75\"]");
        this.bottomCancelButtonLocator = page.locator("input[name=\"j_id0\\:EntryForm\\:FormEntryBlock\\:j_id74\\:bottom\\:j_id76\"]");
    }
}
