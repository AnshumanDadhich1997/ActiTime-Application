

package com.pomActiTime.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import com.pomActiTime.pages.EnterTimeTrackPage;

/**
 * @author Anshuman
 *
 */
public class TestEnterTimeTrackPage extends EnterTimeTrackPage {


	public TestEnterTimeTrackPage(WebDriver driver) {
		super(driver);
		
	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException {
		
		openTheBrowser("chrome");
		maximizeBrowser();
		url();
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/inputSheet.xlsx"));
		int g = wb.getSheet("validLogin").getLastRowNum();
		System.out.println(g);
		
		
		EnterTimeTrackPage enter=new  EnterTimeTrackPage(driver);
		
		 
		String un = wb.getSheet("validLogin").getRow(1).getCell(0).toString();
		String pw = wb.getSheet("validLogin").getRow(1).getCell(1).toString();
		String atbns = wb.getSheet("validLogin").getRow(1).getCell(2).toString();
		
		
		enter.UserName(un);
		enter.PassWord(pw);
		enter.LoginButton();
		Thread.sleep(1000);
		
		enter.addTaskByName(atbns);
		titleOfPage();
		Thread.sleep(1000);
		enter.settings();
		
		closeTheBrowser();
		
		
		
		

	}

}
