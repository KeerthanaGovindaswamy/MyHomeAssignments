package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCaseforDynamicPara extends DemoDynamicPara {
	@DataProvider
	public String[][] setData() {
		String[][] name = new String[2][1];//2 sets 1 value each
		name[0][0]="keerthana";
		name[1][0]="kikie";
		return name;
	}
//	String name="keerthana";
	
	
	@Test(dataProvider="setData")
	public void verifyLegalEntity(String name) {
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
			
		//setTimeout(function(){debugger},5000)
}
}
