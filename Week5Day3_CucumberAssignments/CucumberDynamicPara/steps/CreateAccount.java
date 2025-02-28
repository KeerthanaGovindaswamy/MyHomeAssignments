package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends BaseClass{
	
	
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	//ChromeOptions instance to customize chrome
	        ChromeOptions options = new ChromeOptions();
	// Adding an argument to disable notifications
	        options.addArguments("--disable-notifications"); 
	// Initialize ChromeDriver with the ChromeOptions
	        driver = new ChromeDriver(options);   
	}

	@Given("Load the url")
	public void load_the_url() {
		driver.get("https://login.salesforce.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as_vidyar_testleaf_com(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as_sales(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);  
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("Login")).click();
	}

	@Then("it should navigate to next page")
	public void it_should_navigate_to_next_page() {
	   boolean checkPage=driver.findElement(By.xpath("(//span[text()='Home'])[3]")).isDisplayed();
	   if(checkPage==true) {
		   System.out.println("It got navigated to home page");
	   }else {
		   System.out.println("It did not navigate to home page");
	   }
	}


	@When("Click on toggle menu button")
	public void click_on_toggle_menu_button() throws InterruptedException {
		Thread.sleep(1000);
		 WebDriverWait waitObj = new WebDriverWait(driver,Duration.ofSeconds(20));
		  WebElement toffle =   driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		 waitObj.until(ExpectedConditions.elementToBeClickable(toffle));
		  toffle.click(); 
	}

	@When("Click on View all button")
	public void click_on_view_all_button() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@When("Click on Accounts from app launcher")
	public void click_on_accounts_from_app_launcher() {
		   WebElement accounts = driver.findElement(By.xpath("//ul/li[1]//p[text()='Accounts']"));
		    Actions actObj = new Actions(driver);
		    actObj.moveToElement(accounts).click().perform();
	}
	
	@When("Click on New Button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//div[@title='New']")).click();
	}
	
	@Given("Enter {string} as account name")
	public void enter_acc_name(String accname) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(accname);
	}
	
	@And("Select ownership as public")
	public void select_Ownership() {
		WebElement ownershipCombo = driver.findElement(By.xpath("(//div[@class='slds-combobox_container'])[4]//button"));
			driver.executeScript("arguments[0].click();", ownershipCombo);
		    driver.findElement(By.xpath("//span[text()='Public']")).click();
	}
	
	@When("Click Save button")
	public void click_saveButton() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		  boolean check =  driver.findElement(By.xpath("//div[@class='slds-list--inline']")).isDisplayed();
		   if(check=true) {
			   System.out.println("Account created successfully");
		   }else {
			   System.out.println("Account not created");
		   }
	}

	@Then("Verify account name {string}")
	public void verify_accname(String accname) {
		String Name =  driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		  if(Name.equals(accname)) {
			  System.out.println("Verified successfully");
		  }else {
			  System.out.println("Not verified");
		  }
	}
	
	@And("Close the browser")
	public void closeBrowser() {
		driver.close();
	}

}
