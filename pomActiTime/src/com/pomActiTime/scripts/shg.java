package com.pomActiTime.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class shg {
	static
	{
	  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	  System.setProperty("webdriver.IEDriver.driver","./driver/IEDriverServer.exe");
	}
	
	
	public static void main(String[]args)
	
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}

}
