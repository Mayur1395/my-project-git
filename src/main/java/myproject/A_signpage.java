package myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_signpage
{
	@FindBy (xpath="//input[@id=\"ap_email\"]")private WebElement UN;
	@FindBy (xpath="//input[@id=\"continue\"]")private WebElement CnBtn;
	
	public A_signpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String username)
	{
		UN.sendKeys(username);
	}
	public void clickCnBtn()
	{
		CnBtn.click();
	}

}
