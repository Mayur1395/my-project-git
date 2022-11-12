package myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_homepage 
{
	@FindBy (xpath="//a[@id=\"nav-logo-sprites\"]")private WebElement logo;
	@FindBy (xpath="//span[text()='Hello, Mayur']")private WebElement txt;
	
	public A_homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifylogodisplayed()
	{
		boolean act=logo.isDisplayed();
		//System.out.println("if logo is displayed verification passed");
		return act;
		
	}
	public String getprofilename()
	{
		String pn=txt.getText();
		return pn;
		
	}
//	public void verifyprofilename(String name)
//	{
//		String actname=txt.getText();
//		
//		
//		if(actname.equals(name))
//		{
//			System.out.println("Test case passed");
//		}
//		else
//		{
//			System.out.println("Test case failed");
//		}
		
		
	

}
