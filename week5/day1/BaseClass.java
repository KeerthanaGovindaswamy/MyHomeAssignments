package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public RemoteWebDriver driver;   
	
	@Parameters({"browser","url","Username","Password"})
	@BeforeMethod()   
	public void loadURLANDLogi(String browser,String url,String Uname,String Pwd) {  

		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge")){
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(Uname);
		driver.findElement(By.id("password")).sendKeys(Pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod()   
	public void clickLogoutButton() {
		driver.close();
	}

}
