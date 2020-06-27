package com.TestNgActiTime.script;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TestNgActiTime.generics.BaseTest;
import com.TestNgActiTime.generics.FUtils;
import com.TestNgActiTime.pages.LoginPage;

public class Test_ValidLoginPage extends BaseTest {
	
	
	
	@Test
	public void testLoginPage() throws InterruptedException, IOException
	{
		String Username = FUtils.read_XL_Data(XL_DATA_PATH,"validLogin",1,0);
		String Password = FUtils.read_XL_Data(XL_DATA_PATH,"validLogin",1,1);
		LoginPage lp =new LoginPage(driver);
		lp.login1(Username,Password);
		Thread.sleep(1000);
		FUtils.verifyPage(driver,"actiTIME - Enter Time-Track");
		Reporter.log("Verification of EnterTimeTrack Page is Successful", true);
		Thread.sleep(1000);
		
	}

}
