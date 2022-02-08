package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookHomePage {
	
	@FindBy(xpath = "//span[text()='Shubham Abuj']")private WebElement Profile;
	@FindBy(xpath = "//span[text()='Friends']")private WebElement Friends;
	@FindBy(xpath = "//span[text()='Groups']")private WebElement Groups;
	@FindBy(xpath = "//span[text()='Marketplace']")private WebElement Marketplace;
	@FindBy(xpath = "//span[text()='Watch']")private WebElement Watch;
	
	public FaceBookHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void profile() {
		Profile.click();
	}
	
	public void friends() {
		Friends.click();
	}
	
	public void groups() {
		Groups.click();
	}
	
	public void marketplace() {
		Marketplace.click();
	}
	
	public void watch() {
		Watch.click();
	}
	
}
