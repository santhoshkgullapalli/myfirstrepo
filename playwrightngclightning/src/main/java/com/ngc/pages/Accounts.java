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
		  	leadspage.waitPageToFinish(page);
		    //  Thread.sleep(6000);
		      page.getByPlaceholder("Quick Find").click();
		      page.getByPlaceholder("Quick Find").fill("Users");
		      page.keyboard().press("Enter");
		      leadspage.KeyActions();
		      leadspage.waitPageToFinish(page);
		    //  Thread.sleep(3000);
		      page.keyboard().press("Enter");
		      leadspage.waitPageToFinish(page);
		      Thread.sleep(4000);
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("App Launcher")).click();
		      leadspage.waitPageToFinish(page);
		      Thread.sleep(3000);
		      page.getByPlaceholder("Search apps and items...").fill("crm");
		      leadspage.waitPageToFinish(page);
		   //   Thread.sleep(1000);
		      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("NextGear Lightning CRM")).click();
		   //   leadspage.waitPageToFinish(page); 
		      Thread.sleep(1000);
	}
	
	
	public static void fipoSc() throws InterruptedException {
		
		 page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
	      page.getByLabel("Search by object type").click();
	      page.getByLabel("Search by object type").fill("people");
			page.getByLabel("Search by object type").press("Enter");
			
			page.getByPlaceholder("Search...").click();
		      page.getByPlaceholder("Search...").fill("Jeffrey Audette");
			
		      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Jeffrey Audette User • Regional Director")).getByText("Jeffrey Audette").click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("User Detail")).click();
		  //    leadspage.waitPageToFinish(page);
		      Thread.sleep(6000);
		      page.getByPlaceholder("Quick Find").click();
		      page.getByPlaceholder("Quick Find").fill("Users");
		      page.keyboard().press("Enter");
		      leadspage.KeyActions();
		   //   leadspage.waitPageToFinish(page);
		      Thread.sleep(3000);
		      page.keyboard().press("Enter");
		 //     leadspage.waitPageToFinish(page);
		      Thread.sleep(4000);
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("App Launcher")).click();
		  //    leadspage.waitPageToFinish(page);
		      Thread.sleep(3000);
		      page.getByPlaceholder("Search apps and items...").fill("crm");
		 //     leadspage.waitPageToFinish(page);
		      Thread.sleep(1000);
		      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("NextGear Lightning CRM")).click();
		  //    leadspage.waitPageToFinish(page);
		      Thread.sleep(1000);
	}
	
	public static void verifyFloorPlans() throws InterruptedException {
		
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Accounts")).click();
		// leadspage.waitPageToFinish(page); 
		Thread.sleep(3000);
	      page.getByText("Search...").click();
	      page.getByLabel("Search by object type").click();
	   //   leadspage.waitPageToFinish(page); 
			Thread.sleep(3000);
	      page.getByLabel("Search by object type").fill("accounts");
			page.getByLabel("Search by object type").press("Enter");
			
			page.getByPlaceholder("Search...").click();
		//	 leadspage.waitPageToFinish(page); 
			Thread.sleep(3000);
		      page.getByPlaceholder("Search...").fill("1 Auto Sales LLC");
		 //     leadspage.waitPageToFinish(page); 
				Thread.sleep(3000);
		      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Formula 1 Auto Sales LLC Account • (317) 555-0100")).getByText("Sales").click();
		   //   leadspage.waitPageToFinish(page); 
				Thread.sleep(3000);
		      Page page1 = page.waitForPopup(() -> {
		          page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Floorplans")).click();
		        });
		  //    leadspage.waitPageToFinish(page); 
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
	
	
	public static void verifyNSP() throws InterruptedException {
		 page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
	      page.getByLabel("Search by object type").click();
	      page.getByLabel("Search by object type").fill("people");
			page.getByLabel("Search by object type").press("Enter");
			
			page.getByPlaceholder("Search...").click();
		      page.getByPlaceholder("Search...").fill("yolland homer");
		      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Yoland Homer User • Sr. Client Solutions Executive")).getByText("Homer").click();
		     
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("User Detail")).click();
		  //    leadspage.waitPageToFinish(page);
		      Thread.sleep(6000);
		      page.getByPlaceholder("Quick Find").click();
		      page.getByPlaceholder("Quick Find").fill("Users");
		      page.keyboard().press("Enter");
		      leadspage.KeyActions();
		   //   leadspage.waitPageToFinish(page);
		      Thread.sleep(3000);
		      page.keyboard().press("Enter");
		 //     leadspage.waitPageToFinish(page);
		      Thread.sleep(4000);
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("App Launcher")).click();
		  //    leadspage.waitPageToFinish(page);
		      Thread.sleep(3000);
		      page.getByPlaceholder("Search apps and items...").fill("crm");
		 //     leadspage.waitPageToFinish(page);
		      Thread.sleep(1000);
		      page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("NextGear Lightning CRM")).click();
		  //    leadspage.waitPageToFinish(page);
		      Thread.sleep(1000);
	}
	
	public static void verifyFPSc() throws InterruptedException {
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Accounts")).click();
	//	leadspage.waitPageToFinish(page);
		Thread.sleep(3000);
	      page.getByText("Search...").click();
	      page.getByLabel("Search by object type").click();
	//  	leadspage.waitPageToFinish(page);
			Thread.sleep(3000);
	      page.getByLabel("Search by object type").fill("accounts");
			page.getByLabel("Search by object type").press("Enter");
			
			page.getByPlaceholder("Search...").click();
		//	leadspage.waitPageToFinish(page);
			Thread.sleep(3000);
			 page.getByPlaceholder("Search...").fill("R.C. Automotive Service");
			//	leadspage.waitPageToFinish(page);
				Thread.sleep(3000);
			page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("R.C. Automotive Service & Sales, LLC Account • (317) 555-0100")).getByText("R.C. Automotive Service & Sales, LLC").click();
			
			 page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Dealer Alerts (10+)")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("FICO Score Change")).click();
		      
	}
	
	public static void verifyPMSI() throws InterruptedException {
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Accounts")).click();
	//	leadspage.waitPageToFinish(page);
		Thread.sleep(3000);
	      page.getByText("Search...").click();
	      page.getByLabel("Search by object type").click();
	//  	leadspage.waitPageToFinish(page);
			Thread.sleep(3000);
	      page.getByLabel("Search by object type").fill("accounts");
			page.getByLabel("Search by object type").press("Enter");
			
			page.getByPlaceholder("Search...").click();
		//	leadspage.waitPageToFinish(page);
			Thread.sleep(3000);
			 page.getByPlaceholder("Search...").fill("R.C. Automotive Service");
			//	leadspage.waitPageToFinish(page);
				Thread.sleep(3000);
			page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("R.C. Automotive Service & Sales, LLC Account • (317) 555-0100")).getByText("R.C. Automotive Service & Sales, LLC").click();
			 page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Dealer Alerts (10+)")).click();
			 
		      page.navigate("https://nextgearcapital--sit.sandbox.lightning.force.com/lightning/cmp/c__PMSILightningWrapper?c__recordId=0011P000017c3LcQAI&c__recordLocalId=a027g000007RP4aAAG");
		      page.navigate("https://nextgearcapital--sit.sandbox.lightning.force.com/one/one.app#eyJjb21wb25lbnREZWYiOiJjOnBNU0lEZXRhaWxzTFdDIiwiYXR0cmlidXRlcyI6eyJyZWNvcmRJZCI6IjEzNTkxOSJ9LCJzdGF0ZSI6e319");
		      page.getByRole(AriaRole.GRIDCELL, new Page.GetByRoleOptions().setName("View")).getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("View")).click();
		     Thread.sleep(6000);
		      page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("Page 1 of 1, PMSITestdoc.pdf")).click();
			 
	}
	
	public static void collectionNotice() throws InterruptedException {
		
		 page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Accounts")).click();
		 Thread.sleep(3000);
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Wes's Auto Sales LLC")).click();
	      Thread.sleep(3000);
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Dealer Alerts (5)")).click();
	      Thread.sleep(3000);
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Collection Notice")).click();
	      Thread.sleep(3000);
	      page.navigate("https://nextgearcapital--sit.sandbox.lightning.force.com/lightning/cmp/c__CollectionIncidentDetailsAura?c__recordId=0011P000019E7x9QAC&c__recordLocalId=a027g000007RZVcAAO");
	    //  page.getByRole(AriaRole.PARAGRAPH).filter(new Locator.LocatorOptions().setHasText("Business Number")).click();
	      Thread.sleep(3000);
	      page.getByRole(AriaRole.COLUMNHEADER, new Page.GetByRoleOptions().setName("Decision")).getByText("Decision").click();
	      Thread.sleep(3000);
	      page.getByRole(AriaRole.COLUMNHEADER, new Page.GetByRoleOptions().setName("Method")).getByText("Method").click();
	      page.getByRole(AriaRole.COLUMNHEADER, new Page.GetByRoleOptions().setName("Status")).getByText("Status").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Comments for Selected Incident")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Comments for Selected Incident")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Locks/Reasons for Selected Incident")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("History for Selected Incident")).click();
	 
	}
	
	public static void AccountAddress() throws InterruptedException {
		
		 page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Accounts")).click();
		 Thread.sleep(3000);
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("King of The Road Auto Sales, Inc.")).click();
	 	 Thread.sleep(3000);
	      page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Details")).click();
	 	 Thread.sleep(3000);
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Address Information")).click();
	 	 Thread.sleep(3000);
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Account Addresses")).click();
	 	 Thread.sleep(3000);
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Account Addresses")).click();
	 	 Thread.sleep(3000);
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Account Addresses")).press("Tab");
	      page.keyboard().press("Enter");
	 	 Thread.sleep(3000);
	 	page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Address Information")).click();

	      
	}

	public void verifyCreditDetailsHeaders() throws InterruptedException {
		
				
			  TillNextCRM();
		      page.keyboard().press("Escape");
			  	leadspage.waitPageToFinish(page);
		    //  Thread.sleep(1000);
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Accounts")).click();
			  	leadspage.waitPageToFinish(page);
		   //   Thread.sleep(1000);
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Diamond Dove Auto LLC")).click();
			  	leadspage.waitPageToFinish(page);
		    //  Thread.sleep(1000);
		      Page page1 = page.waitForPopup(() -> {
		          page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Credit Details")).click();
		        });
		        page1.getByText("Lines Of Credit").click();
		        page1.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Lines Of Credit")).getByText("Lines Of Credit").click();
		        page1.getByText("CTLien UCC Search Reports(US)").click();
		      
		    //  page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Credit Details")).click();
		      
		    
		      
		      //page.frameLocator("iframe[name=\"vfFrameId_1676794701549\"]").getByRole(AriaRole.HEADING, new FrameLocator.GetByRoleOptions().setName("Lines Of Credit")).click();

	      
		
	}
	
	public static void PMSIChecking() throws InterruptedException {
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Accounts")).click();
	//	leadspage.waitPageToFinish(page);
		Thread.sleep(3000);
	      page.getByText("Search...").click();
	      page.getByLabel("Search by object type").click();
	//  	leadspage.waitPageToFinish(page);
			Thread.sleep(3000);
	      page.getByLabel("Search by object type").fill("accounts");
			page.getByLabel("Search by object type").press("Enter");
			
			page.getByPlaceholder("Search...").click();
		//	leadspage.waitPageToFinish(page);
			Thread.sleep(3000);
			 page.getByPlaceholder("Search...").fill("R.C. Automotive Service");
			//	leadspage.waitPageToFinish(page);
				Thread.sleep(3000);
			page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("R.C. Automotive Service & Sales, LLC Account • (317) 555-0100")).getByText("R.C. Automotive Service & Sales, LLC").click();
			 page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Dealer Alerts (10+)")).click();
	
			  page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("TestNSF")).click();
		      page.navigate("https://nextgearcapital--sit.sandbox.lightning.force.com/lightning/cmp/c__NSFDetLightningWrapper?c__recordId=0011P000017c3LcQAI&c__recordLocalId=a027g000007RPtlAAG");
		      page.getByText("warninginfo icon No NSF Comments for Business: 135919").click();
		      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Name")).click();
		      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Alert Date")).click();
		      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Alert Type")).click();
		      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Description")).click();
		      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Account")).click();
			 
			 
	}
}