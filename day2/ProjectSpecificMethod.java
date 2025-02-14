package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

//this is the base class
//paramaterize url,login credentials
public class ProjectSpecificMethod {
	public ChromeDriver driver; //make driver global variable
	
	@BeforeMethod
	public void preCondition() {
		//ChromeOptions instance to customize Chrome
        ChromeOptions options = new ChromeOptions();

// Adding an argument to disable notifications
        options.addArguments("--disable-notifications"); 
// Initialize ChromeDriver with the ChromeOptions
        driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the login credentials
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		//click on login
		driver.findElement(By.id("Login")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}


}
