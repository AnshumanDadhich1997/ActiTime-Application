package com.TestNgActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	
	//Find AddNew Button on TaskPage
	@FindBy(xpath="//div[text()='Add New']/parent::div[@class ='addNewButton']")
	private WebElement addNew;
	
	
	//Find NewCustomer Button on TaskPage
	@FindBy(xpath ="//div[text()='+ New Customer'][@class ='item createNewCustomer ellipsis']")
	private WebElement newCustomer;
	
	
	//Find NewProject Button on TaskPage
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProject;
	
	
	//Find AddNewTask Button on TaskPage
	@FindBy(xpath ="//div[text()='Add New Task']")
	private WebElement addNewTask;
	
	
	//Find CreateNewTask Button on TaskPage
	@FindBy(xpath ="//div[text()='Create new tasks']")
	private WebElement createNewTask;
	 
	//Find ImportTaskFromCsv Button on TaskPage
	@FindBy(xpath ="//div[text()='Import tasks from CSV']")
	private WebElement importtaskfromCsv;
	
	
	
	public TaskListPage(WebDriver driver){
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	//Click on AddNew Button
	 public void clickAddNew()
	 {
		 addNew.click();
	 }
	 
	 
	//Click on NewCustomer Button
	 public void clickNewCustomer()
	 {
		 newCustomer.click();
	 }
	 
	 
	//Click on NewProject Button
	 public void clickNewProject()
	 {
		 newProject.click();
	 }
	 
	 
	//Click on AddNewTask Button
	 public void clickAddNewTask()
	 {
		 addNewTask.click();
	 }
	 
	 
	//Click on CreateNewTask Button
	 public void clickCreateNewTask()
	 {
		 createNewTask.click();
	 }
	 
	 
	//Click on ImportTaskFromCsv Button
	 public void clickImportTaskFromCsv()
	 {
		 importtaskfromCsv.click();
	 }
	 
	 
	 //Verify The Title of Tasks Page
	 public void verifyTaskPageTitle(WebDriver driver)
	 
	 {
		 String ExpectedTitle ="actiTIME -  Task List";
		 
		String ActualTitle = driver.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("TestCase passed tasks page title of page verified"+ ExpectedTitle);
		}
		else 
		{
			System.out.println("testCase failed tasks page title of page is not matched" +ActualTitle);
		}
				 
	 }
	
	
	

}
