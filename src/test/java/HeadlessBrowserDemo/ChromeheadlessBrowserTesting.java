package HeadlessBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeheadlessBrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		
		WebDriver cd = new ChromeDriver(options);
		cd.manage().window().maximize();
		cd.get("https://www.google.com/");
		
		System.out.println("Before Search : -" + cd.getTitle());
		
		WebElement  searchBox = cd.findElement(By.name("q"));
		
		searchBox.sendKeys("India Gate");
		searchBox.sendKeys(Keys.ENTER);
		
		System.out.println("After Search : -" + cd.getTitle());

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.quit();

	}

}
