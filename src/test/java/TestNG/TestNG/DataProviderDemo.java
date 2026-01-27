package TestNG.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class DataProviderDemo {
//	@DataProvider(name= "searchDataSet")
//	public Object [][] searchData(){
//		Object[][] SearchKeyword = new Object [3][2];
//		SearchKeyword [0][0] = "Bihar";
//		SearchKeyword [0][1] = "Patna";
//		
//		SearchKeyword [1][0] = "Delhi";
//		SearchKeyword [1][1] = "New Delhi";
//		
//		SearchKeyword [2][0] = "Maharashtra";
//		SearchKeyword [2][1] = "Mumbai";
//		
//		return SearchKeyword;
//	}
	
	@Test(dataProvider = "searchDataSet" , dataProviderClass = DataProviderDemoAnnotation.class)
	public void testCaseGoogleSearch(String Country ,String Monument) {
		
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.google.com/");
		
		
		WebElement search =  cd.findElement(By.id("APjFqb"));
		search.sendKeys(Country + " " + Monument );
		
		cd.findElement(By.name("btnK")).submit();
		
		
	}

}
