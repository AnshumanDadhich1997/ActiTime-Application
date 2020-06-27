package com.TestNgActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(xpath ="//div[text() ='TASKS']")
	private WebElement timetracktab;
	
	@FindBy(xpath ="//div[text() ='TASKS']")
	private WebElement tasks;
	
	@FindBy(xpath ="//div[text() ='REPORTS']")
	private WebElement reports;
	
	@FindBy(xpath ="//div[text() ='USERS']")
	private WebElement users;
	
	@FindBy(xpath ="//div[contains(text() , 'Settings')]")
	private WebElement settings;
	
	@FindBy(xpath ="//div[contains(text() , 'Add-on')]")
	private WebElement addons;
	
	@FindBy(xpath ="//div[contains(text() , 'Help')]")
	private WebElement help;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath ="//a[text()='Licenses']")
	private WebElement licenses;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickTimeTrackTab()
	{
		timetracktab.click();
	}
	
	public void clickTasks()
	{
		tasks.click();
	}
	
	public void clickReports()
	{
		reports.click();
	}
	
	public void clickUsers()
	{
		users.click();
	}
	
	public void clickSettings()
	{
		settings.click();
	}
	
	
	public void clickAddOns()
	{
		addons.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	
	public void clickLicenses()
	{
		licenses.click();
	}
 
	
	
	

}
