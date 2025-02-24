package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseclassforDriverObject extends AbstractTestNGCucumberTests {
	public static RemoteWebDriver driver;
	//using testng annotations
	@BeforeMethod
	public void launchBrowser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}



}
