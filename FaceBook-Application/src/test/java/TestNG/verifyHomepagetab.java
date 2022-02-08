package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.FaceBookHomePage;
import POM.LogOut;
import POM.Loginpage;

public class verifyHomepagetab {
	
	private WebDriver driver;
	private Loginpage loginpage;
	private LogOut logout;
	private FaceBookHomePage homepage;
	
	
	@BeforeClass
	public void LaunchBrowser() {	
		System.setProperty("webdriver.chrome.driver","C:\\Shubham\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void Login() {
		driver.get("https://www.facebook.com/");
		loginpage = new Loginpage(driver);
		loginpage.SendUsername();
		loginpage.SendPassword();
		loginpage.ClickonLogin();
	}
	
	@Test(priority = 2)
	public void TOverifyProfile() throws InterruptedException {
		System.out.println("TOverifyProfile");
		homepage = new FaceBookHomePage(driver);
		homepage.profile();	
		Thread.sleep(5000);
	}
	@Test(priority = 3)
	public void ToverifyFriends() throws InterruptedException {
		System.out.println("ToverifyFriends");
		homepage = new FaceBookHomePage(driver);
		homepage.friends();	
		Thread.sleep(5000);
	}
	@Test(priority = 1)
	public void ToverifyGroups() throws InterruptedException {
		System.out.println("ToverifyGroups");
		homepage = new FaceBookHomePage(driver);
		homepage.groups();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void ToverifyMarketPlace() throws InterruptedException {
		System.out.println("ToverifyMarketPlace");
		homepage = new FaceBookHomePage(driver);
		homepage.marketplace();
		Thread.sleep(5000);
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
