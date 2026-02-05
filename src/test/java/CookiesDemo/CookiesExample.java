package CookiesDemo;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		
		
		Thread.sleep(5000);
		Set <Cookie> CookiesList = cd.manage().getCookies();
		
		System.out.println("Size" + CookiesList.size());
		
//		for(Cookie ck : CookiesList)
//		{
//			System.out.println(ck.getName() + " : " + ck.getValue() );
//		}
		
		//Get Specific Cookie according to name
		System.out.println(cd.manage().getCookieNamed("i18n-prefs"));
		
		
		Thread.sleep(10000);
		cd.quit();

	}

}
