package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class Page4_AccountsPage extends ProjectSpecificMethod{
	public Page4_AccountsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public Page5_CreateAccountPage clickCreateAccountsButton() {
		driver.findElement(By.linkText("Create Account")).click();
		return new Page5_CreateAccountPage(driver);
	}

}
