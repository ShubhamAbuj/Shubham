package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpagebutton {

	@FindBy(xpath = "//button[@name='login']")private WebElement Loginbutton;
	@FindBy(xpath = "//a[text()='Forgotten password?']")private WebElement ForgetPassword;
	@FindBy(xpath = "//a[text()='Create New Account']")private WebElement CreateNewAccount;
	
	public Mainpagebutton(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
	public void ClickonLoginButton() {
		Loginbutton.click();
	}
	public void ClickonForgetPassword() {
			ForgetPassword.click();
	}
	public void ClickonCreatenewacc() {
			CreateNewAccount.click();
	}
	
	
	
}
