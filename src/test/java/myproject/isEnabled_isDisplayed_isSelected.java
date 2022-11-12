package myproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_isDisplayed_isSelected 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sarvadnya\\eclipse\\myproject\\Browsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//isenabled and is displyaed for this we check any elements
		WebElement w1=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		System.out.println(w1.isDisplayed()); //True
		System.out.println(w1.isEnabled());   //true
		
		//isselected    use for radio button, checkboxes, dropdown
		WebElement m1=driver.findElement(By.xpath("//span[@class=\"male\"]"));
		
		WebElement f1=driver.findElement(By.xpath("//span[@class=\"female\"]"));
		
		System.out.println(m1.isSelected());  //false
		System.out.println(f1.isSelected());  //false
		
		m1.click();
		System.out.println(m1.isSelected());//True
		System.out.println(f1.isSelected());//False
		
		
		
	}

}
