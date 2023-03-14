package com.ngc.tests;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.nio.file.Paths;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
	

	@BeforeMethod
	public void Setup() {
		
		pf=new PlayWrightFactory();
		page=pf.initBrowser("chromium");
		leadspage = new Leads(page);
		accountspage = new Accounts(page);
	}
	

	public void LoginTest() {
		
		leadspage.LoginDetails();
		
	}
	
//	@Test(priority=1)
	public void noDuplicateFlexMsg() throws InterruptedException {
		LoginTest();
		leadspage.Leads();
	
	}
	
//	@Test(priority=2)
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
	
	//@Test(priority=3)
	public void VerifyEmail() throws InterruptedException {
		DuplicatesFlexMsg();
		leadspage.EmailVerification();
		
	}
	
//	@Test(priority=4)
	public void E2E() throws InterruptedException {
		
		LoginTest();
		leadspage.e2e();
			
	}
	
//	@Test(priority=5)
	public void EditAppBtn() throws InterruptedException {
		
		LoginTest();
		
		leadspage.verifyEditApp();
	}
	
	@Test(priority=7)
	public void BusinessName() throws InterruptedException {
		
		LoginTest();
		Accounts.TillNextCRM();
		leadspage.Businesss();
	}
	
	@AfterMethod
	public void afterMethod() {
		page.context().browser().close();
	}
	
	
}
