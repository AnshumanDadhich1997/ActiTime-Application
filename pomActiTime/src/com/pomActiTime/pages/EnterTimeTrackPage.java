package com.pomActiTime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * 
 * @author Anshuman
 *
 */

public class EnterTimeTrackPage  extends LoginPage{
	
	
	
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
		
	}

	//Find the AddtaskbyName and Add the input in the textbox
	public void addTaskByName(String atbn)
	{
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(atbn);
		  
	}
	
	//find the viewTimeTrack link and click on it
	public void viewTimeTrack()
	{
		WebElement vTT = driver.findElement(By.xpath("//a[contains(text(),'View Time-Track')]"));
		vTT.click();
		
	}
	
	//Find the Settings and click on it
	public void settings()
	{
		WebElement set = driver.findElement(By.xpath("(//div[contains(text(),'Settings')])[1]"));
		set.click();
	}
	
	//Find the license link and click on it
	public void license()
	{
		WebElement lic = driver.findElement(By.xpath("//a[text()='Licenses']"));
		lic.click();
	}
	
}
