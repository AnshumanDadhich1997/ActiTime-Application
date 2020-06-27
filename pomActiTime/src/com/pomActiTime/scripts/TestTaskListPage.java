package com.pomActiTime.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import com.pomActiTime.pages.TaskListPage;

/**
 * @author Anshuman
 *
 */
public class TestTaskListPage extends TaskListPage {

	
	public TestTaskListPage(WebDriver driver) {
		super(driver);
		
	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException {
		
		
		
		openTheBrowser("chrome");
		maximizeBrowser();
		url();
		
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/inputSheet.xlsx"));
		int g = wb.getSheet("validLogin").getLastRowNum();
		System.out.println(g);
		
		
		
		
		TaskListPage task =new TaskListPage(driver);
		
		String un = wb.getSheet("validLogin").getRow(1).getCell(0).toString();
		String pw = wb.getSheet("validLogin").getRow(1).getCell(1).toString();
		String Etns = wb.getSheet("validLogin").getRow(1).getCell(3).toString();
		
		
		
		
		task.UserName(un);
		task.PassWord(pw);
		task.KeepMeLoggedIn();
		task.LoginButton();
		Thread.sleep(1000);
		
		task.navigate();
		task.taskListwer();
//		task.addNewTask();
//		task.createNewTask();
//		Thread.sleep(1000);
//		task.enterTaskName(Etns);
//		task.creatTask();
//		System.out.println("hello");
//		Thread.sleep(1000);
//		task.searchTask(Etns);
//		closeTheBrowser();
//		

	}

}
