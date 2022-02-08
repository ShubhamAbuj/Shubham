package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderofFacebook {
	
	@FindBy(xpath = "//a[@aria-label='Watch']")private WebElement WatchTab;
	@FindBy(xpath = "(//a[@aria-label='Marketplace'])[1]")private WebElement MarketplaceTab;
	@FindBy(xpath = "//a[@aria-label='Groups']")private WebElement GroupsTab;
	@FindBy(xpath = "//div[@aria-label='Menu']")private WebElement ManuTab;
	@FindBy(xpath = "(//div[@aria-label='Messenger'])[1]")private WebElement MassangerTab;
	@FindBy(xpath = "//a[@aria-label='Notifications']")private WebElement NotificationTab;
	@FindBy(xpath = "//div[@aria-label='Account']")private WebElement AccountTab;
	
	
	public HeaderofFacebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickWatchTab() {
		WatchTab.click();
	}
	public void ClickmarketplaceTab() {
		MarketplaceTab.click();
	}
	public void ClickgropusTab() {
		GroupsTab.click();
	}
	public void ClickmanuTab() {
		ManuTab.click();
	}
	public void ClickmassangerTab() {
		MassangerTab.click();
	}
	public void ClicknotificationTab() {
		NotificationTab.click();
	}
	public void ClickaccountTab() {
		AccountTab.click();
	}
	
}
