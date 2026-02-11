package TestNG.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProviderWithExcel {
	
	WebDriver cd ;
	
	@BeforeMethod
	public void setup ()
	{
		cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.google.com/");
	}
	@Test(dataProvider = "searchDataProvider")
	public void searchKeyWord(String keyword) 
	{
		WebElement searchbox = cd.findElement(By.name("q"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	
	@DataProvider(name = "searchDataProvider")
	public Object[][] searchDataProviderMethod()
	{
		String fileName = "/Users/rafiehayat/Desktop/SearchPOI.xlsx";
		Object [][] searchData = getExcelData(fileName,"Sheet1");
//		Object [][] searchData = new Object [2][1];
//		searchData [0][0] = "Taj Mahal";
//		searchData [1][0] = "India Gate";
		return  searchData;
	}
	public String [][] getExcelData(String filename,String sheetName)
	{
		String [][] data = null;
		try {
			FileInputStream inputStream = new FileInputStream(filename);
			XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
			XSSFSheet excelSheet =  workBook.getSheet(sheetName);
			
			//get Total no. of Rows
			int ttlRows =  excelSheet.getLastRowNum() + 1;
			
			//get Total no. of Cells
			int ttlCells = excelSheet.getRow(0).getLastCellNum();
			
			// Initialize Array
			data = new String [ttlRows - 1 ] [ttlCells];
			
			for(int currentRow = 1; currentRow< ttlRows;currentRow++)  // loop for row
			{
				for(int currentCell = 0;currentCell< ttlCells;currentCell++)
				{
					data [currentRow - 1][currentCell] = excelSheet.getRow(currentRow).getCell(currentCell).getStringCellValue();
				}
			}

			
			workBook.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	@AfterMethod
	public void tearDown()
	{
		cd.quit();
	}

}
