package com.pomActiTime.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import com.pomActiTime.pages.LoginPage;
/**
 * 
 * @author Anshuman
 *
 */

public class TestValidLogin extends LoginPage {

	public TestValidLogin(WebDriver driver) {
		super(driver);
		
	}

	
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException 
	{
		
		openTheBrowser("chrome");
		maximizeBrowser();
		url();
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/inputSheet.xlsx"));
		int g = wb.getSheet("validLogin").getLastRowNum();
		System.out.println(g);
		
		LoginPage login = new LoginPage(driver);
		
		
			
			
				 
			String un = wb.getSheet("validLogin").getRow(1).getCell(0).toString();
			String pw = wb.getSheet("validLogin").getRow(1).getCell(1).toString();
			
		
		
		login.UserName(un);
		login.PassWord(pw);
		login.KeepMeLoggedIn();
		login.LoginButton();
		Thread.sleep(1000);
		titleOfPage();
		LogoutApplication();
		closeTheBrowser();
		
		
		
		
		
		
		
		
		

	}

}
