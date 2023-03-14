package com.ngc.pages;

import java.nio.file.Paths;
import java.util.Random;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;
import com.ngc.constants.Constants;

public class Leads {

	private static Page page;

	private String username = "Username";
	private String password = "Password";
	private String loginBtn = "Log In to Sandbox";

	private String searchBar = "Search";
	private String searching = "Search by object type";
	private String Leadsname = "Leads";
	private String User1 = "Mark Adams";

	public static String randomString;

	public static int number;

	public static String numberConverted;
	public static int x = 4;

	public Leads(Page page) {
		this.page = page;
	}

	public void LoginDetails() {

		page.getByLabel(username).click();

		page.getByLabel(username).fill(Constants.EMAIL_ID);

		page.getByLabel(password).click();

		page.getByLabel(password).fill(Constants.LOGIN_PASSWORD);

		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(loginBtn)).click();

	}

	public static void waitPageToFinish(Page page) {
		page.waitForLoadState(LoadState.DOMCONTENTLOADED);
		page.waitForLoadState(LoadState.NETWORKIDLE);
		page.waitForLoadState(LoadState.LOAD);
	}

	public void Leads() throws InterruptedException {
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(searchBar)).click();
		page.getByLabel("Search by object type").click();
		page.getByLabel("Search by object type").fill("leads");
		page.getByLabel("Search by object type").press("ArrowDown");
		page.getByLabel("Search by object type").press("Enter");
		waitPageToFinish(page);

		page.getByPlaceholder("Search...").click();
		page.getByPlaceholder("Search...").fill("mark adams");
		waitPageToFinish(page);

		page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Mark Adams Lead • Auto World of Cabot"))
				.getByText("Mark Adams").click();

	}

	public void DuplicateLeads() throws InterruptedException {
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
		waitPageToFinish(page);

		page.getByLabel("Search by object type").click();
		page.getByLabel("Search by object type").fill("leads");
		page.getByLabel("Search by object type").press("Enter");
		page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Test Duplicate 1 Lead • Auto Market"))
				.getByText("Test Duplicate 1").click();

	}

	public void EmailVerification() throws InterruptedException {
		waitPageToFinish(page);
		Thread.sleep(3000);
		page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Activity")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Email")).click();
		waitPageToFinish(page);

		page.screenshot(new Page.ScreenshotOptions()
				.setPath(Paths
						.get("C:\\Users\\user\\ngc-lightning-frameowrk-playwright\\artifact\\target\\screenshot.png"))
				.setFullPage(true));
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Email Minimize Maximize Close"))
				.getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Close")).click();

	}

	public static void KeyActions() throws InterruptedException {
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		Thread.sleep(1000);
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");
		page.keyboard().press("Tab");

	}

	public void e2e() throws InterruptedException {

		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
		page.getByLabel("Search by object type").click();
		page.getByLabel("Search by object type").fill("people");
		page.getByLabel("Search by object type").press("Enter");
		waitPageToFinish(page);

		page.getByPlaceholder("Search...").click();
		page.getByPlaceholder("Search...").fill("Tracy Whitaker");

		page.getByRole(AriaRole.OPTION,
				new Page.GetByRoleOptions().setName("Tracy Whitaker User • Manager Inside Business Development"))
				.getByText("Tracy Whitaker").click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("User Detail")).click();
		waitPageToFinish(page);

		page.getByPlaceholder("Quick Find").click();
		page.getByPlaceholder("Quick Find").fill("Users");
		page.keyboard().press("Enter");
		KeyActions();
		page.keyboard().press("Enter");

		waitPageToFinish(page);

		page.locator("//a[@title='Leads']").click();
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Adam Dold")).click();
		page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Activity")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Email")).click();
		waitPageToFinish(page);

		page.screenshot(new Page.ScreenshotOptions()
				.setPath(Paths
						.get("C:\\Users\\user\\ngc-lightning-frameowrk-playwright\\artifact\\target\\screenshot.png"))
				.setFullPage(true));
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();

	}

	public void UserDetail() throws InterruptedException {
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
		page.getByLabel("Search by object type").click();

		page.getByLabel("Search by object type").fill("people");
		page.getByLabel("Search by object type").press("Enter");

		page.getByRole(AriaRole.OPTION,
				new Page.GetByRoleOptions().setName("Tracy Whitaker User • Manager Inside Business Development"))
				.getByText("Tracy Whitaker").click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("User Detail")).click();
		page.navigate(
				"https://nextgearcapital--sit.sandbox.lightning.force.com/one/one.app#eyJjb21wb25lbnREZWYiOiJvbmU6YWxvaGFQYWdlIiwiYXR0cmlidXRlcyI6eyJhZGRyZXNzIjoiL3NlcnZsZXQvc2VydmxldC5zdT9vaWQ9MDBEN2cwMDAwMDA1QktmJnN1b3JnYWRtaW5pZD0wMDUxYTAwMDAwMGpjdWwmcmV0VVJMPSUyRjAwNTFhMDAwMDAwamN1bEFBQSUzRm5vcmVkaXJlY3QlM0QxJTI2aXNVc2VyRW50aXR5T3ZlcnJpZGUlM0QxJTI2YXBwTGF5b3V0JTNEc2V0dXAlMjZ0b3VyJTNEJTI2aXNkdHAlM0RwMSUyNnNmZGNJRnJhbWVPcmlnaW4lM0RodHRwcyUyNTNBJTI1MkYlMjUyRm5leHRnZWFyY2FwaXRhbC0tc2l0LnNhbmRib3gubGlnaHRuaW5nLmZvcmNlLmNvbSUyNnNmZGNJRnJhbWVIb3N0JTNEd2ViJTI2bm9uY2UlM0Q0Y2Y3MTBkYTkzMTZkNjMxNjMyZGYzNTNhNTk0MmVmYTMyZjBmN2NiZTgyMDU4NGI2MGE5NDg3NDkyYzk1N2I5JTI2bHRuX2FwcF9pZCUzRDA2bTdnMDAwMDAwUGJsOUFBQyUyNmNsYyUzRDEmdGFyZ2V0VVJMPSUyRmhvbWUlMkZob21lLmpzcCJ9LCJzdGF0ZSI6e319");
		page.navigate(
				"https://nextgearcapital--sit.sandbox.lightning.force.com/secur/deleteSessionCookie.jsp?retURL=%2Fone%2Fone.app");
		page.navigate("https://nextgearcapital--sit.sandbox.lightning.force.com/one/one.app");
		page.navigate("https://nextgearcapital--sit.sandbox.lightning.force.com/lightning/page/home");
		Thread.sleep(3000);

		page.locator("//a[@title='Leads']").click();

	}

	public void EditApplication() {
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Adam Dold")).click();
		page.locator("runtime_platform_actions-actions-ribbon")
				.getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Show more actions")).click();
		page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Dealer Application")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit Application")).isEnabled();

	}

	public void RandomString() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 7;
		for (int i = 0; i < length; i++) {

			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}
		randomString = sb.toString();
		System.out.println("randomString:" + randomString);

	}

	public void RandomNumber() {

		Random randommob = new Random();
		number = randommob.nextInt() + 1;
		System.out.println("Generated number is:" + number);

	}

	public void RandomPhoneNumber() {
		Random randomph = new Random();
		x = randomph.nextInt() + 1;
		System.out.println("randomphone is:" + x);

	}

	public void Businesss() throws InterruptedException {

		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Leads")).click();

		Thread.sleep(3000);
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("New")).click();

		Thread.sleep(3000);
		page.getByLabel("*Business Name").click();

		Thread.sleep(3000);

		RandomString();

		page.getByLabel("*Business Name").fill("Test Lead " + randomString);

		page.getByLabel("*Phone").click();
		waitPageToFinish(page);

		RandomNumber();
		numberConverted = Integer.toString(number);
		page.getByLabel("*Phone").fill(Integer.toString(x) + numberConverted);
		System.out.println("Send number is :" + Integer.toString(x) + numberConverted);
		waitPageToFinish(page);

		page.locator("button[name=\"SaveEdit\"]").click();

	}

	public void verifyEditApp() throws InterruptedException {
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
		page.getByLabel("Search by object type").click();

		page.getByLabel("Search by object type").fill("people");
		page.getByLabel("Search by object type").press("Enter");
		waitPageToFinish(page);

		page.getByPlaceholder("Search...").click();
		page.getByPlaceholder("Search...").fill("Tracy Whitaker");

		page.getByRole(AriaRole.OPTION,
				new Page.GetByRoleOptions().setName("Tracy Whitaker User • Manager Inside Business Development"))
				.getByText("Tracy Whitaker").click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("User Detail")).click();
		page.getByPlaceholder("Quick Find").click();
		page.getByPlaceholder("Quick Find").fill("Users");
		page.keyboard().press("Enter");
		waitPageToFinish(page);
		KeyActions();
		page.keyboard().press("Shift+Tab");
		page.keyboard().press("Shift+Tab");
		page.keyboard().press("Shift+Tab");
		waitPageToFinish(page);
		page.keyboard().press("Enter");
		waitPageToFinish(page);
		page.locator("//a[@title='Leads']").click();

		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Adam Dold")).click();
		waitPageToFinish(page);

		page.locator("button[name=\"Lead\\.Application\"]").click();

	}

}
