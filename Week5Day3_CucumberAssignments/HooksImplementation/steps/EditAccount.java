package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccount extends BaseClassforDriver{
	
	
	@When("Click on crmsfa link")
	public void click_CRSMFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Given("Click on accounts tab")
	public void click_accountsTab() {
		driver.findElement(By.linkText("Accounts")).click();
	}
	
	@Given("click on Find Account button")
	public void click_on_findaccountButton() {
	    driver.findElement(By.linkText("Find Accounts")).click();
	}

	@Given("enter account name as {string}")
	public void enter_the_account_name_as(String accname) {
	   driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(accname);
	}

	@When("Click on the Find Accounts button")
	public void click_on_find_accounts_button() {
	 driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	}

	@When("Select the account name as {string}")
	public void select_the_account_name(String accname) {
		 driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td[3]//a[text()='"+accname+"']")).click();
	}
	
	@When("Click on edit button")
	public void click_EditButton() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@When("select industry")
	public void select_Industry() {
		WebElement selectindustry =  driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select options = new Select(selectindustry);
		options.selectByIndex(4);
	}
	
	@When("enter the description")
	public void enter_Description() {
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Software tester");
	}
	@When("click on save button")
	public void click_SaveButton() {
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	}
	@Then("It should navigate to account details page")
	public void verify_AccountName() {
		String title = driver.getTitle();
		if(title.contains("Account Details")) {
			System.out.println("Account edited successfully");
		}else {
			System.out.println("Account not edited successfully");
		}
		
	}

}
