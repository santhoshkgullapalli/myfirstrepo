package com.ngc.salesforceplaywright.playwrightngc.locators.ecaLocators;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import lombok.Getter;

@Getter
public class EcaPage1Locators {
    private final Locator businessNameLocator;
    private final Locator businessPhoneNumberLocator;
    private final Locator auctionAccessNumberLocator;
    private final Locator businessAddressLocator;
    private final Locator cityLocator;
    private final Locator stateLocator;
    private final Locator zipLocator;
    private final Locator dbaNameLocator;
    private final Locator dealerLicenseNumberLocator;
    private final Locator dealerLicenseExpirationDateLocator;
    private final Locator stateOfFormationLocator;
    private final Locator businessEntityTypeDropDownButtonLocator;
    private final Locator dateBusinessStartedLocator;
    private final Locator federalTaxIdLocator;
    private final Locator stateTaxIdLocator;
    private final Locator productTypeRetailCheckBoxLocator;
    private final Locator requestedLineofCreditAmountRetailLocator;
    private final Locator productTypeWholesaleCheckBoxLocator;
    private final Locator requestedLineofCreditAmountWholesaleLocator;
    private final Locator productTypeSalvageCheckBoxLocator;
    private final Locator requestedLineofCreditAmountSalvageLocator;
    private final Locator productTypeHeavyTruckCheckBoxLocator;
    private final Locator requestedLineofCreditAmountHeavyTruckLocator;
    private final Locator nextButtonLocator;

    public EcaPage1Locators(Page page) {
        this.businessNameLocator = page.locator("input[name=\"Exact_Legal_Name_App__c\"]");
        this.businessPhoneNumberLocator = page.locator("input[name=\"Business_Phone_Number__c\"]");
        this.auctionAccessNumberLocator = page.locator("[placeholder=\"\\35 \\#\\#\\#\\#\\#\\#\"]");
        this.businessAddressLocator = page.locator("input[name=\"Street\"]");
        this.cityLocator = page.locator("input[name=\"City\"]");
        this.stateLocator = page.locator("select[name=\"picklist1\"]");
        this.zipLocator = page.locator("input[name=\"PostalCode\"]");
        this.dbaNameLocator = page.locator("input[name=\"DBA_Name__c\"]");
        this.dealerLicenseNumberLocator = page.locator("input[name=\"dealerLicenseNumberDisplay\"]");
        this.dealerLicenseExpirationDateLocator = page.locator("input[name=\"Dealer_License_Exp_Date__c\"]");
        this.stateOfFormationLocator = page.locator("select[name=\"State_of_Formation_Organization__c\"]");
        this.businessEntityTypeDropDownButtonLocator = page.locator("[aria-label=\"Business Entity Type\\, Select Type\"]");
        this.dateBusinessStartedLocator = page.locator("input[name=\"Date_Business_Started__c\"]");
        this.federalTaxIdLocator = page.locator("input[name=\"federalTaxIdDisplay\"]");
        this.stateTaxIdLocator = page.locator("input[name=\"stateTaxIdDisplay\"]");
        this.productTypeRetailCheckBoxLocator = page.locator("label:has-text(\"Retail\")");
        this.requestedLineofCreditAmountRetailLocator = page.locator("input[name=\"Requested_Line_of_Credit_Amount_Retail__c\"]");
        this.productTypeWholesaleCheckBoxLocator = page.locator("label:has-text(\"Wholesale\")");
        this.requestedLineofCreditAmountWholesaleLocator = page.locator("input[name=\"Requested_Line_of_Credit_Amount_Wholesal__c\"]");
        this.productTypeSalvageCheckBoxLocator = page.locator(("label:has-text(\"Salvage\")"));
        this.requestedLineofCreditAmountSalvageLocator = page.locator("input[name=\"Requested_Line_of_Credit_Amount_Salvage__c\"]");
        this.productTypeHeavyTruckCheckBoxLocator = page.locator("label:has-text(\"Heavy Truck\")");
        this.requestedLineofCreditAmountHeavyTruckLocator = page.locator("input[name=\"Requested_Line_of_Credit_Amount_HvyTruk__c\"]");
        this.nextButtonLocator = page.locator("button:has-text(\"Next\")");
    }
}
