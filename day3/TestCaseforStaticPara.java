package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCaseforStaticPara extends DemoStaticPara {
	@Test
	public void createLegalEntity() {
		//Click on the toggle menu button from the left corne
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement clickelement = driver.findElement(By.xpath("//ul/li//p[text()='Legal Entities']"));
		Actions actobj = new Actions(driver);
		actobj.moveToElement(clickelement).click().perform();
		
		//Click on New Legal Entity
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
	//	driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[7]")).click();
		
		//setTimeout(function(){debugger},5000)
	//	driver.findElement(By.xpath("//span[@class='slds-truncate']//span[text()='New Legal Entity']")).click();
		//Enter the Company name as 'TestLeaf'. 
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
		//Enter Description as 'Salesforces'. 
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow textarea-container'])[2]/textarea[@class='slds-textarea']")).sendKeys("Salesforces");
		
		//Select Status as 'Active' 
		WebElement statusDropdown = driver.findElement(By.xpath("//div[@class='slds-combobox_container']//button"));
		//use javascript executor
		driver.executeScript("arguments[0].click();", statusDropdown);
		driver.findElement(By.xpath("//span[text()='Active']")).click();

		//click on save
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String verifyFeild = driver.findElement(By.xpath("//div[text()='Complete this field.']")).getText();
		System.out.println(verifyFeild + " is displayed");
		//close the error window and window
		driver.findElement(By.xpath("//button[@title='Close error dialog']")).click();
		driver.findElement(By.xpath("//button[@title='Close this window']")).click();
		
		
	}

}
