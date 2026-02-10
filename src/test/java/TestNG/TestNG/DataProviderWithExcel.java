package TestNG.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
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
		Object [][] searchData = new Object [2][1];
		searchData [0][0] = "Taj Mahal";
		searchData [1][0] = "India Gate";
		return  searchData;

		
	}
	@AfterMethod
	public void tearDown()
	{
		cd.quit();
	}

}
