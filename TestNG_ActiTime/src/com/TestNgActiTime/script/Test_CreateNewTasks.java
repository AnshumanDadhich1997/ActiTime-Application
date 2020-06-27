package com.TestNgActiTime.script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TestNgActiTime.generics.BaseTest;
import com.TestNgActiTime.generics.FUtils;
import com.TestNgActiTime.pages.CreateNewTasks;
import com.TestNgActiTime.pages.EnterTimeTrackPage;
import com.TestNgActiTime.pages.LoginPage;
import com.TestNgActiTime.pages.TaskListPage;

public class Test_CreateNewTasks extends BaseTest {
	
	@Test
	public void testCreateNewTask() throws InterruptedException
	{
		String expectedTitleETP = FUtils.read_XL_Data(XL_DATA_PATH,"TaskName",1,2);
		String expectedTitleTT = FUtils.read_XL_Data(XL_DATA_PATH,"TaskName",1,3);
		String TaskName1 = FUtils.read_XL_Data(XL_DATA_PATH,"TaskName",1,4);
		
		
		LoginPage lp =new LoginPage(driver);
		lp.login();
		Thread.sleep(1000);
		FUtils.verifyPage(driver,expectedTitleETP);
		Reporter.log("Verification of EnterTimeTrack Page is Successful", true);
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver) ;
		etp.clickTasks();
		Thread.sleep(1000);
		FUtils.verifyPage(driver,expectedTitleTT);
		Reporter.log("Verification of Task Page is Successful", true);
		
		
		TaskListPage task = new TaskListPage(driver);
		task.clickAddNewTask();
		task.clickCreateNewTask();
		
		
		CreateNewTasks cnt = new CreateNewTasks(driver);
		cnt.enterTaskName(TaskName1);
		cnt.clickCreateTask();
	}

}
