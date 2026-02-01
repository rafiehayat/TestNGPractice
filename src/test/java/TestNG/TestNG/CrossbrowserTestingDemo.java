package TestNG.TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CrossbrowserTestingDemo {
	WebDriver cd;
	
	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browser) {
		switch(browser.toLowerCase())
		{
		case "chrome":
		cd = new ChromeDriver();
		cd.manage().window().maximize();
		break;
		case "safari":
	        cd = new SafariDriver();
	        cd.manage().window().maximize();
	        break;
	        
		default:
	        throw new RuntimeException("Browser not supported");
		}
		
		
	}
	
	@Test
	public void verifyTitle() {
		cd.get("https://www.google.com/");
		String ExpectedTitle = "Google";
		String ActualTitle = cd.getTitle();
		
		AssertJUnit.assertEquals(ExpectedTitle, ActualTitle);
		
	}
	@AfterMethod
	public void BrowserQuit() {
		cd.quit();
	}

}
