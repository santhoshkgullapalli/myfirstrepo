package com.ngc.factory;


import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class AccountsPage {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://nextgearcapital--sit.sandbox.my.salesforce.com/visualforce/session?url=https%3A%2F%2Fnextgearcapital--sit.sandbox.lightning.force.com%2Flightning%2Fpage%2Fhome");
      page.navigate("https://nextgearcapital--sit.sandbox.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fnextgearcapital--sit.sandbox.lightning.force.com%252Flightning%252Fpage%252Fhome");
      page.getByLabel("Username").click();
      page.getByLabel("Username").fill("santhosh.gullapalli@coxautoinc.com.ngc.sit");
      page.getByLabel("Password").click();
      page.getByLabel("Password").fill("December1");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In to Sandbox")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Leads")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Test Duplicate 1")).click();
      assertThat(page.getByText("It looks as if duplicates exist for this Lead. View Duplicates")).hasText("It looks as if duplicates exist for this Lead. View Duplicates");
      //page.getByText("It looks as if duplicates exist for this Lead. View Duplicates").click();
      System.out.println("First Duplicate Message Pass");
      assertThat(page.getByText("We found 2 potential duplicates of this Lead.")).hasText("We found 2 potential duplicates of this Lead.");
      //page.getByText("We found 2 potential duplicates of this Lead.").click();
      
		/*
		 * page.getByRole(AriaRole.LINK, new
		 * Page.GetByRoleOptions().setName("July5th Bhooma")).click();
		 * page.getByRole(AriaRole.BUTTON, new
		 * Page.GetByRoleOptions().setName("Show more actions")).click();
		 * page.getByRole(AriaRole.MENUITEM, new
		 * Page.GetByRoleOptions().setName("Dealer Application")).click();
		 */
      
		/* ================Classic View Code============== */
      
      /*page.navigate("https://test.salesforce.com/");
      page.getByLabel("Username").click();
      page.getByLabel("Username").fill("santhosh.gullapalli@coxautoinc.com.ngc.sit");
      page.getByLabel("Password").click();
      page.getByLabel("Password").fill("December1");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In to Sandbox")).click();
      page.navigate("https://nextgearcapital--sit.sandbox.my.salesforce.com/00Q/o");
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Bhooma, July5th")).click();
      page.navigate("https://nextgearcapital--sit--c.sandbox.vf.force.com/apex/LeadApplicationButton?id=00Q7g000008JAii");
      page.navigate("https://nextgearcapital--sit--c.sandbox.vf.force.com/apex/ValidateDealerApplication?id=a1z7g000002710i&sfdc.override=1");
      page.navigate("https://nextgearcapital--sit.sandbox.my.salesforce.com/a1z7g000002710iAAA?nooverride=1");*/
    }
  }
}