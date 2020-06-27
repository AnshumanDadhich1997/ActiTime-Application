package com.TestNgActiTime.script;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.TestNgActiTime.generics.BaseTest;
import com.TestNgActiTime.generics.FUtils;
import com.TestNgActiTime.pages.EnterTimeTrackPage;
import com.TestNgActiTime.pages.LicensePage;
import com.TestNgActiTime.pages.LoginPage;

public class Test_ProductEdition extends BaseTest {
	
	@Test 
	public void CheckProductEdition() throws InterruptedException, IOException
	{	
		String expectedTitleETP = FUtils.read_XL_Data(XL_DATA_PATH,"productEdition",1,2);
		String expectedTitleLP = FUtils.read_XL_Data(XL_DATA_PATH,"productEdition",1,3);
		String prdtedtn = FUtils.read_XL_Data(XL_DATA_PATH,"ProductEdition",1,4);
		
		LoginPage lp =new LoginPage(driver);
		lp.login();
		Thread.sleep(1000);
		
		EnterTimeTrackPage etp =new EnterTimeTrackPage(driver);
		
				 FUtils.verifyPage(driver,expectedTitleETP);
				 Reporter.log("Verification of EnterTimeTrack Page is Successful", true);
				 etp.clickSettings();
				 etp.clickLicenses();
				 
				 
		 LicensePage li= new LicensePage(driver);
				 
				 FUtils.verifyPage(driver,expectedTitleLP);
				 Reporter.log("Verification of Licenses Page is Successful", true);
				 
				li.verifyProductEdition(prdtedtn);
				Thread.sleep(1000);
				
	
						 
		
	}

}
