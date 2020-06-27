/**
 * 
 */
package com.pomActiTime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Admin
 *
 */
public interface Futil {
	
	public static  String xlSheetInputs(String filePath,String sheet,int row, int cell) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(filePath));
		wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return sheet;
		
	}

}
