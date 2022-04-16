package HandlePopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "I:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/checkbox.html");
		WebElement chkbox= driver.findElement(By.xpath("//input[@id='a']"));
		boolean result=chkbox.isSelected();
		if(result)
		{
			System.out.println("already selected");
		}
		else 
		{
			System.out.println("already not selected");
			chkbox.click();
		}
	
	}

}
