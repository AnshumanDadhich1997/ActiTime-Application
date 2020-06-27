package com.TestNgActiTime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtils extends BaseTest {
	
	public static void waitForTitleContains(WebDriver driver , String title)
	{
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public static void waitForElementPresesnt(WebDriver driver , WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,ETO);
		wait.until(ExpectedConditions.visibilityOf(element));
				
	}
	
	

}
