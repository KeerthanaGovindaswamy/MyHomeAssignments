package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class Page6_ViewAccountPage extends ProjectSpecificMethod{
	public Page6_ViewAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public void verifyAccountName() {
		//to verify account name
				//first get the text
				WebElement text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
				System.out.println(text.getText());
	}

}
