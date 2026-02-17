package TestNGReportDemo;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGReportEx2 {
	@Test
	public void GoogleSearch()
	{
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		Reporter.log("Chrome broowser Opened");
		cd.get("https://www.google.com/");
		Reporter.log("URL Opened");
		
		
		WebElement  searchBox = cd.findElement(By.name("q"));
		
		searchBox.sendKeys("India Gate");
		Reporter.log("India Gate Keyword");
		searchBox.sendKeys(Keys.ENTER);
		
		
	}

}
