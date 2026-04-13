package BasicTestCase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		 ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");

	        String timeStamp =
	                new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	        
	        WebElement section = driver.findElement(By.id("LS8OJ"));

//	        File src = ((TakesScreenshot) driver)
//	                .getScreenshotAs(OutputType.FILE);
	        
	        File src = section.getScreenshotAs(OutputType.FILE);

	        File dest = new File("/Users/rafiehayat/Desktop/google_" + timeStamp + ".png");

	        FileHandler.copy(src, dest);

	}

}
