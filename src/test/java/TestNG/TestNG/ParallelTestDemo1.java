package TestNG.TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestDemo1 {
	WebDriver cd;
	
	@Test
	public void VerifyTitle() {
		cd= new ChromeDriver();
		cd.get("https://www.saucedemo.com/");
		
		Assert.assertEquals(cd.getTitle(), "Swag Labs");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cd.quit();
	}
	
	@Test
	public void VerifyLogo() {
		cd= new ChromeDriver();
		cd.get("https://www.saucedemo.com/");
		
		WebElement logo = cd.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(logo.isDisplayed());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cd.quit();
	}

}
