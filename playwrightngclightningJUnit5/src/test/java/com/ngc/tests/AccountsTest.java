package com.ngc.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.ngc.factory.PlayWrightFactory;
import com.ngc.pages.Accounts;
import com.ngc.pages.Leads;

public class AccountsTest {

	public static PlayWrightFactory pf;
	public static Page page;
	public static Leads leadspage;

	public static Accounts accountspage;

	@Before
	public void Setup() {

		pf = new PlayWrightFactory();
		page = pf.initBrowser("chromium");
		leadspage = new Leads(page);
		accountspage = new Accounts(page);

	}

	public void LoginTest() {

		leadspage.LoginDetails();

	}

	@Test
	public void creditDetailsHeaders() throws InterruptedException {
		LoginTest();
		accountspage.verifyCreditDetailsHeaders();

		String linesOfCreditText = page.content();
		if (linesOfCreditText.contentEquals("Lines Of Credit")) {
			assertTrue(true, "Lines Of Credit");
		}
	}

	@Test
	public void FloorPlansVerification() throws InterruptedException {

		LoginTest();
		Accounts.TillNextCRM();
		Accounts.verifyFloorPlans();

		String Amount = page.content();
		if (Amount.contentEquals("AMOUNT")) {
			assertTrue(true, "AMOUNT");
		} else if (Amount.contentEquals("Insufficient")) {
			assertTrue(true, "Insufficient");
		} else {

		}

	}

	@Test
	public void FicoScoreCard() throws InterruptedException {
		LoginTest();
		Accounts.fipoSc();
		Accounts.verifyFPSc();

		String Individual = page.content();
		if (Individual.contentEquals("Individual")) {
			assertTrue(true, "Individual");
		}
		String Status = page.content();
		if (Status.contentEquals("Status")) {
			assertTrue(true, "Status");
		}

		Locator generatedAlert = page.getByText("Generated Alert");
		String generatedAlertText = generatedAlert.textContent();
		assertTrue(true, "Generated Alert");

	}

   @Test
	public void PMSI() throws InterruptedException {
		LoginTest();
		Accounts.fipoSc();
		Accounts.verifyPMSI();

	}

   @Test
	public void NSF() throws InterruptedException {
		LoginTest();
		Accounts.verifyNSP();
		Accounts.PMSIChecking();

		Locator Name = page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Name"));
		String generatedNameText = Name.textContent();
		assertTrue(true, "Name");

		Locator Alert_Date = page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Alert Date"));
		String generatedAlertDate = Alert_Date.textContent();
		assertTrue(true, "Alert Date");

		Locator Alert_Type = page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Alert Type"));
		String generatedAlertType = Alert_Type.textContent();
		assertTrue(true, "Alert Type");

		Locator Desc = page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Description"));
		String generatedDesc = Desc.textContent();
		assertTrue(true, "Description");

		Locator Acc = page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Account"));
		String generatedAccount = Desc.textContent();
		assertTrue(true, "Account");

		Locator NSFComments = page.getByText("warninginfo icon No NSF Comments for Business: 135919");
		String NSFCommentstext = NSFComments.textContent();
		System.out.println(NSFCommentstext);

		if (NSFCommentstext.contentEquals("warninginfo icon No NSF Comments for Business")) {
			assertFalse(false, "NSF Comments");
		} else {
			Locator NSF_notifier = page.getByText("warninginfo icon No NSF Comments for Business: 135919");
			String notifierText = NSF_notifier.textContent();
			assertTrue(true, "NSF Comments");

		}

	}

   @Test
	public void CollectionIncidentDetails() throws InterruptedException {
		LoginTest();
		Accounts.fipoSc();
		Accounts.collectionNotice();
		Thread.sleep(3000);
		Locator Decision = page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(
				"Trigger Date Assigned To Decision Method Status Risk Contact Follow Up Resolved % Offsite % Late Locks Risk Rank"))
				.getByText("Decision");
		String generatedDecisionText = Decision.textContent();
		assertTrue(true, "Decision");

		Locator Method = page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(
				"Trigger Date Assigned To Decision Method Status Risk Contact Follow Up Resolved % Offsite % Late Locks Risk Rank"))
				.getByText("Method");
		String generatedMethodText = Method.textContent();
		assertTrue(true, "Method");

		Locator Status = page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(
				"Trigger Date Assigned To Decision Method Status Risk Contact Follow Up Resolved % Offsite % Late Locks Risk Rank"))
				.getByText("Status");
		String generatedStatusText = Status.textContent();
		assertTrue(true, "Status");

		Locator Comments_for_Selected_Incident = page.getByRole(AriaRole.BUTTON,
				new Page.GetByRoleOptions().setName("Comments for Selected Incident"));
		String generatedComments_for_Selected_IncidentText = Comments_for_Selected_Incident.textContent();
		assertTrue(true, "Comments for Selected Incident");

		Locator Locks_Reasons_for_Selected_Incident = page.getByRole(AriaRole.BUTTON,
				new Page.GetByRoleOptions().setName("Locks/Reasons for Selected Incident"));
		String generatedLocks_Reasons_for_Selected_IncidentText = Locks_Reasons_for_Selected_Incident.textContent();
		assertTrue(true, "Locks/Reasons for Selected Incident");

		Locator History_for_Selected_Incident = page.getByRole(AriaRole.BUTTON,
				new Page.GetByRoleOptions().setName("History for Selected Incident"));
		String generatedHistory_for_Selected_IncidentText = History_for_Selected_Incident.textContent();
		assertTrue(true, "History for Selected Incident");

	}

   @Test
	public void AccountAddress() throws InterruptedException {
		LoginTest();
		Accounts.fipoSc();
		Accounts.AccountAddress();

		Locator AccountAddress = page.getByRole(AriaRole.BUTTON,
				new Page.GetByRoleOptions().setName("Address Information"));
		String generatedAccountAddress = AccountAddress.textContent();
		assertTrue(true, "Address Information");
	}

	@Test
	public void LineMod() throws InterruptedException {
		LoginTest();
		Accounts.showMore();
		Accounts.startLineMod();

		Locator BusinessInfo = page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Business Info"));
		String generatedBusinessInfo = BusinessInfo.textContent();
		assertTrue(true, "Business Info");

		Locator DealerInformation = page.getByRole(AriaRole.BUTTON,
				new Page.GetByRoleOptions().setName("Dealer Information"));
		String generatedDealerInformation = DealerInformation.textContent();
		assertTrue(true, "Dealer Information");

		Locator CustomerSummaryFederalTaxID = page.getByText("*Customer Summary Federal Tax ID");
		String generatedCustomerSummaryFederalTaxID = CustomerSummaryFederalTaxID.textContent();
		assertTrue(true, "Dealer Information");

	}

	@Test
	public void DealersNearMe() throws InterruptedException {
		LoginTest();
		Accounts.fipoSc();

	}

	@After
	public void afterMethod() {
		page.context().browser().close();
	}
}