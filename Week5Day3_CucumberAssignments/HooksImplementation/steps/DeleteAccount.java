package steps;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAccount extends BaseClassforDriver {
	@When("Click on the crmsfa link")
	public void clickCRSMFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@Given("Click on the accounts tab")
	public void click_AccountsTab() {
		driver.findElement(By.linkText("Accounts")).click();
	}
	
	@Given("click on Find Account")
	public void click_on_find_account() {
		driver.findElement(By.linkText("Find Accounts")).click();
	}

	@Given("Enter the account name as {string}")
	public void enter_the_accountName(String accname) {
		 driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(accname);
	}

	@When("Click on Find Accounts button")
	public void click_on_find_accounts_button() {
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	}

	@When("Select account name {string}")
	public void select_the_account_name(String accname) {
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td[3]//a[text()='"+accname+"']")).click();
	}

	@When("click on deactivate account button")
	public void click_on_deactivate_account_button() {
	    driver.findElement(By.linkText("Deactivate Account")).click();
	    Alert acceptAlert = driver.switchTo().alert();
	    acceptAlert.accept();
	}

	@Then("It should naviagte to next page")
	public void it_should_naviagte_to_next_page() {
		String title = driver.getTitle();
		if(title.contains("Account Details")) {
			System.out.println("Account details page is visible");
		}else {
			System.out.println("Account details page is not visible");
		}
		
	}

	@Then("verify the account name")
	public void verify_the_account_name() {
		String text = driver.findElement(By.xpath("//span[@class='subSectionWarning']")).getText();
		if(text.contains("This account was deactivated")) {
			System.out.println("Account deleted successfully");
		}else {
			System.out.println("Account not deleted successfully");
		}
	
	}



}
