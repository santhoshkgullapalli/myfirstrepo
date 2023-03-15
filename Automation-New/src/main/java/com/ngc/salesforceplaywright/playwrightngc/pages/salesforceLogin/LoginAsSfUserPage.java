package com.ngc.salesforceplaywright.playwrightngc.pages.salesforceLogin;

import com.microsoft.playwright.Page;

public class LoginAsSfUserPage{
  private Page page;

  public LoginAsSfUserPage(Page page) {
      this.page = page;
  }
    
      public LoginAsSfUserPage searchForSfUserName(String sfUserName) {
        page.locator("#phSearchInput").fill(sfUserName);
        page.locator("#phSearchButton").click();
        page.pause();
        page.locator(String.format("#User_body >> text=%s",sfUserName)).click();
        page.navigate(page.url());
        return this;
      }
      public LoginAsSfUserPage loginAsSfUser() {
        page.locator("#moderatorMutton").click();
        page.locator("#USER_DETAIL").click();
        page.locator("text=User Detail Edit Sharing Reset Password Login Freeze >> input[name=\"login\"]").click();
        page.navigate(page.url());
        return this;
      }
    
      public String getErrorMessage() {
        return page.locator(".error-message-container h3").textContent();
      }
}
