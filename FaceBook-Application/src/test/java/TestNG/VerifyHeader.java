package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.HeaderofFacebook;
import POM.LogOut;
import POM.Loginpage;

public class VerifyHeader {
	
	private WebDriver driver;
	private Loginpage loginpage;
	private LogOut logout;
	private HeaderofFacebook header;
	
	@BeforeClass
	public void LaunchBrowser() {	
		System.setProperty("webdriver.chrome.driver","C:\\Shubham\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void Login() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		loginpage = new Loginpage(driver);
		loginpage.SendUsername();
		loginpage.SendPassword();
		loginpage.ClickonLogin();
		
	}
	
	@Test(priority = 3)
	private void ClickWatch() throws InterruptedException {
		header =new HeaderofFacebook(driver);
		header.ClickWatchTab();
		String Watch = driver.getCurrentUrl();
		System.out.println(Watch);
		
	}
	@Test(priority = 4)
	private void Clickgroups() {
		header =new HeaderofFacebook(driver);
		header.ClickgropusTab();	
		String Groups = driver.getCurrentUrl();
		System.out.println(Groups);
		Assert.assertEquals(Groups, "https://www.facebook.com/groups/feed/");
	}
	
	@Test(priority = 6)
	private void ClickMarket() {
		header =new HeaderofFacebook(driver);
		header.ClickmarketplaceTab();
		String Market = driver.getCurrentUrl();
		System.out.println(Market);
		Assert.assertEquals(Market, "https://www.facebook.com/marketplace/?ref=app_tab");
	}
	
	@Test(priority = 5)
	private void Clickmanu() {
		header =new HeaderofFacebook(driver);
		header.ClickmanuTab();
		String Manu = driver.getCurrentUrl();
		System.out.println(Manu);
		Assert.assertEquals(Manu, "https://www.facebook.com/shubham.abuj.94/");
	}
	
	@Test(priority = 2)
	private void ClickNotification() {
		header =new HeaderofFacebook(driver);
		header.ClicknotificationTab();	
	}
	
	@Test(priority = 1)
	private void Clickmassanger() {
		header =new HeaderofFacebook(driver);
		header.ClickmassangerTab();
	}
	
	@AfterMethod
	private void LogOut() throws InterruptedException {
		logout = new LogOut(driver);
		logout.ClickAccount();
		Thread.sleep(3000);
		logout.ClickLogout();
		
	}
	@AfterClass
	private void Close() {
		driver.close();
	}
	
}

