package com.TestNgActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LicensePage {

	//Find  ProductEdition on Licenses Page 
	@FindBy(xpath ="//b[text()='actiTIME 2017.4']")
	private WebElement productEdition;
	
	
	//Find IssueDate on Licenses Page
	@FindBy(xpath ="//td[contains(text(),'Jul 14, 2017')]")
	private WebElement issueDate;
	
	
	public LicensePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Verify ProductEdition is Displayed or not
	public void verifyProductEdition(String expectedProductEdition)
	{
		String actualProductEdition = productEdition.getText();
		Assert.assertEquals(actualProductEdition, expectedProductEdition);
		Reporter.log("Verification  of ProuctEdition is successful " , true);
	}
	
	
	//Verify IssueDate is Displayed or not
	public void verifyIssueDate(String expectedIssueDate)
	{
		String actualIssueDate = issueDate.getText();
		Assert.assertEquals(actualIssueDate, expectedIssueDate);
		Reporter.log("Verification of IssueDate is successful ",true);
	}


	
		
	}
	
	
	
	
	

