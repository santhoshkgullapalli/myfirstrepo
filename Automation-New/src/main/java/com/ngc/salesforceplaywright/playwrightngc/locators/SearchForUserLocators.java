package com.ngc.salesforceplaywright.playwrightngc.locators;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import lombok.Getter;

@Getter
public class SearchForUserLocators {
    private final Locator searchBoxLocator;
    private final Locator goButtonLocator;

    public SearchForUserLocators(Page page) {
        this.searchBoxLocator = page.frameLocator("frame[name=\"searchFrame\"]").locator("[placeholder=\"Search\\.\\.\\.\"]");
        this.goButtonLocator = page.frameLocator("frame[name=\"searchFrame\"]").locator("text=Go!");

    }
}
