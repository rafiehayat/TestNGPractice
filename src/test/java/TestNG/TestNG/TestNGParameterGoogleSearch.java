package TestNG.TestNG;
import org.testng.annotations.*;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGParameterGoogleSearch {
	@Parameters({"keyword"})
	@Test
	public void googleSearch(String searchdata) throws InterruptedException {
		
		WebDriver cd = new ChromeDriver();
		cd.get("https://www.google.com/");
		
		
		WebElement search =  cd.findElement(By.id("APjFqb"));
		search.sendKeys(searchdata);
		
		Assert.assertEquals(searchdata, search.getAttribute("value"));
		Thread.sleep(2000);
		cd.quit();
		
	}

}
