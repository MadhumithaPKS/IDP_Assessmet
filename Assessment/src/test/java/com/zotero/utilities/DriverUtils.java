package com.zotero.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.zotero.pageObjects.zoterobilHomePage;

public class DriverUtils {
	public WebDriver driver;
	
 @BeforeTest
	 public void setup() {
	 System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://zbib.org");
	 }

	public void screenshot(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = "./Assessment/Screenshot/"+"Screenshot.png";
		File trg = new File(path);
		FileHandler.copy(src, trg);
	}
    public WebDriver getDriver() {
        return driver;
    }
 
 @AfterTest
public void quitDriver() {
	driver.quit();
}
 
}
