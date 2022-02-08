package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ForgetPage;
import POM.Mainpagebutton;

public class ValidateForgetAcc {
	private WebDriver driver;
	private Mainpagebutton mainpagebutton;
	private ForgetPage forgetpage;
	
	@BeforeClass
	public void Launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Shubham\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@BeforeMethod
	public void ClickonForget() {
		mainpagebutton = new Mainpagebutton(driver);
		mainpagebutton.ClickonForgetPassword();
	}
	
	@Test
	public void SearchUser() {
		forgetpage = new ForgetPage(driver);
		forgetpage.SendMobileno();
		forgetpage.ClickonSearch();

	}
	
	@AfterMethod
	public void aftermethod() {
		forgetpage.Clickonfacebooklogo();

	}
	
	@AfterClass
	public void afterclass() {
		driver.close();

	}

}
