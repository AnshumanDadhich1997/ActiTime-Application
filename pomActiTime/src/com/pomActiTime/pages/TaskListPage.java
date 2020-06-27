/**
 * 
 */
package com.pomActiTime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskListPage extends LoginPage  {

	
	

	public TaskListPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void navigate()
	{
		driver.navigate().to("http://localhost/tasks/tasklist.do");
		
	}
	public  void taskListwer()
	 {
		 
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
	 }
	

	//Find the TaskList on home page click on it
	 public static void taskList()
	 {
		 
		driver.findElement(By.linkText("tasklist")).click();
	 }
	 
	 //Find the Add new task button  and click on it
	 public void addNewTask()
	 {
		
		 driver.findElement(By.xpath("//div[text()='Add New Task']")).click();
	 }
	 
	 //In the add new task dropdownbox select the create new task
	 public void  createNewTask()
	 {
		 
		driver.findElement(By.xpath("//div[text()='Create new tasks']")).click();
	 }
	 
	 //find the Enter task name Textbox and enter the the task name
	 public void enterTaskName(String taskName)
	 {
		 WebElement etn = driver.findElement(By.xpath("(//input[@class='inputFieldWithPlaceholder' and @ placeholder='Enter task name'])[1]"));
	  etn.sendKeys(taskName);
	 }
	 
	 //Find the Create Task button and click on it to createa new task
	 public void creatTask()
	 {
		 driver.findElement(By.xpath("//span[text() ='Create Tasks']")).click();
	 }
	 
	 //Find the search button to search the created task
	 public void searchTask(String stn)
	 {
		 WebElement ST = driver.findElement(By.xpath("(//input[@ placeholder ='Start typing name ...' and @type='text'])[2]"));
		 ST.sendKeys(stn);
	 }
	 
	 
	 
	 
	 

}
