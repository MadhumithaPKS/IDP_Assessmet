package com.zotero.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class CommonUtils extends DriverUtils{

	public boolean verifyElementDisplayed(WebElement ele) {
		System.out.println(ele);
	  return ele.isDisplayed();	
	}
	
	public void sendkeys(WebElement ele, String input) {
		ele.sendKeys(input);
	}
	
	public void clicker(WebElement ele) {
		ele.click();
	}
	}
