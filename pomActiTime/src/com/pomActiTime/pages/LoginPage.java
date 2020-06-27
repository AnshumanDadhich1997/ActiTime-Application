
package com.pomActiTime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.pomActiTime.generics.BaseTest;

/**
 * @author Anshuman Dadhich
 *
 */
public class LoginPage extends BaseTest {
	
	//find username's textbox
//	@FindBy(id ="username")
//	private WebElement untb;
	
//	//find password textbox
//	 @FindBy(name ="pwd")
//	 private WebElement pwtb;
//	 
//	 //find login Button
//	 @FindBy(xpath="//div[text()='Login ']")
//	 private WebElement lgnBtn;
//	 
//	 //find the keepmeloggedin checkbox
//	 @FindBy(id="keepMeLoggedInSection")
//	 private WebElement kpMeLogIn;
//	 
//	 //Displayed error messages
//	 @FindBy(xpath="//span[text()='Username or Password is invalid. Please try again.']")
//	 private WebElement errmsg;
//	 
	 //Create constructor for LoginPage
	 public LoginPage(WebDriver driver )
	 {
		 PageFactory.initElements(driver, this);//Question why we use this
		 
	 }
	 
	 //find the username textbox and send the input
	  public void UserName(String unj)
	  {   WebElement untb = driver.findElement(By.id("username"));
		  untb.sendKeys(unj);
	  }
	  
	  //find the password textbox and send the input
	  public void PassWord(String pwd)
	  {   WebElement pwdtb = driver.findElement(By.name("pwd"));
		  pwdtb.sendKeys(pwd);
	  }
	  
	  //find the keepMeLoggedIn checkbox and click on it
	  public void KeepMeLoggedIn()
	  { WebElement kpMeLogin = driver.findElement(By.id("keepMeLoggedInSection"));
		  kpMeLogin.click();
	  }
	  
	  //find the login button and click on it
	  public void LoginButton()
	  { WebElement lgnbtn = driver.findElement(By.xpath("//div[text()='Login ']"));
		  lgnbtn.click();
	  }
	  
	  //verify the error message that it is displayed or not
	  public void verifyErrorMsg()
	  {
		  WebElement errmsg = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
		  if(errmsg.isDisplayed())
		  {
			  System.out.println("The error message is ----->  "+errmsg.getText());
			  System.out.println("The Testcase is passed");
		  }
		  else
		  {
			  System.out.println("The error message is not displayed ");
			  System.out.println("The Testcase is failed");
		  }
		  
	  }
	  
	  
	  
	  
	  
	 
	 
	 
	 
	 

}
