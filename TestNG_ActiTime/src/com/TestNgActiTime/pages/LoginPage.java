package com.TestNgActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	
	
	//Find UserName textbox on loginPage
	@FindBy(id ="username")
	private WebElement untb;


	//Find PassWord textbox on loginPage
	@FindBy(name ="pwd")
	private WebElement pwtb;

	
	//Find KeepMeLoggedIn checkbox on loginPage
	@FindBy(id="keepLoggedInLabel")
	private WebElement KeepMeLoggedIn;


	//Find login button on loginPage
    @FindBy(xpath="//div[text()='Login ']")
    private WebElement lgnbtn;
  
    
    //Find Error Message on loginPage
    @FindBy(xpath ="//span[text() = 'Username or Password is invalid. Please try again.']")
    private WebElement errormsg;
  
  
    
    public LoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
    
   // Perform action on loginPage
    public void login()
  {
	 untb.sendKeys("admin"); 
	 pwtb.sendKeys("manager");
	 KeepMeLoggedIn.click();
	 lgnbtn.click();
  }
  
    
 // Perform action on loginPage
    public void login1(String un, String pw)
  {
	 untb.sendKeys(un); 
	 pwtb.sendKeys(pw);
	 KeepMeLoggedIn.click();
	 lgnbtn.click();
  }
    public void login2(String un, String pw)
    {
  	 untb.sendKeys(un); 
  	 pwtb.sendKeys(pw);
  	 KeepMeLoggedIn.click();
  	 lgnbtn.click();
  	 ErorMessage();
    }
  
 
    //Send input to the UserName Textbox
    public void setUsername(String un)
  {
	  untb.sendKeys(un);
  }
    
    
    //Send input to the PassWord Textbox
  public void setPassWord(String pw)
  {
	  pwtb.sendKeys(pw);
  }
  
  
  //Click on  KeepMeLoggedIn checkbox
  public void clickkeepMeLoggedIn()
  {
	  KeepMeLoggedIn.click();
  }
  
  
  //Click on Login button
  public void clickLoginbutton()
  {
	 lgnbtn.click();
  }
  
  
  //Verify ErrorMessage is displayed or not
  public void ErorMessage()
  {
	  Assert.assertTrue(errormsg.isDisplayed());
	  Reporter.log("eror message is displayed",true);
  }

}
