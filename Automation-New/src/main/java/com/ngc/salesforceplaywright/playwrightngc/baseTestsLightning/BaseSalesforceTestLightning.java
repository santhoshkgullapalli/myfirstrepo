package com.ngc.salesforceplaywright.playwrightngc.baseTestsLightning;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.TestController;
import com.ngc.salesforceplaywright.playwrightngc.browser.DriverFactory;
import com.ngc.salesforceplaywright.playwrightngc.discoverDatabase.DiscoverDbService;
//import com.ngc.salesforceplaywright.playwrightngc.e2eCreators.CreateLeadE2e;
import com.ngc.salesforceplaywright.playwrightngc.e2eCreatorsLightning.CreateLeadE2eLightning;
import com.ngc.salesforceplaywright.playwrightngc.pages.salesforceLogin.LoginPage;
import com.ngc.salesforceplaywright.playwrightngc.salesforceAPI.SalesforceApiConfig;
import com.ngc.salesforceplaywright.playwrightngc.salesforceAPI.SalesforceService;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseSalesforceTestLightning {
  private static final String MAINLOGINURL = "https://test.salesforce.com";
  protected Page page;
  protected Browser browser;
  protected SalesforceService salesforceService;
  protected DiscoverDbService discoverDbService;
  protected CreateLeadE2eLightning createLeadE2eLightning;
  private String browserToBeUsed = TestController.getBROWSER_TO_BE_USED();
  


  @BeforeAll
  public void initializeDriver()
  {
    page = DriverFactory.getDriver(browserToBeUsed); 
    this.salesforceService = new SalesforceApiConfig().initializeSalesForceApiEnvironment();
    this.discoverDbService = new DiscoverDbService();
    this.createLeadE2eLightning = new CreateLeadE2eLightning(page);

  }

  @BeforeEach
  public void mainSfLoginPage() {
    page.navigate(MAINLOGINURL);
    LoginPage loginPage = new LoginPage(page);
    loginPage.enterUsername().enterPassword().enterPassword().clickLogin();
    page.navigate(page.url());
    if(page.url().contains("lightning")) {
      page.locator("button:has-text(\"View profile\")").click();
      page.locator("text=Switch to Salesforce Classic").click();
      page.navigate(page.url());
    }
  }


  @AfterEach 
  public void logout() {
    page.locator("#userNavLabel").click();
    page.locator("text=Logout").click();
  }

  @AfterAll
  public void tearDown(){page.close(); }
}