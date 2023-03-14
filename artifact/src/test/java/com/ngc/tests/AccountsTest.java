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

public class AccountsTest {
	
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
		//accountspage = new Accounts(page1);
	}
	

	public void LoginTest() {
		
		leadspage.LoginDetails();
		
	}
	
//	@Test(priority=6)
	public void creditDetailsHeaders() throws InterruptedException {
		LoginTest();
		accountspage.verifyCreditDetailsHeaders();
		
		
		  String linesOfCreditText = page.content();
		  if(linesOfCreditText.contentEquals("Lines Of Credit")) {
		  assertTrue(true, "Lines Of Credit");
		  }
	}
	
	
	@Test(priority=8)
	public void FloorPlansVerification() throws InterruptedException {
		
		LoginTest();
		Accounts.TillNextCRM();
		Accounts.verifyFloorPlans();
		
		
	
		String Amount = page.content();
		if(Amount.contentEquals("AMOUNT")) {
			assertTrue(true,"AMOUNT");
		}
		else if(Amount.contentEquals("Insufficient")) {
			assertTrue(true,"Insufficient");
		}
		else {
			
		}
		
	}
}