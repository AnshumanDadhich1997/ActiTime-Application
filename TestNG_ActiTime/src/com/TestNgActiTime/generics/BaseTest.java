package com.TestNgActiTime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConstant{
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	
	public static int passCount=0,failCount=0;
	public WebDriver driver;
	@BeforeClass
	@Parameters("sBrowser")
	public void openBrowser(String sBrowser)
	{
		if(sBrowser.equals("chrome"))
		{
			driver =new ChromeDriver();
		}
		
		else if (sBrowser.equals("firefox")) 
		{
			driver =new FirefoxDriver();
		}
		else if (sBrowser.equals("ie")) 
		{
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.get(URL);
		
		
	}
	
	@BeforeMethod
	public void Url()
	{
		driver.get(URL);
	}
	
	
	@AfterMethod
	public void closeBrowser(ITestResult itresult) throws IOException
	{
		String nameofMethod = itresult.getName();
		int status = itresult.getStatus();
		if(status==1)
		{
			passCount++;
			Reporter.log("PassCount:-->"+passCount,true);
		}
		else
		{
			failCount++;			
			String name = PHOTO_PATH+nameofMethod+".png";
			FUtils.screenShot(driver, name);;
			Reporter.log("FailCount:-->"+failCount,true);
		}
		
		driver.close();
	}
	
	@AfterSuite
	public void printReport()
	{
		Reporter.log("PassCount:--> " +passCount,true);
		Reporter.log("FailCount:--> " +failCount,true);
		FUtils.write_Data_into_Xl(REPORT_PATH,"Result1", 1, 0,passCount);
		FUtils.write_Data_into_Xl(REPORT_PATH,"Result1", 1, 1,failCount);
	}
}

	