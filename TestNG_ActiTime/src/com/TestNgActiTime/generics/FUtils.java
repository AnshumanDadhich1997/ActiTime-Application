package com.TestNgActiTime.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FUtils extends BaseTest {
	
	public static void verifyPage(WebDriver driver, String expectedTitle)
	{
		String actualTitle = driver.getTitle();
		WebdriverUtils.waitForTitleContains(driver,expectedTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	  
	public static String read_XL_Data(String filepath , String sheet , int row ,int cell)
	{
		String data ="";
		try
		{
			Workbook wb =WorkbookFactory.create(new FileInputStream(filepath));
			data=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	
	
	public static int xl_Row_Count(String filepath, String sheet)
	{
		int rowCount =0;
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(filepath));
			wb.getSheet(sheet).getLastRowNum();
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return rowCount;
	}
	
	public static void write_Data_into_Xl(String filepath , String sheet , int row ,int cell, int data)
	{
		 
		try
		{
			Workbook wb =WorkbookFactory.create(new FileInputStream(filepath));
			 wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
			
			wb.write(new FileOutputStream(filepath));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void screenShot(WebDriver driver , String filepath ) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  File des = new File(filepath);
		  FileUtils.copyFile(src, des);
		
		
	}

}
