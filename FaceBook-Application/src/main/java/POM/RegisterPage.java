package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage 
{
	@FindBy(xpath = "//input[@placeholder='First name']")private WebElement Firstname;
	@FindBy(xpath = "//input[@name='lastname']")private WebElement Lastname;
	@FindBy(xpath = "//input[@name='reg_email__']")private WebElement EmailID;
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")private WebElement confirmemail;
	@FindBy(xpath = "//input[@name='reg_passwd__']")private WebElement Password;
	@FindBy(xpath = "//select[@title='Day']")private WebElement Day;
	@FindBy(xpath = "//select[@title='Month']")private WebElement Month;
	@FindBy(xpath = "//select[@title='Year']")private WebElement Year;
	@FindBy(xpath = "//label[text()='Male']")private WebElement Gender;
	@FindBy(xpath = "//img[@class='_8idr img']")private WebElement ClosenewRegister;
	
	public RegisterPage(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
		
	}
	
	public void SendFirstname() {
		Firstname.sendKeys("Shubham");
	}
	public void SendLastname() {
		if(Lastname.isEnabled()) {
			Lastname.sendKeys("Abuj");
		}
	}
	public void SendEmailID() {
		if(EmailID.isEnabled()) {
			EmailID.sendKeys("noharahinu123@gmail.com");
		}
	}
	public void Sendconfirmemail() {
		if(confirmemail.isEnabled()) {
			confirmemail.sendKeys("noharahinu123@gmail.com");
		}
	}
	public void SendPassword() {
		if(Password.isEnabled()) {
			Password.sendKeys("7482426");
		}
	}
	public void SelectDay() {
		if(Day.isEnabled()) {
			Select D = new Select (Day);
			D.selectByVisibleText("18");
		}
	}
	public void SelectMonth() {
		if(Month.isEnabled()) {
			Select M = new Select(Month);
			M.selectByVisibleText("Apr");
		}
	}
	public void SelectYear() {
		if(Year.isEnabled()) {
			Select Y = new Select(Year);
			Y.selectByVisibleText("1999");
		}
	}
	public void ClickonGender() {
		if(Gender.isEnabled()) {
			Gender.click();
		}
	}
	public void Clickonclose() {
		ClosenewRegister.click();
	}
}	

