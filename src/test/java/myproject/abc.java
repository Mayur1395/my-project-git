package myproject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class abc 
{
	@BeforeClass
	public void beforeclass()
	{
		Reporter.log("open browser", true);
	}
	@BeforeMethod
	public void beforem1()
	{
		Reporter.log("execute before test case ", true);
	}
	@Test (priority=2)
	public void TC1()
	{
        Reporter.log("Running TC1", true);
	}
	@Test (priority=1)
	public void TC2()
	{
		//Assert.fail();
		Reporter.log("Running TC2", true);
	}
	@AfterMethod
	public void aftermethod()
	{
        Reporter.log("Execute after test case", true);
	}
	@AfterClass
	public void afterclass()
	{
		Reporter.log("close browser", true);
	}

}
