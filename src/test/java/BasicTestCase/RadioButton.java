package BasicTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
List <WebElement> radiobuttonlist = cd.findElements(By.xpath("//input[@type='radio']"));
        
        System.out.println("Total no. of Radio Button on web page " + radiobuttonlist.size());
        Thread.sleep(2000);
        cd.quit();

	}

}
