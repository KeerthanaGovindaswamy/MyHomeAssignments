package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class Page2_WelcomePage extends ProjectSpecificMethod {
	
	public Page2_WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	//actions are given as methods
	public Page3_HomePage clickCRMSFAlink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	//	Page3_HomePage hpObj = new Page3_HomePage();
	//	return hpObj;
		return new Page3_HomePage(driver);
	}
	
	public Page1_LoginPage clickLogOutButton() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new Page1_LoginPage(driver);
	}

}
