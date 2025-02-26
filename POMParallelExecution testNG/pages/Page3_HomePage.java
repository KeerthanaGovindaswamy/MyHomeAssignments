package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class Page3_HomePage extends ProjectSpecificMethod{
	public Page3_HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public Page4_AccountsPage clickAccountsButton() {
		driver.findElement(By.linkText("Accounts")).click();
		return new Page4_AccountsPage(driver);
	}

}
