package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class  XL {
	WebDriver driver;
	
	
	static Workbook book;
	static Sheet sheet;
	
	
	public static String pathTD = "C:\\Users\\robfa\\Desktop\\Sdet\\Functional\\src\\main\\java\\TestData\\SdetData.xlsx";
	
	public static Object[][] getTestData(String sheetName) {
	FileInputStream file = null;
	try {
		file = new FileInputStream(pathTD);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		
	}
	try {
	 book = WorkbookFactory.create(file);
	} catch (EncryptedDocumentException e) {
	
		e.printStackTrace();
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	sheet = book.getSheet(sheetName);
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	for(int i =0;i<=sheet.getLastRowNum();i++) {
		for(int j =0;j<sheet.getRow(0).getLastCellNum();j++) {
			data[i][j]= sheet.getRow(i+1).getCell(j).toString();
		}
	}
	return data;
	}
}
