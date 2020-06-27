/**
 * 
 */
package com.pomActiTime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Anshuman
 *
 */
public class ActiTimeLicensePage extends EnterTimeTrackPage {
	
	public ActiTimeLicensePage(WebDriver driver) {
		super(driver);
		
	}
	
	//verify the Tile of license PAGE
	public  void titleOfLicensePage()
	{
	 String actualTitle1 = driver.getTitle();
	 
		//Give what is the title your expected
		 String expectedTitle1="actiTIME - Licenses";
		 
		//verify the currentWindowTitle is What we Expected
		 if(actualTitle1.equals(expectedTitle1))
				 {
			         System.out.println("The Expected Page Title is Displayed--->"+expectedTitle1);
			         System.out.println("The Test Case is Passed");
				 }
		 else
		        {
			        System.out.println("The Expected Page Title is  not Displayed--->"+actualTitle1);
			        System.out.println("The Test Case is Failed");
		       }
}

	//Find the productEdition on license link and get the text
		public void productEdition()
		{
			WebElement prdtEdtn = driver.findElement(By.xpath("//b[text()='actiTIME 2017.4']"));
			System.out.println(prdtEdtn.getText()); 
		}
		
		//Find the issuedate on license link and get the text
		public void isueDate()
		{
			WebElement isdt = driver.findElement(By.xpath("//td[contains(text(),'Jul 14, 2017')]"));
			System.out.println(isdt.getText());
		}

		
}
