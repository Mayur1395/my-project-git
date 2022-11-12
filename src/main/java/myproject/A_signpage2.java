package myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_signpage2 
{
    @FindBy(xpath="//input[@id=\"ap_password\"]") private WebElement pwd;
    @FindBy (xpath="//input[@id=\"signInSubmit\"]")private WebElement SignBtn;
    
    public A_signpage2(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterpassword(String password)
    {
    	pwd.sendKeys(password);
    }
    public void clickSignBtn()
    {
    	SignBtn.click();
    }
}
