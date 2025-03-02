package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//test steps are included here
//all the steps from feature files are annotated
public class StepDefinitionofLogin extends BaseClassforDriver {
	
	//we can paramaterize the data 
	@Given("Enter the username as {string}")//this is cucumber string
	public void enter_the_username_as_demosalesmanager(String username) {//java string
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@Given("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");   
	}

	@When("Click on login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click(); 
	}

	@Then("It should navigate to the next page")
	public void it_should_navigate_to_the_next_page() {
	    String text = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
	    if(text.contains("Welcome")) {
	    	System.out.println("The page is navigated");
	    }else {
	    	System.out.println("The page is not navigated");
	    }
	}
	

}
