package com.pomActiTime.generics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Anshuman
 *
 */
public class BaseTest {
	
	//set driver executable file
	static
	{
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	  
	}
	
	public static WebDriver driver;
	
	//open the browser
	public  static void openTheBrowser(String sBrowser)
	{
		if(sBrowser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else
		{
			driver =new FirefoxDriver();
		}
	}
	
	//maximize the browser
	public static void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	
	//enter the url
	public static void url()
	{
		driver.get("http://localhost/login.do");
	}
	
	//find logout button and perform action to logout
	  public static void LogoutApplication()
	  {
		  WebElement logout = driver.findElement(By.xpath("//a[text() ='Logout']"));
		  logout.click();
	  }
	
	//close the Application
	public static void closeTheBrowser()
	{
		driver.close();
	}
	
	//Verify the Title of the Home page
	public static void titleOfPage()
	{
		 String actualTitle = driver.getTitle();
		 
			//Give what is the title your expected
			 String expectedTitle="actiTIME - Enter Time-Track";
			 
			//verify the currentWindowTitle is What we Expected
			 if(actualTitle.equals(expectedTitle))
					 {
				         System.out.println("The Expected Page Title is Displayed--->"+expectedTitle);
				         System.out.println("The Test Case is Passed");
					 }
			 else
			        {
				        System.out.println("The Expected Page Title is  not Displayed--->"+actualTitle);
				        System.out.println("The Test Case is Failed");
			       }
	

}
}
