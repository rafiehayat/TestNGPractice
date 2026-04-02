package BasicTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.saucedemo.com/");
		
		cd.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		cd.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");
		
		cd.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
		String currentWindowhandle = cd.getWindowHandle();
		cd.switchTo().window(currentWindowhandle);
		cd.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		cd.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		

		
		
		String currentWindowhandle2 = cd.getWindowHandle();
		cd.switchTo().window(currentWindowhandle2);
		cd.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		
		String currentWindowhandle3 = cd.getWindowHandle();
		cd.switchTo().window(currentWindowhandle3);
		cd.findElement(By.id("checkout")).click();
		
		
		cd.findElement(By.id("first-name")).sendKeys("Rafie");
		cd.findElement(By.id("last-name")).sendKeys("Hayat");
		cd.findElement(By.id("postal-code")).sendKeys("854301");
		cd.findElement(By.id("continue")).click();
		
		
		String currentWindowhandle4 = cd.getWindowHandle();
		cd.switchTo().window(currentWindowhandle4);
		cd.findElement(By.id("finish")).click();
		

		
		
		

	}

}
