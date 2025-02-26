package steps;

import java.time.Duration;

import org.openqa.selenium.By;
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

public class NewAccountStepDefinition {
	//declare driver globally
	public ChromeDriver driver;
	
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

	@Given("Enter the username as vidyar@testleaf.com")
	public void enter_the_username_as_vidyar_testleaf_com() {
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
	}

	@Given("Enter the password as Sales@{int}")
	public void enter_the_password_as_sales(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("Sales@123");  
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
	public void click_on_toggle_menu_button() {
		  WebDriverWait waitObj = new WebDriverWait(driver,Duration.ofSeconds(10));
		  WebElement toffle =   driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		  waitObj.until(ExpectedConditions.elementToBeClickable(toffle));
		  toffle.click(); 
	}

	@When("Click on View all button")
	public void click_on_view_all_button() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@When("Click on Sales from app launcher")
	public void click_on_sales_from_app_launcher() {
	   driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@When("Click on accounts tab")
	public void click_on_accounts_tab() {
		WebElement acct = driver.findElement(By.xpath("//a[@title='Accounts']"));
		   Actions actobj = new Actions(driver);
		   actobj.moveToElement(acct).click().perform();
	}

	@When("click on New button")
	public void click_on_new_button() {
	   driver.findElement(By.xpath("//div[@title='New']")).click();
	}

	@Given("Enter your name as {string}")
	public void enter_your_name_as(String accname) {
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(accname);
	}

	@Given("select ownership as public")
	public void select_ownership_as_public() {
		  WebElement ownershipCombo = driver.findElement(By.xpath("(//div[@class='slds-combobox_container'])[5]//button"));
			 //use javascript executor
		  driver.executeScript("arguments[0].click();", ownershipCombo);
	}

	@When("Click on Save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("Verify the account name {string}")
	public void verify_the_account_name(String verifyName) {
		String accName =  driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		  if(accName.equals(verifyName)) {
			  System.out.println("Account name Verified successfully");
		  }else {
			  System.out.println("Not verified");
		  }
	}
	
	@And("Close the browser")
	public void closeBrowser() {
		driver.close();
	}


}
