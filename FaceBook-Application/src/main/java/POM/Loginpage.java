package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	@FindBy(xpath = "//input[@type='text']")private WebElement Username;
	@FindBy(xpath = "//input[@type='password']")private WebElement Password;
	@FindBy(xpath = "//button[@name='login']")private WebElement Login;	
	
	public Loginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void SendUsername() {
			Username.sendKeys("9075668556");
	}
	
	public void SendPassword() {
			Password.sendKeys("7482426");
	}
	
	public void ClickonLogin() {
			Login.click();
	}
	
	
	
}


