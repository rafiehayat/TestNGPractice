package DataDrivenTestingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DataDrivenTestingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;
//		XSSFRow Row;
//		XSSFCell Cell;
		
		//Create an object of File Class to Open File
		File excelFile = new File("/Users/rafiehayat/Desktop/Testing.xlsx");
		FileInputStream inputStream = null;
		
		//Create an object of FileInputStread Class to Read File
		try {
			 inputStream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Excel -> Workbook -> Sheet -> Row -> Cell
		//Create object of XSSFWorkbook to handle xlsx file
		try {
			ExcelWBook = new XSSFWorkbook(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//To Access Workbook Sheet
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		
		//Get Total Row Count
		int ttlRows = ExcelWSheet.getLastRowNum() + 1;
		
		// Get total no. of cells in a row
		int ttlCells = ExcelWSheet.getRow(0).getLastCellNum();
		
		for(int currentRow = 1; currentRow < ttlRows; currentRow ++ )
		{
			
			//Launch Chrome browser
			WebDriver cd = new ChromeDriver();
			cd.manage().window().maximize();
			cd.get("https://www.saucedemo.com/");
			
			cd.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(0).toString());
	        cd.findElement(By.id("password")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(1).toString());
	        
	        cd.findElement(By.id("login-button")).click();
	        
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			for(int currentCell = 0; currentCell < ttlCells;  currentCell ++)
//			{
//				System.out.print(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
//				System.out.print("\t");
//			}
//			System.out.print("\n");
	        
	        cd.quit();

		}
		
		try {
			ExcelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
