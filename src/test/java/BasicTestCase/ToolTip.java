package BasicTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://dequeuniversity.com/library/aria/tooltip");
		
		WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(10));

		WebElement acceptBtn = wait.until(
		    ExpectedConditions.elementToBeClickable(
		        By.id("cookie-alert-accept")		    )
		);

		acceptBtn.click();
		
		String actualToolTip = cd.findElement(By.xpath("//input[@id='lastInput']")).getAttribute("data-tooltip");
		System.out.println(actualToolTip);
		String expectedTooltip = "Your surname or family name. This tooltip has a custom styling.";
		
		if(actualToolTip.equals(expectedTooltip))
		{
			System.out.print("Test Passed");
		}
		else
			System.out.print("Test Failed");
		

	}

}
