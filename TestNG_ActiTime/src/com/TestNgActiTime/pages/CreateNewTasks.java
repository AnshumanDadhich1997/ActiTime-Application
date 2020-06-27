package com.TestNgActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTasks {
	
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder' and @ placeholder='Enter task name'])[1]")
	private WebElement  EntrTskName;
	 
	
	@FindBy(xpath ="//span[text() ='Create Tasks']")
	private WebElement CreateTask;
	
	
	
	public CreateNewTasks(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterTaskName(String str)
	{
		EntrTskName.sendKeys(str);
	}
	
	
	public void clickCreateTask()
	{
		CreateTask.click();
	}
			 

}
