package com.ngc.pages;


import java.nio.file.Paths;
import java.util.regex.Pattern;

import com.microsoft.playwright.Frame;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.ngc.constants.Constants;

public class Accounts {

	private static Page page;
	private static Page page1;
	public static Leads leadspage;
	public static Accounts accountspage;
	// 1. String locators - object repository:

	

	// 2. page constructor:

	public Accounts(Page page) {
		this.page = page;
	}

	

	// 3. page actions/methods:
	
	public static void TillNextCRM() throws InterruptedException {
		
		 page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
	      page.getByLabel("Search by object type").click();
	      page.getByLabel("Search by object type").fill("people");
			page.getByLabel("Search by object type").press("Enter");
			
			page.getByPlaceholder("Search...").click();
		      page.getByPlaceholder("Search...").fill("Stephen Winbun");
			
			 page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Stephen Winbun User • Director of Business Development Center")).getByText("Stephen Winbun").click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("User Detail")).click();
		      Thread.sleep(6000);
		      page.getByPlaceholder("Quick Find").click();
		      page.getByPlaceholder("Quick Find").fill("Users");
		      page.keyboard().press("Enter");
		      leadspage.KeyActions();
		      Thread.sleep(3000);
		      page.keyboard().press("Enter");
		      Thread.sleep(4000);
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("App Launcher")).click();
		      Thread.sleep(3000);
		      page.getByPlaceholder("Search apps and items...").fill("crm");
		      Thread.sleep(1000);
		      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("NextGear Lightning CRM")).click();
		      Thread.sleep(1000);
	}
	
	public static void verifyFloorPlans() throws InterruptedException {
		
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Accounts")).click();
		Thread.sleep(3000);
	      page.getByText("Search...").click();
	      page.getByLabel("Search by object type").click();
			Thread.sleep(3000);
	      page.getByLabel("Search by object type").fill("accounts");
			page.getByLabel("Search by object type").press("Enter");
			
			page.getByPlaceholder("Search...").click();
			Thread.sleep(3000);
		      page.getByPlaceholder("Search...").fill("1 Auto Sales LLC");
				Thread.sleep(3000);
		      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Formula 1 Auto Sales LLC Account • (317) 555-0100")).getByText("Sales").click();
				Thread.sleep(3000);
		      Page page1 = page.waitForPopup(() -> {
		          page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Floorplans")).click();
		        });
				Thread.sleep(3000);
		        page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Floorplan Summary Detail")).click();
		      
		        page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Extension Detail")).click();
		        page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Audit Summary Detail")).click();
		   
//		        page1.getByText("Vehicle Identification Number (VIN)").click();
//		        page1.getByText("Vehicle Description").click();
		        
		        
		    	Locator FloorPlan =  page1.getByText("Vehicle Description");

				String vehDesc = FloorPlan.textContent();
				System.out.println(vehDesc);
			
				if(vehDesc.contentEquals("Vehicle Description")) {
					 page1.getByText("Vehicle Identification Number (VIN)").click();
					 page1.keyboard().press("ArrowDown");
					 page1.keyboard().press("Enter");
					 
				}
				else {
					
					
				}
		        
			
	   
	}

	public void verifyCreditDetailsHeaders() throws InterruptedException {
		
				
			  TillNextCRM();
		      page.keyboard().press("Escape");
		      Thread.sleep(1000);
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Accounts")).click();
		      Thread.sleep(1000);
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Diamond Dove Auto LLC")).click();
		      Thread.sleep(1000);
		      Page page1 = page.waitForPopup(() -> {
		          page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Credit Details")).click();
		        });
		        page1.getByText("Lines Of Credit").click();
		        page1.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Lines Of Credit")).getByText("Lines Of Credit").click();
		        page1.getByText("CTLien UCC Search Reports(US)").click();
		      
		    //  page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Credit Details")).click();
		      
		    
		      
		      //page.frameLocator("iframe[name=\"vfFrameId_1676794701549\"]").getByRole(AriaRole.HEADING, new FrameLocator.GetByRoleOptions().setName("Lines Of Credit")).click();

	      
		
	}
	
}