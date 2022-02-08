package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.LogOut;
import POM.Loginpage;

public class VerifyLogin {
	
	private WebDriver driver;
	private Loginpage loginpage;
	private LogOut logout;
	
	@BeforeClass
	public void LaunchBrowser() {	
		System.setProperty("webdriver.chrome.driver","C:\\Shubham\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void OpenLoginapage() {
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void Logincredintials() {
		loginpage = new Loginpage(driver);
		loginpage.SendUsername();
		loginpage.SendPassword();
		loginpage.ClickonLogin();
		
	}
		
	@AfterMethod
	public void LogOut() throws InterruptedException {
		logout = new LogOut(driver);
		logout.ClickAccount();
		Thread.sleep(3000);
		logout.ClickLogout();
	}
	
	@AfterClass
	public void BrowserClose() {	
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	

}
