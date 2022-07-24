package com.zotero.testCases;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zotero.pageObjects.zoterobilHomePage;
import com.zotero.utilities.DriverUtils;

import Logs.Log;

public class VerifySearchResult extends DriverUtils {
	public zoterobilHomePage zhome;
	public VerifySearchResult() {
		this.driver = driver;
	}
	@BeforeMethod
    public void initialize() {
    	zhome = new zoterobilHomePage(driver);
    }
	@Test(priority = 0, description = "Invalid Login Scenario with wrong username and password.")
	public VerifySearchResult verifyHomePagelaunched() throws InterruptedException {
		Log.info("Verifying home page is loaded successfully");
		boolean flag = zhome.verifyHomePageLoaded();
		
		assertTrue(flag);
		return this;
		
	}
	@Test(priority = 1)
	public VerifySearchResult searchItem() {
		Log.info("Entering value in search box");
		zhome.enterSearchValue("Books");
		Log.info("Clicking on Cite button");
		zhome.clickOnCiteBtn();	
		return this;
	}
	
	@Test(priority = 2)
	public VerifySearchResult verifySearchResult() {
		Log.info("Verifying search result");
		if(zhome.isErrordisplayed()) {
		assertTrue(zhome.isErrordisplayed());
		Log.info("No result found error message is displayed");
		}
		zhome.clickOnCloseBtn();
		return this;
	}
}
