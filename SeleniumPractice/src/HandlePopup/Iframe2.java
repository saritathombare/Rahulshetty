package HandlePopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "I:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(outerframe);
		WebElement innerframe= driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		
		
		
	}

}
