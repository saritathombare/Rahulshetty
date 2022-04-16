package HandlePopup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "I:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
    	List<WebElement> staticDropdowns=driver.findElements(By.id("testingDropdown"));
    	for(WebElement option:staticDropdowns)
    	{
    	System.out.println(option.getText());
    	}
    	
    	System.out.println("******************************************************");
    	
    	WebElement staticDropdown = driver.findElement(By.id("testingDropdown"));
		Select dropdown = new Select(staticDropdown);
    	dropdown.selectByIndex(0);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
    	System.out.println("******************************************************");

    	dropdown.selectByValue("Performance");
    	System.out.println(dropdown.getFirstSelectedOption().getText());
    	
    	System.out.println("******************************************************");

    	
    	dropdown.selectByVisibleText("Manual Testing");
    	System.out.println(dropdown.getFirstSelectedOption().getText());
    	
    	
       
	}

}
