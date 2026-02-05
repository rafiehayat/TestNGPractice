package EncodePasswordDemo;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncodePasswordExample {

    public static void main(String[] args) {

        // Password stored in encoded form
        String encodedPassword = "c2VjcmV0X3NhdWNl"; // admin123

        // Decode password before use
        String decodedPassword = new String(
                Base64.getDecoder().decode(encodedPassword),
                StandardCharsets.UTF_8
        );

        WebDriver cd = new ChromeDriver();
        cd.manage().window().maximize();
        cd.get("https://www.saucedemo.com/");

        cd.findElement(By.id("user-name")).sendKeys("standard_user");
        cd.findElement(By.id("password")).sendKeys(decodedPassword);
        
        cd.findElement(By.id("login-button")).click();
    }
}


              // To Encrypt a Password
//String password = "admin123";
//
//// Encode password
//String encodedPassword = Base64.getEncoder()
//        .encodeToString(password.getBytes(StandardCharsets.UTF_8));
//
//System.out.println("Encoded Password: " + encodedPassword);
