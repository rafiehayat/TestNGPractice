package CookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddDeleteCookie {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		
		
		Thread.sleep(5000);
		Set <Cookie> CookiesList = cd.manage().getCookies();
		
		System.out.println("Before adding cookie Size" + CookiesList.size());
		
		
		for(Cookie ck : CookiesList)
		{
			System.out.println(ck.getName() + " : " + ck.getValue() );
		}
		
		// Create Cookie
		Cookie CookieObj = new Cookie("TestCookie", "www.amazon.in" );
		
		//Add Cookie to browser
		Thread.sleep(5000);
		cd.manage().addCookie(CookieObj);
		
		//capture all the Cookies
		CookiesList = cd.manage().getCookies();
		
        System.out.println("\n \n After adding cookie Size" + CookiesList.size());
		
		
		for(Cookie ck : CookiesList)
		{
			System.out.println(ck.getName() + " : " + ck.getValue() );
		}
		
		//Delete A Cookie
//		cd.manage().deleteCookie(CookieObj);
//		cd.manage().deleteCookieNamed("TestCookie");
		cd.manage().deleteAllCookies();
		
		//capture all the Cookies
		CookiesList = cd.manage().getCookies();
				
		System.out.println("\n \n After deleting cookie Size" + CookiesList.size());
				
				
				for(Cookie ck : CookiesList)
				{
					System.out.println(ck.getName() + " : " + ck.getValue() );
				}
		
		Thread.sleep(10000);
		cd.quit();

	}

}
