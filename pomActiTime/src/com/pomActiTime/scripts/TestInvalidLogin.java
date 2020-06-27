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

public class TestInvalidLogin extends LoginPage {

	public TestInvalidLogin(WebDriver driver) {
		super(driver);
		
	}

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		openTheBrowser("chrome");
		maximizeBrowser();
		url();
		
		
LoginPage login = new LoginPage(driver);

	Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/inputSheet.xlsx"));
	int g = wb.getSheet("inValidLogin").getLastRowNum();
	System.out.println(g);
		
		for(int i =1;i<=5;i++) {
			 
		String un = wb.getSheet("inValidLogin").getRow(i).getCell(0).toString();
		String pw = wb.getSheet("inValidLogin").getRow(i).getCell(1).toString();
		
		
		login.UserName(un);
		login.PassWord(pw);
		login.KeepMeLoggedIn();
		login.LoginButton();
		
		login.verifyErrorMsg();
		}
		
		closeTheBrowser();
		

	}

}
