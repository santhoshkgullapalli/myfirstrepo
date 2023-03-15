package com.ngc.salesforceplaywright.playwrightngc.pages.salesforceLogin;


import com.microsoft.playwright.Page;
import com.ngc.salesforceplaywright.playwrightngc.TestController;
import com.ngc.salesforceplaywright.playwrightngc.enums.SalesforceMainLoginDetails;

import lombok.Data;

@Data
public class LoginPage {
  private Page page;

  private String testEnv = TestController.getTEST_ENV();
  private static final String USERNAMESELECTOR = "id=username";
  private static final String PASSWORDSELECTOR = "id=password";

  public LoginPage(Page page) {
      this.page = page;
  }
      public LoginPage enterUsername() {
        switch (testEnv.toLowerCase()) {
          case "devmark":
          page.fill(USERNAMESELECTOR, SalesforceMainLoginDetails.DEVMARK.getUsername());
          return this;
          case "devbill":
          page.fill(USERNAMESELECTOR, SalesforceMainLoginDetails.DEVBILL.getUsername());
          return this;
          case "sit":
          page.fill(USERNAMESELECTOR, SalesforceMainLoginDetails.QAAUTOSITLOGIN.getUsername());
          return this;
          case "uat":
          page.fill(USERNAMESELECTOR, SalesforceMainLoginDetails.QAAUTOUATLOGIN.getUsername());
          return this;
          default:
          return this;
        }
      }
    
      public LoginPage enterPassword() {
        switch (testEnv.toLowerCase()) {
          case "devmark":
          page.fill(PASSWORDSELECTOR, SalesforceMainLoginDetails.DEVMARK.getPassword());
          return this;
          case "devbill":
          page.fill(PASSWORDSELECTOR, SalesforceMainLoginDetails.DEVBILL.getPassword());
          return this;
          case "sit":
          page.fill(PASSWORDSELECTOR, SalesforceMainLoginDetails.QAAUTOSITLOGIN.getPassword());
          return this;
          case "uat":
          page.fill(PASSWORDSELECTOR, SalesforceMainLoginDetails.QAAUTOUATLOGIN.getPassword());
          return this;
          default:
          return this;
        }
      }
    
      public String getErrorMessage() {
        return page.locator(".error-message-container h3").textContent();
      }
      public void clickLogin() {
        page.click("id=Login");
      }
}
