package com.ngc.salesforceplaywright.playwrightngc.baseTestsLightning;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.TestController;
import com.ngc.salesforceplaywright.playwrightngc.browser.DriverFactory;
import com.ngc.salesforceplaywright.playwrightngc.e2eCreators.CreateEcaE2e;
import com.ngc.salesforceplaywright.playwrightngc.enums.EcaUrlDetails;
import com.ngc.salesforceplaywright.playwrightngc.pages.eca.EcaPage1;
import com.ngc.salesforceplaywright.playwrightngc.pages.eca.EcaPage2;
import com.ngc.salesforceplaywright.playwrightngc.pages.eca.EcaPage3;
import com.ngc.salesforceplaywright.playwrightngc.pages.eca.EcaPage4;
import com.ngc.salesforceplaywright.playwrightngc.pages.eca.EcaShortFormPage;
import com.ngc.salesforceplaywright.playwrightngc.salesforceAPI.SalesforceApiConfig;
import com.ngc.salesforceplaywright.playwrightngc.salesforceAPI.SalesforceService;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseEcaTest {

  protected Page page;
  private String testEnv;
  protected Browser browser;
  protected SalesforceService salesforceService;
  protected CreateEcaE2e ecaAppPageE2e;
  protected EcaShortFormPage ecaShortFormPage;
  protected EcaPage1 ecaPage1;
  protected EcaPage2 ecaPage2;
  protected EcaPage3 ecaPage3;
  protected EcaPage4 ecaPage4;
  private String browserToBeUsed = TestController.getBROWSER_TO_BE_USED();
  private String baseEcaUrl = EcaUrlDetails.ECABASEURL.getUrl();

  @BeforeAll
  public void initialize() {
    page = DriverFactory.getDriver(browserToBeUsed);
    this.testEnv = TestController.getTEST_ENV();
    this.salesforceService = new SalesforceApiConfig().initializeSalesForceApiEnvironment();
    this.ecaAppPageE2e = new CreateEcaE2e(page);
    this.ecaShortFormPage = new EcaShortFormPage(page);
    this.ecaPage1 = new EcaPage1(page);
    this.ecaPage2 = new EcaPage2(page);
    this.ecaPage3 = new EcaPage3(page);
    this.ecaPage4 = new EcaPage4(page);
  }

  @BeforeEach
  public void navigateToMainEcaPage() {
    if (testEnv.equalsIgnoreCase("devbill")) {
      page.navigate(String.format(baseEcaUrl, testEnv));
    }
    if (testEnv.equalsIgnoreCase("sit")) {
      page.navigate(String.format(baseEcaUrl, testEnv));
    }
    if (testEnv.equalsIgnoreCase("uat")) {
      page.navigate(String.format(baseEcaUrl, testEnv));
    }
    page.navigate(page.url());
  }

  @AfterAll
  public void tearDown() {
    page.close();
  }
}
