package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class IsDisplayed 
{
	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver. manage().window().maximize();
		WebElement amz=driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
		Assert.assertEquals(true, amz.isDisplayed());
		System.out.println("amazon logo is displayed - Assert passed");
		
		
	}

}
