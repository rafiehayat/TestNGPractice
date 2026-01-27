package TestNG.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;

public class ListenerDemo {
	WebDriver cd;
	@Test
	public void Login() {
		cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(10));

		WebElement username = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))
		    );
		username.sendKeys("Admin");

		WebElement password = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))
		);
		password.sendKeys("admin123");

		WebElement loginBtn = wait.until(
		    ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))
		);
		loginBtn.click();
		
		
		WebDriverWait waiting = new WebDriverWait(cd, Duration.ofSeconds(10));
		waiting.until(ExpectedConditions.titleContains("OrangeHRM"));

		Assert.assertEquals(cd.getTitle(), "OrangeHRM");		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.quit();
	}


}
