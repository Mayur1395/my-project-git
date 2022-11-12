package myproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicelement 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sarvadnya\\eclipse\\myproject\\Browsers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("8669059022");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("9763224009");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"field-keywords\"]")).sendKeys("iphone 12");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
		String s1=driver.findElement(By.xpath("((//div[@class=\"a-section a-spacing-small a-spacing-top-small\"])[4]//span)[5]")).getText();
		System.out.println(s1);
	}

}
