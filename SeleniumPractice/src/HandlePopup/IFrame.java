package HandlePopup;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "I:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		/*
		//1st frame
		driver.switchTo().frame("packageListFrame");
		String text1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
		System.out.println(text1);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		//2nd frame
		driver.switchTo().frame("packageFrame");
		String text2=driver.findElement(By.xpath("//span[text()='Alert']")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		driver.switchTo().defaultContent();
		
		//3rd frame
		Thread.sleep(2000);
		driver.switchTo().frame("classFrame");
		String text3=driver.findElement(By.xpath("//h2[@title='Interface Alert']")).getText();
		System.out.println(text3);
		*/
		
	//	/*
		//Print all links in iframe1 by advanced for loop
		driver.switchTo().frame("packageListFrame");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link:links) 
		{
			System.out.println(link.getText());
		}
	//	*/
		
		/*
		//Print all links in iframe1 by simple for loop
		driver.switchTo().frame("packageListFrame");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<=links.size();i++) 
		{
			String link=links.get(i).getText();
			System.out.println(link);
		}
		*/
		
		/*
	    //Print all links in iframe1 by Iterator
		driver.switchTo().frame("packageListFrame");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Iterator<WebElement> itr = links.iterator();
		
		while(itr.hasNext()) 
		{
			String linkprint=itr.next().getText();
			System.out.println(linkprint);
		}
		*/
		
			
		
		
		
		
	}

}
