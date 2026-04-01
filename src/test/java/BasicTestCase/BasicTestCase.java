package BasicTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.saucedemo.com/");
		
		cd.findElement(By.id("user-name")).sendKeys("standard_user");
		cd.findElement(By.id("password")).sendKeys("secret_sauce");
		cd.findElement(By.id("login-button")).click();
		
		String currentWindowhandle = cd.getWindowHandle();
		cd.switchTo().window(currentWindowhandle);
//		cd.findElement(By.linkText("Sauce Labs Backpack")).click();
		
		List <WebElement> elementList = cd.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element Size:" + elementList.size());
		
		Thread.sleep(30000);
		cd.quit();

	}

}
