package BasicTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartMenuHover {

	public static void main(String[] args) {
		 ChromeDriver cd = new ChromeDriver();
	        cd.manage().window().maximize();
	        cd.get("https://www.flipkart.com/");
	        
	        
	        WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(10));
	        Actions actions = new Actions(cd);
	        
	        try {
	        	Thread.sleep(1000);
	            
	            Actions action = new Actions(cd);
	            action.sendKeys(Keys.ESCAPE).build().perform();
	            
	            System.out.println("Sent Escape key to close popup.");
	            
	            WebElement LoginMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Login')]")));
//	            WebElement MoreMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'More')]")));

	            
	            actions.moveToElement(LoginMenu).perform();
//	            actions.moveToElement(MoreMenu).perform();

	            
	            WebElement myProfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(.,'My Profile')]")));
	            
	            actions.moveToElement(myProfile).click().perform();
	            
	            System.out.println("Successfully clicked dropdown item!");
	            
	        } catch (Exception e) {
	        	e.printStackTrace();	        }
	        

	}

}
