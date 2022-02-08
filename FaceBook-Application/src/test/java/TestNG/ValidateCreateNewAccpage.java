package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Mainpagebutton;
import POM.RegisterPage;

public class ValidateCreateNewAccpage {
	
	private WebDriver driver;
	private Mainpagebutton mainpagebutton;
	private RegisterPage newregister;
	
	@BeforeClass
	public void LaunchBrowser() {	
		System.setProperty("webdriver.chrome.driver","C:\\Shubham\\software testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@BeforeMethod
	public void OpenCreateNewAcc() {
		mainpagebutton = new Mainpagebutton(driver);
		mainpagebutton.ClickonCreatenewacc();
		newregister = new RegisterPage(driver);
	}
	
	@Test
	public void NewCredentials() {
		
		
		newregister.SendFirstname();
		newregister.SendLastname();
		newregister.SendEmailID();
		newregister.Sendconfirmemail();
		newregister.SendPassword();
		newregister.SelectDay();
		newregister.SelectMonth();
		newregister.SelectYear();
		newregister.ClickonGender();
		
	}
		
	@AfterMethod
	public void Closebutton() {
		System.out.println("Close");
		newregister.Clickonclose();
	}
	
	@AfterClass
	public void BrowserClose() {	
		driver.close();
		System.out.println("Close");
	}	
	

}
