package HandlePopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "I:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
		chooseFile.sendKeys("C:\\Users\\DASHRATH\\OneDrive\\Desktop\\New Text.txt");
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();

	}

}
