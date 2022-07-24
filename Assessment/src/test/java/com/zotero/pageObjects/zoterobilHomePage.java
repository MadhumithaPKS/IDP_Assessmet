package com.zotero.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zotero.utilities.CommonUtils;
import com.zotero.utilities.DriverUtils;

public class zoterobilHomePage extends CommonUtils{
	 
	public WebDriver driver;
	
	public zoterobilHomePage (WebDriver driver){
		
		 this.driver= driver;
		
		  PageFactory.initElements( driver, this);
		
	}
	
	
	@FindBy(xpath ="//h1[@class='brand']/a")
	
	public WebElement header;
	
	@FindBy(xpath = "//div[@class='input-group input']//input")
	
	public WebElement searchBox;
	
	@FindBy(xpath = "//button[contains(text(),'Cite')]")
	
	public WebElement searchButton;
	
	@FindBy(xpath = "//button[contains(text(),'Manual')]")
	
	WebElement ManualEntryButton;
	
	@FindBy(xpath = "//p[@class='text']")
	
	public WebElement errorMessage;
	
	@FindBy(xpath = "//button[@class='btn btn-icon close']")
	
	public WebElement closeButton;
	
	public boolean verifyHomePageLoaded() throws InterruptedException {
		Thread.sleep(3000);
		return verifyElementDisplayed(header);
		
	}
	
	public void enterSearchValue(String input) {
		sendkeys(searchBox, input);
	}
	
	public void clickOnCiteBtn() {
		clicker(searchButton);
	}
	
	public boolean isErrordisplayed() {
		return verifyElementDisplayed(errorMessage);
	}
	public void clickOnCloseBtn() {
		clicker(closeButton);
	}

}
