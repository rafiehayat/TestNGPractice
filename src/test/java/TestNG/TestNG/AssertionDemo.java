package TestNG.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;

public class AssertionDemo {
	WebDriver cd;
	
	@Test
	public void TestMethod() throws InterruptedException {
		cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://testautomationpractice.blogspot.com/");
		System.out.println("verifying Title");
		String ExpectedTitle = "Automation Testing Practice";
				String ActualTitle = cd.getTitle();
				Assert.assertEquals(ExpectedTitle, ActualTitle ,"Title Verify");
		
		System.out.println("verifying Presence of Wikipedia Icon");		
		WebElement icon =  cd.findElement(By.className("wikipedia-icon"));
		Assert.assertTrue(icon.isDisplayed());
		
		System.out.println("verifying Presence of Search Icon");	
		WebElement SearchIcon =  cd.findElement(By.className("wikipedia-search-button"));
		Assert.assertTrue(SearchIcon.isDisplayed());
		
		Thread.sleep(2000);
		cd.close();
		
	}

}
