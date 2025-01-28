package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountwithDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accname = "ShamCharan";
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys(accname);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//handling dropdown
		//create webelement 
		WebElement selectIndustry = driver.findElement(By.name("industryEnumId"));
		//using this webelement we can perfrom actions in select class by creating obj 
		Select selObj = new Select(selectIndustry);
		selObj.selectByIndex(3);
		//select from ownership dropdown
		WebElement selectOwnership= driver.findElement(By.name("ownershipEnumId"));
		Select selObj1 = new Select(selectOwnership);
		selObj1.selectByVisibleText("S-Corporation");
		//select source dropdown
		WebElement selectEmployee= driver.findElement(By.id("dataSourceId"));
		Select selObj2=new Select(selectEmployee);
		selObj2.selectByValue("LEAD_EMPLOYEE");
		//marketing dropdown
		WebElement selectMarketing= driver.findElement(By.id("marketingCampaignId"));
		Select selObj3=new Select(selectMarketing);
		selObj3.selectByIndex(6);
		//StateProvince
		WebElement selectState= driver.findElement(By.id("generalStateProvinceGeoId"));
		Select selObj4=new Select(selectState);
		selObj4.selectByValue("TX");
		//click create account
		driver.findElement(By.className("smallSubmit")).click();
		//to verify account name
		//WebElement acctext = driver.findElement(By.xpath("//span[@class='tabletext'][3]"));
		WebElement element = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		System.out.println(element.getText());
		driver.close();
		
	}

}
