package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class DemoDynamicPara {
public ChromeDriver driver; //make driver global variable
	
	@Parameters({"url","username","password"})     //static parameters
	@BeforeMethod
	public void preCondition(String URL,String uName,String pwd) {
		//ChromeOptions instance to customize Chrome
        ChromeOptions options = new ChromeOptions();

// Adding an argument to disable notifications
        options.addArguments("--disable-notifications"); 
// Initialize ChromeDriver with the ChromeOptions
        driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the login credentials
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		//click on login
		driver.findElement(By.id("Login")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
