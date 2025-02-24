package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseclassforDriverObject {
	
	@When("click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("click on Leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("click on CreateLead link")
	public void click_on_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	//for passing multiple data we can paramaterize
	@Given("Enter the companyname as {string}")
	public void enter_the_companyname(String comp) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comp);
	}
	@Given("Enter the firstname as {string}")
	public void enter_the_firstname(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	@Given("Enter the lastname as {string}")
	public void enter_the_lastname(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	@When("click on Create Lead button")
	public void click_on_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Lead should be created")
	public void lead_should_be_created() {
	   System.out.println("The lead is created successfully");
	}

}
