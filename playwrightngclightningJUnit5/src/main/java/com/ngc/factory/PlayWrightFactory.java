package com.ngc.factory;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.ngc.constants.Constants;

public class PlayWrightFactory {
	
	
	public static Playwright playwright;
	public Browser browser;
	public static Page page;
	public static BrowserContext browserContext;
	
	public Page initBrowser(String browserName) {
		
		playwright = Playwright.create();
		
		switch(browserName.toLowerCase()) {
		
		case "chromium":
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
			
		default:
			break;
		}
		
		browserContext = browser.newContext();
		page = browserContext.newPage();
		page.navigate(Constants.URL);
		return page;
		
	}

}
