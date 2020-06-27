package com.TestNgActiTime.script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TestNgActiTime.generics.BaseTest;
import com.TestNgActiTime.generics.FUtils;
import com.TestNgActiTime.pages.LoginPage;

public class Test_InValidLogin extends BaseTest {
	
	@Test
	public void test_InValidLogin()
	{
		int rowCount = FUtils.xl_Row_Count(XL_DATA_PATH, "inValidLogin");
		Reporter.log("no. of row count"+rowCount,true);
		for(int i =1 ;i<=3;i++)
		{
			
		
		String Username = FUtils.read_XL_Data(XL_DATA_PATH,"inValidLogin",i,0);
		String Password = FUtils.read_XL_Data(XL_DATA_PATH,"inValidLogin",i,1);
		
		LoginPage lp =new LoginPage(driver);
		lp.login2(Username , Password);
		}
		
	}

} 
