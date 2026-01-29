package TestNG.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
WebDriver cd;
	
	@Test
	public void TestMethod() throws InterruptedException {
		cd = new ChromeDriver();
		cd.manage().window().maximize();
		
		SoftAssert  SoftVerify = new SoftAssert();
		
		cd.get("https://testautomationpractice.blogspot.com/");
		System.out.println("verifying Title");
		String ExpectedTitle = "Automation Testing Practice 1";
				String ActualTitle = cd.getTitle();
				SoftVerify.assertEquals(ExpectedTitle, ActualTitle ,"Title Verify");
		
		System.out.println("verifying Presence of Wikipedia Icon");	
		WebElement icon =  cd.findElement(By.className("wikipedia-icon"));
		SoftVerify.assertTrue(icon.isDisplayed());
		
		System.out.println("verifying Presence of Search Icon");
		WebElement SearchIcon =  cd.findElement(By.className("wikipedia-search-button"));
		SoftVerify.assertTrue(SearchIcon.isDisplayed());
		
		Thread.sleep(2000);
		cd.close();
		
		// Report All Failure message
		SoftVerify.assertAll();
	}

}
