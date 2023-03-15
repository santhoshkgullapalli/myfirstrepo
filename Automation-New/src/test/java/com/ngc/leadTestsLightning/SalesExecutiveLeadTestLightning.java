package com.ngc.leadTestsLightning;

import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.ngc.salesforceplaywright.playwrightngc.baseTests.BaseSalesforceTest;
import com.ngc.salesforceplaywright.playwrightngc.enums.Profile;
import com.ngc.salesforceplaywright.playwrightngc.models.LeadModels.LeadDTO;
import com.ngc.salesforceplaywright.playwrightngc.pages.lead.leadPages.NewLeadPage;
import com.ngc.salesforceplaywright.playwrightngc.pages.salesforceLogin.LoginAsSfUserPage;

public class SalesExecutiveLeadTestLightning extends BaseSalesforceTest {
  LoginAsSfUserPage loginAsSfUserPage;
  Profile profile;
  LeadDTO salesExecutiveLead;
  private static final int RETRY = 3;

  @BeforeEach
  public void initialize() throws JsonMappingException, JsonProcessingException, IOException {
    this.profile = Profile.SALES_EXECUTIVE;
    LoginAsSfUserPage loginAsSfUserPage = new LoginAsSfUserPage(page);
    loginAsSfUserPage.searchForSfUserName(profile.getDefaultSfUserName()).loginAsSfUser();
    NewLeadPage createLeadPage = new NewLeadPage(page);
    createLeadPage.clickOnLeadTab().clickOnNewButton();
    this.loginAsSfUserPage = loginAsSfUserPage;
  }

  @RepeatedTest(value = RETRY)
  public void createSalesExecutiveLeadE2e() {
    createLeadE2e.submitLead(salesExecutiveLead, profile);
  }

}
