package com.TestNgActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage {
	
	@FindBy(id ="customerLightBox_nameField")
	private WebElement enterCustomerNameTB;
	
	
	@FindBy(id ="customerLightBox_descriptionField")
	private WebElement addCustDescTB;
	
	@FindBy(id="customerLightBox_commitBtn")
	private WebElement createCustomer;
	
	
	public CreateNewCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterCustomerName(String s)
	{
		enterCustomerNameTB.sendKeys(s);
	}
	
	public void enterAddCustomerDesc(String s1)
	{
		addCustDescTB.sendKeys(s1);
	}
	
	
	public void clickCreateCustomer()
	{
		createCustomer.click();
	}
	 

}
