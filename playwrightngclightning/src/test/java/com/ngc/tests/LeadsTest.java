package com.ngc.tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterTest;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.ngc.factory.PlayWrightFactory;
import com.ngc.pages.Accounts;
import com.ngc.pages.Leads;




public class LeadsTest {
	
	public static PlayWrightFactory pf;
	public static Page page;
	public static Leads leadspage;
	public static Accounts accountspage;
	

	@Before
	public void Setup() {
		
		pf=new PlayWrightFactory();
		page=pf.initBrowser("chromium");
		leadspage = new Leads(page);
		accountspage = new Accounts(page);
	}
	

	public void LoginTest() {
		
		leadspage.LoginDetails();
		
	}
	
//	@Test
	public void noDuplicateFlexMsg() throws InterruptedException {
		LoginTest();
		leadspage.Leads();
	
	}
	
//	@Test
	public void DuplicatesFlexMsg() throws InterruptedException {
		
		noDuplicateFlexMsg();
		leadspage.DuplicateLeads();
	
		Locator source = page.locator("//span[contains(@title,'potential duplicates of this Lead')]");
		String text = source.textContent();
		System.out.println(text);
	
		if(text.contentEquals("We found no potential duplicates of this Lead.")) {
			assertFalse(false, "It looks as if duplicates exist for this Lead. View Duplicates");
		}
		else {
			Locator notifier = page.locator("//span[contains(@class,'toastMessage slds-text-heading--small forceActionsText')]");
			String notifierText = notifier.textContent();
			assertTrue(true,"It looks as if duplicates exist for this Lead. View Duplicates");	
			
		}
	}
	
//	@Test
	public void VerifyEmail() throws InterruptedException {
		DuplicatesFlexMsg();
		leadspage.EmailVerification();
		
	}
	
	@Test
	public void E2E() throws InterruptedException {
		
		LoginTest();
		leadspage.e2e();
			
	}
	
//	@Test
	public void EditAppBtn() throws InterruptedException {
		
		LoginTest();
		
		leadspage.verifyEditApp();
	}
	
	//@Test
	public void BusinessName() throws InterruptedException {
		
		LoginTest();
		Accounts.TillNextCRM();
		leadspage.Businesss();
	}
	
	@After
	public void afterMethod() {
		page.context().browser().close();
	}
	
	
}
