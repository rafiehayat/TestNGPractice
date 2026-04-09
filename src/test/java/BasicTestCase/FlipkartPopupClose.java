package BasicTestCase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartPopupClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver cd = new ChromeDriver();
	        cd.manage().window().maximize();
	        cd.get("https://www.flipkart.com/");
	        
//	        WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(10));
	        
	        try {
	        	Thread.sleep(1000);
	            
	            Actions action = new Actions(cd);
	            action.sendKeys(Keys.ESCAPE).build().perform();
	            
	            System.out.println("Sent Escape key to close popup.");
	        } catch (Exception e) {
	            System.out.println("Popup did not appear or could not be closed: " + e.getMessage());
	        }

	}

}
