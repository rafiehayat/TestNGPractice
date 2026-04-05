package BasicTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
		
		WebElement element = cd.findElement(By.className("form-select"));
		
		Select dropdown = new Select(element);
//		dropdown.selectByVisibleText("Afghanistan");
//		dropdown.selectByValue("Afghanistan");
		dropdown.selectByIndex(1);
		
		
		if(dropdown.isMultiple())
		{
			System.out.println("DropDown is Multiple");
		}
		else
		{
			System.out.println("DropDown is not Multiple");

		}
		List <WebElement> allDropdownOptions = dropdown.getOptions();
		System.out.println("Total Options: " + allDropdownOptions.size());
		
		for(WebElement el: allDropdownOptions)
		{
			System.out.println(el.getText());
		}


	}

}
