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

public class CreateAccount extends BaseClassforDriver{
	
	
	@When("Click crmsfa link")
	public void click_CRSMFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Given("Click accounts tab")
	public void click_accountsTab() {
		driver.findElement(By.linkText("Accounts")).click();
	}
	
	@Given("Click on create account")
	public void click_on_create_account() {
	   driver.findElement(By.linkText("Create Account")).click();
	}
	
	@Given("Enter Account name as {string}")
	public void enter_AccountName(String accname) {
		driver.findElement(By.id("accountName")).sendKeys(accname);
		
	}
	
	@When("click on create account button")
	public void click_CreateaccountButton() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}
	
	@Then("It should be naviagated to accounts page")
	public void verify_page() {
		String title = driver.getTitle();
		if(title.contains("Account Details")) {
			System.out.println("Account created successfully");
		}else {
			System.out.println("Account not created successfully");
		}
	}
	
	


}
