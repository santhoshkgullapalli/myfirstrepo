package com.ngc.dealerApplicationTests;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ngc.salesforceplaywright.playwrightngc.baseTests.BaseSalesforceTest;
import com.ngc.salesforceplaywright.playwrightngc.builders.dealerAppBuilders.DealerApplicationBuilder;
import com.ngc.salesforceplaywright.playwrightngc.e2eCreators.CreateDealerApplicationE2e;
import com.ngc.salesforceplaywright.playwrightngc.enums.Profile;
import com.ngc.salesforceplaywright.playwrightngc.pages.salesforceLogin.LoginAsSfUserPage;

public class UnderwriterDealerApplicationTest extends BaseSalesforceTest {
    LoginAsSfUserPage loginAsSfUserPage;
    Profile profile;
    CreateDealerApplicationE2e createDealerApplicationE2e;

    @BeforeEach
    public void initialize() {
        this.profile = Profile.UNDERWRITER;
        LoginAsSfUserPage loginAsSfUserPage = new LoginAsSfUserPage(page);
        loginAsSfUserPage.searchForSfUserName(profile.getDefaultSfUserName()).loginAsSfUser();
        this.loginAsSfUserPage = loginAsSfUserPage;
        this.createDealerApplicationE2e = new CreateDealerApplicationE2e(page);
    }

    @Test
    public void createUnderwriterDealerApplicationE2e() throws IOException {
        var dealerApplication = DealerApplicationBuilder.getAutomatedDealerApplication();
        createDealerApplicationE2e.submitDealerApplication(dealerApplication, profile);
    }
}
