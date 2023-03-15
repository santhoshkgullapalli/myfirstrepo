package com.ngc.ecaTests;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import com.ngc.salesforceplaywright.playwrightngc.utils.TestWatcherExtension;
import org.junit.jupiter.api.Test;

import com.ngc.salesforceplaywright.playwrightngc.baseTests.BaseEcaTest;
import com.ngc.salesforceplaywright.playwrightngc.builders.dealerAppBuilders.DealerApplicationBuilder;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(TestWatcherExtension.class)
class EcaE2ETest extends BaseEcaTest {


    public EcaE2ETest() {

    }


    @Test
    void ecaE2eBaseDealerAppSubmitUnitedStatesAndEnglish() {

      //  ecaAppPageE2e.submitEcaApp();
    }

    @Test
    void ecaBaseDealerAppIwantHelp() {
        var dealerApplication = DealerApplicationBuilder.getAutomatedDealerApplication();
        ecaAppPageE2e.ecaNeedHelp(dealerApplication);
        assertThat(page.locator("text=Ok, got it!")).hasText("Ok, got it!");
    }
}
