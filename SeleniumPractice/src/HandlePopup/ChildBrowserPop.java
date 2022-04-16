package HandlePopup;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "I:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]")).click();
	    driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]")).click();
		
	
		
		
		ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
		
		System.out.println(addr.size());
		Iterator<String> it =addr.iterator();
		
		//while loop to get all  window main+child url
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getCurrentUrl());
		}
		
		//other method
		/*
		WebElement alert = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirm = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement prompt = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement line = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		alert.click();
		confirm.click();
		prompt.click();
		line.click();
		 * String mainPage = driver.getWindowHandle();
		System.out.println(mainPage);
		addr.get(0);
		addr.get(1);
		addr.get(2);
		addr.get(3);
		addr.get(4);
		System.out.println(addr.get(0));
		System.out.println(addr.get(1));
		System.out.println(addr.get(2));
		System.out.println(addr.get(3));
		System.out.println(addr.get(4));
		
		driver.switchTo().window(addr.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(2));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(3));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(4));
		System.out.println(driver.getCurrentUrl());*/
		
		
		
	}

}




