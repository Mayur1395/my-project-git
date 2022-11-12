package myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_firstpage
{
	@FindBy (xpath="//span[text()='Hello, sign in']")private WebElement sign;
	
	public A_firstpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicksign()
	{
		sign.click();
	}

}
