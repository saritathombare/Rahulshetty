package HandlePopup;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "I:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.1keydata.com/sql/alter-table-rename-column.html");
		

		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("J:\\CLASS VIDEOS\\January\\19 Jan 2022 Auto-TakeScreenshot Man-QA\\123.jpg");
		FileHandler.copy(src, dest);
	}

}
