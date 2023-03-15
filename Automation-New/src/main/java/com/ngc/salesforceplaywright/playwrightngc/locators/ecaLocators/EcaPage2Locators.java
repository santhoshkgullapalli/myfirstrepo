package com.ngc.salesforceplaywright.playwrightngc.locators.ecaLocators;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import lombok.Getter;

@Getter
public class EcaPage2Locators {
    private final Locator bankRoutingNumberLocator;
    private final Locator bankCheckingAccountNumberLocator;
    private final Locator bankNameLocator;
    private final Locator bankCityLocator;
    private final Locator bankStateLocator;
    private final Locator nextButtonLocator;

    public EcaPage2Locators(Page page) {
        this.bankRoutingNumberLocator = page.locator("input[name=\"routingNumberDisplay\"]");
        this.bankCheckingAccountNumberLocator = page.locator("input[name=\"checkingAccountNumberDisplay\"]");
        this.bankNameLocator = page.locator("input[name=\"Bank_Name__c\"]");
        this.bankCityLocator = page.locator("input[name=\"Bank_City__c\"]");
        this.bankStateLocator = page.locator("select[name=\"Bank_State__c\"]");
        this.nextButtonLocator = page.locator("button:has-text(\"Next\")");
    }
}
