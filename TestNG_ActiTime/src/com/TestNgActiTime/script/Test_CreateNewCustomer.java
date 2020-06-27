package com.TestNgActiTime.script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TestNgActiTime.generics.BaseTest;
import com.TestNgActiTime.generics.FUtils;
import com.TestNgActiTime.pages.CreateNewCustomerPage;
import com.TestNgActiTime.pages.EnterTimeTrackPage;
import com.TestNgActiTime.pages.LoginPage;
import com.TestNgActiTime.pages.TaskListPage;

public class Test_CreateNewCustomer extends BaseTest {
	
	
	@Test
	public void testCreateNewCustomer() throws InterruptedException
	{
		String expectedTitleETP = FUtils.read_XL_Data(XL_DATA_PATH,"CustomerName",1,2);
		String expectedTitleTT = FUtils.read_XL_Data(XL_DATA_PATH,"CustomerName",1,3);
		String CustomerName1= FUtils.read_XL_Data(XL_DATA_PATH,"CustomerName",1,4);
		String AddCustomerDesc1= FUtils.read_XL_Data(XL_DATA_PATH,"CustomerName",1,5);

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
		task.clickAddNew();
		task.clickNewCustomer();
		
		
		CreateNewCustomerPage cnc = new CreateNewCustomerPage(driver);
		cnc.enterCustomerName(CustomerName1);
		cnc.enterAddCustomerDesc(AddCustomerDesc1);
		cnc.clickCreateCustomer();
		
	}

}
