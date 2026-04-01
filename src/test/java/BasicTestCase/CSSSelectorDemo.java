package BasicTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.saucedemo.com/");
		
		cd.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		cd.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		cd.findElement(By.cssSelector("input.submit-button")).click();
		
		
		String currentWindowhandle = cd.getWindowHandle();
		cd.switchTo().window(currentWindowhandle);
		cd.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		cd.findElement(By.cssSelector("button[name$=light]")).click();
		// Substring method =  $ and *  means contains    ^ means Starting word  
		
		Thread.sleep(30000);
		cd.quit();
		

		

	}

}
