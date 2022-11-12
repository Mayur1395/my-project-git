package myproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass 
{
    // To get test data from excel sheet we are using this
	// So we need pass two parameters 1-rowindex 2-column index
	public static String getdata(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Sarvadnya\\eclipse\\myproject\\TestData\\Data.xlsx");
	    Sheet sh =WorkbookFactory.create(file).getSheet("sheet1");
	    String value =sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	    return value;
	    
	}
	//To capture screenshot we are using below method
	//We pass two parameters 1-driver, 2-TestcaseTD
    public static void capturescreenshot(WebDriver driver, int TestCaseID) throws IOException
    {
    	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File dest = new File("C:\\selenium1\\screenshot\\TCID"+TestCaseID+".jpg");
    	FileHandler.copy(src, dest);
    	//"C:\selenium1\screenshot"
    }
    public static String getdataPF(String key) throws IOException
    {
    	FileInputStream file = new FileInputStream("C:\\Users\\Sarvadnya\\eclipse\\myproject\\Property file.properties");
    	Properties p = new Properties();
    	p.load(file);
    	
    	String value =p.getProperty(key);
    	return value;
    	
    	
    }
}
