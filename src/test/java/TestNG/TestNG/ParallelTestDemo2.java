package TestNG.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ParallelTestDemo2 {
	WebDriver cd;
	@Test
	public void LoginTest() {
		cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.saucedemo.com/");
		
		cd.findElement(By.id("user-name")).sendKeys("standard_user");
		cd.findElement(By.id("password")).sendKeys("secret_sauce");
		
		WebElement login =  cd.findElement(By.name("login-button"));
		login.click();
		
		Assert.assertEquals(cd.getTitle(), "Swag Labs");
 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.quit();
	}

}
