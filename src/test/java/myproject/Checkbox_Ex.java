package myproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Ex 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarvadnya\\eclipse\\myproject\\Browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click specfic 1 checkbox
		//driver.findElement(By.xpath("//input[@id=\"monday\"]")).click();
		
		List<WebElement> checkboxex=driver.findElements(By.xpath("(//div[@class=\"card-body\"])[2]//div"));
		System.out.println(checkboxex.size());
		for(WebElement allboxex:checkboxex)
		{
			//System.out.println(allboxex.click());
		}
//		for(int i=1; i<=checkboxex.size(); i++)
//		{
//			if( i==1 || i==2 || i==3)
//			{
//				break;
//			}
//			else
//			{
//				System.out.println(checkboxex.click());
//			}
//	}
	}

}
