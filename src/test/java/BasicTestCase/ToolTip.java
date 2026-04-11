package BasicTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://dequeuniversity.com/library/aria/tooltip");
		
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
