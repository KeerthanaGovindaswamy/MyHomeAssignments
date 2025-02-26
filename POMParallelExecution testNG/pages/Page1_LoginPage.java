package pages;
////actions of pages are given as methods
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class Page1_LoginPage extends ProjectSpecificMethod {
	//create constructor
	public Page1_LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public Page1_LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//after this completion of code page is same means
		return this;//returning the reference to the current class
	}
	public Page1_LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");   
		return this;//returning the reference to the current class
	}
	public Page2_WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click(); 
		//Page2_WelcomePage wpObj=new Page2_WelcomePage();//creating an object here so that ref moves to welcome page
		//return wpObj;
		return new Page2_WelcomePage(driver);//returning the obj ref of welcomepage
	
}

}
