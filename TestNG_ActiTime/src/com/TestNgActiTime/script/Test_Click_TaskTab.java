package com.TestNgActiTime.script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TestNgActiTime.generics.BaseTest;
import com.TestNgActiTime.generics.FUtils;
import com.TestNgActiTime.pages.EnterTimeTrackPage;
import com.TestNgActiTime.pages.LoginPage;

public class Test_Click_TaskTab extends BaseTest {
	
	@Test
	public void testClickTaskTab() throws InterruptedException, IOException
	{
		String expectedTitleETP = FUtils.read_XL_Data(XL_DATA_PATH,"TaskTab",1,2);
		String expectedTitleTT = FUtils.read_XL_Data(XL_DATA_PATH,"TaskTab",1,3);

		LoginPage lp =new LoginPage(driver);
			lp.login();
			Thread.sleep(1000);
			FUtils.verifyPage(driver,expectedTitleETP);
			Reporter.log("Verification of EnterTimeTrack Page is Successful", true);
			
			
			EnterTimeTrackPage etp =new EnterTimeTrackPage(driver);
			etp.clickTasks();
			
			Thread.sleep(1000);
			FUtils.verifyPage(driver,expectedTitleTT);
			Reporter.log("title of the Tasks Page is verified", true);
			Thread.sleep(1000);
			
					
		
	}

}
