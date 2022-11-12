package myproject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLinks 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		int brokenlink=0;
		for(WebElement links:link)
		{
			String url =links.getAttribute("href");
			if(url==null) 
			{
				System.out.println("url is empty it not in broken links"+ url);
				continue;
			}
			URL link1 = new URL(url);
			try 
			{
				//URL link1 = new URL(url);
				HttpURLConnection http = (HttpURLConnection)link1.openConnection();
				http.connect();
				
				if(http.getResponseCode()>=400)
				{
					System.out.println(http.getResponseCode()+url +"is"+  "broken link");
					brokenlink++;
				}
				else
				{
					System.out.println(url+"is not broken link"); 
				}
				
			} catch (Exception e) {
				
			}
		}
		
		System.out.println(brokenlink);
	}
}
