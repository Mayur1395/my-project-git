package myproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Multiple_windows
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarvadnya\\eclipse\\myproject\\Browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowId=driver.getWindowHandles();  // stored the window id
		//Using Arraylist we switch windows one by one
//		List<String> l1 = new ArrayList(windowId);  //convert set to list
//		String parentid=l1.get(0);
//		String childid=l1.get(1);
//		
//		System.out.println(parentid);
//		System.out.println(childid);
//		 
//		
//		String parentTitle=driver.getTitle();
//		System.out.println(parentTitle);
//		
//		driver.switchTo().window(childid);
//		String childTitle=driver.getTitle();
//		
//		System.out.println(childTitle);

		
		// using for loop it easier to switch windows 
		for(String newid:windowId)
		{
		    // to get id we simply print the statement and gives the parameter string object
			System.out.println(newid);
		    String Title=driver.switchTo().window(newid).getTitle();
			System.out.println(Title);
		}
		//driver.close();  we can use for close the current window
	    driver.quit();   // using this method we close all browser window
	}

}
