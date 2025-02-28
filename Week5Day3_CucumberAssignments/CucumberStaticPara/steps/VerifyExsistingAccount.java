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

public class VerifyExsistingAccount extends BaseClass{
	
	
	
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

	@When("Search for the account with account name as {string}")
	public void search_for_the_account_with_account_name_as(String accName) throws InterruptedException {
		Thread.sleep(1000);
		WebElement searchButton= driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral search-button slds-truncate']"));
		WebDriverWait waitObj = new WebDriverWait(driver,Duration.ofSeconds(20));
	    waitObj.until(ExpectedConditions.elementToBeClickable(searchButton));
	    searchButton.click();
	    driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Keerthana",Keys.ENTER);
	}

	@When("Click on dropdown icon")
	public void click_on_dropdown_icon() throws InterruptedException {
		Thread.sleep(1000);
		 driver.findElement(By.xpath("(//table/tbody)[2]/tr[1]/td[5]")).click();
	}

	@When("select Edit")
	public void select_edit() {
		 WebElement editButton = driver.findElement(By.xpath("//li[@class='uiMenuItem']//div[text()='Edit']"));
		 Actions actObj = new Actions(driver);
		    actObj.click(editButton).perform();
	}

	@When("Set type to TechnologyPartner")
	public void set_type_to_technology_partner() {
		 WebElement comboBox1 =  driver.findElement(By.xpath("(//div[@class='slds-combobox_container'])[4]//button"));
		   driver.executeScript("arguments[0].scrollIntoView();",comboBox1);
		   comboBox1.click();
		   driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
	}

	@When("Set Industry to Healthcare")
	public void set_industry_to_healthcare() {
		WebElement comboBox2 = driver.findElement(By.xpath("(//div[@class='slds-combobox_container'])[6]"));
		Actions actObj = new Actions(driver);
		actObj.moveToElement(comboBox2).click().perform();
	//	driver.executeScript("arguments[0].click();", comboBox2);
		WebElement healthcareElement = driver.findElement(By.xpath("//span[text()='Healthcare']"));
		driver.executeScript("arguments[0].scrollIntoView();",healthcareElement);
		healthcareElement.click();
	}

	@Given("Enter the Billing Address as {string}")
	public void enter_the_billing_address_as(String billAddr) {
		WebElement billing = driver.findElement(By.xpath("(//textarea[@name='street'])[1]"));
		billing.clear();
		billing.sendKeys(billAddr);
	}

	@Given("Enter the Shipping Address as {string}")
	public void enter_the_shipping_address_as(String shipAddr) {
		WebElement shipping = driver.findElement(By.xpath("(//textarea[@name='street'])[2]"));
		shipping.clear();
		shipping.sendKeys(shipAddr);
	}

	@Given("Set Customer Priority to Low")
	public void set_customer_priority_to_low() {
		WebElement priorityDD = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
        driver.executeScript("arguments[0].click()",priorityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click();
	}

	@Given("Set SLA to Silver")
	public void set_sla_to_silver() {
		driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
	}

	@Given("Set Active to NO")
	public void set_active_to_no() {
		 WebElement activeDD = driver.findElement(By.xpath("//button[@aria-label='Active']"));
	        driver.executeScript("arguments[0].click()",activeDD);
	        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
	}

	@Given("Enter a unique number in the Phone field as {string}")
	public void enter_a_unique_number_in_the_phone_field_as(String phNum) {
		WebElement phone = driver.findElement(By.xpath("//input[@name='Phone']"));
	    phone.clear();
	    phone.sendKeys(phNum);
	    phoneNum = phNum;
	}

	@Given("Set Upsell Opportunity to No")
	public void set_upsell_opportunity_to_no() {
	    WebElement upsell = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
	    driver.executeScript("arguments[0].click()",upsell);
	    driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
	}

	@When("Click Save button")
	public void click_saveButton() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("verify the phone number")
	public void verify_the_phone_number() throws InterruptedException {
		Thread.sleep(1000);
	    String exisitingPhnum = driver.findElement(By.xpath("(//table)[2]/tbody//td[3]")).getText();
	    System.out.println(exisitingPhnum);
	    if(phoneNum.equals(exisitingPhnum)) {
	    	System.out.println("Phone number is verified successfully");
	    }
	    
	}
	
	@And("Close the browser")
	public void closeBrowser() {
		driver.close();
	}


}
