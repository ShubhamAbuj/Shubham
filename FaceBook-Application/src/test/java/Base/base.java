package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class base {
	public static WebDriver OpenChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Shubham\\software testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;	
	}
	public static WebDriver OpenFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Shubham\\software testing\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	public static WebDriver OpenOperaBrowser() {
		System.setProperty("webdriver.opera.driver","C:\\Shubham\\software testing\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		return driver;
	}

}
