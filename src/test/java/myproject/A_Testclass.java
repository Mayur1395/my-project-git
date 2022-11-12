package myproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class A_Testclass extends baseclass 
{
	A_firstpage page1;
	A_signpage sign1;
	A_signpage2 sign2;
	A_homepage home;
	Sheet sh;
	int TestCaseID;
	//WebDriver driver;
	@BeforeClass  //declare one time activity in that ex open browser object of pom classes
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
//		FileInputStream file = new FileInputStream("C:\\selenium1\\Data.xlsx");
//	    sh =WorkbookFactory.create(file).getSheet("sheet1");
				
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    initalizeBrowser();
	    page1 = new A_firstpage(driver);
		sign1 = new A_signpage(driver);
		sign2 = new A_signpage2(driver);
		home = new A_homepage(driver);
	}
	@BeforeMethod  // here we mention pom classes value
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		page1.clicksign();
		
		sign1.enterusername(utilityclass.getdataPF("UN"));
		sign1.clickCnBtn();
		
		sign2.enterpassword(utilityclass.getdataPF("PWD"));
		sign2.clickSignBtn();
		//home.verifylogodisplayed();
	}
	@Test
	public void Verifyprofilename() throws EncryptedDocumentException, IOException
	{
	
		//A_homepage home = new A_homepage(driver);
		//String expvalue=sh.getRow(0).getCell(2).getStringCellValue();
		//home.verifylogodisplayed();
		TestCaseID = 100;
		String actvalue = home.getprofilename();
		String expvalue=(utilityclass.getdata(0, 2));
		
		Assert.assertEquals(expvalue, actvalue);
		
	}	
//	@Test
//	public void verifylogo()
//	{
//		//boolean actvalue1=home.verifylogodisplayed();
//		Assert.assertTrue( home.verifylogodisplayed());
//		Reporter.log("Amazon logo is displayed - Assert Passed", true);
//	}
	@AfterMethod
	public void logoutApp(ITestResult result) throws IOException
	{
		//failed test screenshot code we are mention under this
		if(result.getStatus()==ITestResult.FAILURE)
		{
			utilityclass.capturescreenshot(driver, TestCaseID);
		}
		
	}
    @AfterClass
    public void closebrowser()
    {
    	//driver.close();
    	page1=null;
    	sign1=null;
    	sign2=null;
    	home=null;
    	driver=null;
    	
    }
}
