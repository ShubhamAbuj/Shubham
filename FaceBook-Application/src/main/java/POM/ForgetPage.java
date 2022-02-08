package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPage {
	@FindBy(xpath = "//input[@type='text']")private WebElement Mobileno;
	@FindBy(xpath = "//button[text()='Search']")private WebElement SearchButton;
	@FindBy(xpath = "//a[@aria-label='Facebook']")private WebElement Fecebooklogo;
	public ForgetPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void SendMobileno() {
		Mobileno.sendKeys("9075668556");
	}

	public void ClickonSearch() {
		SearchButton.click();
	}
	
	public void Clickonfacebooklogo() {
		Fecebooklogo.click();
	}
	
}
