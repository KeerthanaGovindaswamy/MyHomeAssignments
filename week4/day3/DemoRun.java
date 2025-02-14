package week4.day3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoRun {

		public ChromeDriver driver; //make driver global variable
		String filename;
		
			@Parameters({"url","username","password"})     //static parameters
			@BeforeMethod  //2
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
			
			@AfterMethod //6
			public void postCondition() {
				driver.close();
			}
			
			@DataProvider //4 read data from excel
			public String[][] setData() throws IOException {
				return ReadDataFromExcel.ReadTestData(filename);
				
			}
			@BeforeTest  //1
			public void setFilename() {
				filename = "Name_LegalEntity";
			}
			@Test(dataProvider="setData")  //3
			public void verifyLegalEntity(String name) { //5 getting data from excel
				//Click on the toggle menu button from the left corne
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
				//Click View All and click Legal Entities from App Launcher
				driver.findElement(By.xpath("//button[text()='View All']")).click();
				WebElement clickelement = driver.findElement(By.xpath("//ul/li//p[text()='Legal Entities']"));
				Actions actobj = new Actions(driver);
				actobj.moveToElement(clickelement).click().perform();
				
				//Click on New Legal Entity
				driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
				
				//Enter Name as 'Salesforce Automation by *Your Name*'(Parameterized value)
				driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Sales force automation by "+ name);
				//click on save
				driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
				//verify Legal Entity Name
				WebElement nameElement = driver.findElement(By.xpath("//div[@class='toastContent slds-notify__content']"));
				boolean alertCheck = nameElement.isDisplayed();
				String capturedName = nameElement.getText();
				if(alertCheck == true) {
					System.out.println(capturedName + " Legal entity created is veryfied Successfully");
				}else {
					System.out.println(" Legal entity not created Successfully");
				}
					
				
		}

	}


