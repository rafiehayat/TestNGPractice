package DemoTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class LoginForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.saucedemo.com/");
		
//		cd.findElement(By.id("user-name")).sendKeys("standard_user");
//        cd.findElement(By.id("password")).sendKeys("secret_sauce");
//        
//        cd.findElement(By.id("login-button")).click();
		
		Actions actions = new Actions(cd);
		Action seriesOfAction = actions
				.moveToElement(cd.findElement(By.id("user-name")))
				.click()
				.sendKeys("standard_user" ,Keys.TAB)
				.sendKeys("secret_sauce" , Keys.ENTER).build();
		seriesOfAction.perform();
		
		

	}

}
