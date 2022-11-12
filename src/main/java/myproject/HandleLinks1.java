package myproject;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleLinks1

{
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		driver.findElement(By.partialLinkText("Today's")).click();
		
		//How to capture all the links from webpage
		
		List<WebElement> link= driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		//for printing we are using for loop and for each loop
//		for(int i=0; i<=link.size(); i++)
//		{
//			System.out.println(link.get(i).getText());
//		}
		
		for(WebElement lin:link)
		{
			System.out.println(lin.getText());
		}
		
	
		
	}

}
