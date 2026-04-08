package BasicTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FlipkartLogin {

    public static void main(String[] args) {
        ChromeDriver cd = new ChromeDriver();
        cd.manage().window().maximize();
        cd.get("https://www.flipkart.com/");
        
        WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(10));
        
        try {
            WebElement signupLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("New to Flipkart? Create an account")));

            JavascriptExecutor js = (JavascriptExecutor) cd;
            js.executeScript("arguments[0].click();", signupLink);


            WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class, 'c3Bd2c')]")));
            
            phoneInput.sendKeys("7979973557");
            System.out.println("Phone number entered successfully!");
            
            WebElement ExistingUser = cd.findElement(By.xpath("//a[contains(@class, 'dSM5Ub')]"));
            ExistingUser.click();
            System.out.println("enter regsitered Number -: ");

            
        } catch (Exception e) {
            System.out.println("Error encountered: " + e.getMessage());
        } finally {
            // cd.quit(); // Uncomment this when you want to close the browser automatically
        }
    }
}