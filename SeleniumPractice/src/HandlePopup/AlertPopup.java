package HandlePopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {


	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "I:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		WebElement ele = driver.findElement(By.xpath("//input[@name='prompt']"));
		ele.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
		alt.sendKeys("Balaji Hujare");
		System.out.println(driver.switchTo().alert().getText());
		alt.accept();
		
		
		
		
		
		
		
		
		
		

	}

}
