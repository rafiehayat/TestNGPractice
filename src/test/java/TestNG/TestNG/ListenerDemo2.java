package TestNG.TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG.TestNG.ListenerClass.class)
public class ListenerDemo2 {
	WebDriver cd;
	
	@Test
	public void Listener() {
	cd = new ChromeDriver();
	cd.manage().window().maximize();
	cd.get("https://www.saucedemo.com/");
	
	cd.findElement(By.id("user-name")).sendKeys("standard_user");
	cd.findElement(By.id("password")).sendKeys("secret_sauce");
	
	WebElement login =  cd.findElement(By.name("login-button"));
	login.click();
	
	AssertJUnit.assertEquals(cd.getTitle(), "Swag Labs");

}
	@Test
	public void FailTest() {
		System.out.println("Failed Test Case");
		AssertJUnit.assertTrue(false);
	}
	@Test
	public void SkipTest() {
		System.out.println("Failed Test Case");
		throw new SkipException("Skip Exception Thrown");
	}
}
