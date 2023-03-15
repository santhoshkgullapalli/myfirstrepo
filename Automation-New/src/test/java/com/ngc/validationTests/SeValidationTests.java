package com.ngc.validationTests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URISyntaxException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ngc.salesforceplaywright.playwrightngc.baseTests.BaseSalesforceTest;
import com.ngc.salesforceplaywright.playwrightngc.enums.Profile;
import com.ngc.salesforceplaywright.playwrightngc.pages.salesforceLogin.LoginAsSfUserPage;
import com.ngc.salesforceplaywright.playwrightngc.salesforceAPI.SalesforceQueryHelper;
import com.ngc.salesforceplaywright.playwrightngc.utils.UrlModifier;

public class SeValidationTests extends BaseSalesforceTest {
  LoginAsSfUserPage loginAsSfUserPage;

  @BeforeEach
  public void initializeLoginPageAndCreateLeadPage() {
    LoginAsSfUserPage loginAsSfUserPage = new LoginAsSfUserPage(page);
    loginAsSfUserPage.searchForSfUserName(Profile.SALES_EXECUTIVE.getDefaultSfUserName()).loginAsSfUser();
    this.loginAsSfUserPage = loginAsSfUserPage;
  }

  @Test
  public void validateHomebarLoadsAndDifferentTabs() {
    assertTrue(page.locator("#tabBar").isVisible());

  }

  @Test
  public void validateLeadCheckIn() throws URISyntaxException {

    var id = salesforceService.query(SalesforceQueryHelper.getUserIdQuery("Jamie", "Shabazz"));
    System.out.println(id);
    page.navigate(UrlModifier.removePathFromUrl(page.url()) + "00Q5C000004W0GN");
  }
}
