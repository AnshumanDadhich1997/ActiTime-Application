/**
 * 
 */
package com.pomActiTime.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import com.pomActiTime.pages.ActiTimeLicensePage;

/**
 * @author Anshuman
 *
 */
public class TestLicensePage extends ActiTimeLicensePage {

	public TestLicensePage(WebDriver driver) {
		super(driver);
		
	}


	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException {
		openTheBrowser("chrome");
		maximizeBrowser();
		url();
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/inputSheet.xlsx"));
		int g = wb.getSheet("validLogin").getLastRowNum();
		System.out.println(g);
		
		ActiTimeLicensePage license=new ActiTimeLicensePage(driver);
		
		
		String un = wb.getSheet("validLogin").getRow(1).getCell(0).toString();
		String pw = wb.getSheet("validLogin").getRow(1).getCell(1).toString();
		
		
		
		
		 license.UserName(un);
		 license.PassWord(pw);
		 license.LoginButton();
		 Thread.sleep(1000);
		 
		 license.settings();
		 Thread.sleep(1000);
		 
		 license.license();
		 Thread.sleep(1000);
		 
		 license.productEdition();
		 license.titleOfLicensePage();
		 license.isueDate();
		 Thread.sleep(1000);
		 
		 LogoutApplication();
		 
		 closeTheBrowser();
		 
		
		

	}


	

}
