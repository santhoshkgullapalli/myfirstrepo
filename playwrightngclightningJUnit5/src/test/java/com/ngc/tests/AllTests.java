package com.ngc.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.testng.annotations.AfterSuite;

import com.microsoft.playwright.Page;

@RunWith(Suite.class)
@SuiteClasses({ AccountsTest.class, LeadsTest.class })
public class AllTests {

	public static Page page;

	@AfterSuite
	public void afterMethod() {
		page.context().browser().close();
	}

}
