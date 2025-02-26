package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificMethod;

public class Page5_CreateAccountPage extends ProjectSpecificMethod {
	public Page5_CreateAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public Page5_CreateAccountPage enterAccountName() {
		driver.findElement(By.id("accountName")).sendKeys("Kikie");
		return this;
	}
		public Page5_CreateAccountPage selectIndustry() {
			//handling dropdown
			//create webelement 
		WebElement selectIndustry = driver.findElement(By.name("industryEnumId"));
		//using this webelement we can perfrom actions in select class by creating obj 
		Select selObj = new Select(selectIndustry);
		selObj.selectByIndex(3);
		return this;

	}
		public Page5_CreateAccountPage selectOwnership() {
			//select from ownership dropdown
			WebElement selectOwnership= driver.findElement(By.name("ownershipEnumId"));
			Select selObj1 = new Select(selectOwnership);
			selObj1.selectByVisibleText("S-Corporation");
			return this;
		}
			public Page5_CreateAccountPage selectSource() {
				//select source dropdown
				WebElement selectEmployee= driver.findElement(By.id("dataSourceId"));
				Select selObj2=new Select(selectEmployee);
				selObj2.selectByValue("LEAD_EMPLOYEE");
				return this;
			}
			public Page5_CreateAccountPage selectMarketing() {
				//marketing dropdown
				WebElement selectMarketing= driver.findElement(By.id("marketingCampaignId"));
				Select selObj3=new Select(selectMarketing);
				selObj3.selectByIndex(6);
				return this;
			}
			public Page5_CreateAccountPage selectProvince() {
				//StateProvince
				WebElement selectState= driver.findElement(By.id("generalStateProvinceGeoId"));
				Select selObj4=new Select(selectState);
				selObj4.selectByValue("TX");
				return this;
			}
			public Page6_ViewAccountPage clickCreateAccountButton() {
				//click create account
				driver.findElement(By.className("smallSubmit")).click();
				return new Page6_ViewAccountPage(driver);
			}
			

}
