package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	//	- Enter the Username as "DemoSalesManager" and the Password as "crmsfa".
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	//	- Click on the Login Button.
		driver.findElement(By.className("decorativeSubmit")).click();
	//	- Click on the CRM/SFA Link.
		driver.findElement(By.linkText("CRM/SFA")).click();
	//	- Click on the Leads Button.
		driver.findElement(By.linkText("Leads")).click();
	//	- Click on Create Lead.
		driver.findElement(By.linkText("Create Lead")).click();
    //- Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Wipro");
	//	- Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Lalitha");
	//	- Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Kumar");
	//	- Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Latha");
	//-   Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("");
	//	- Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software tester");
	//	- Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keerthana1906@gmail.com");
	//	- Select State/Province as NewYork Using Visible Text.
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select obj = new Select(state);
		obj.selectByVisibleText("Alaska");
	//	- Click on the Create Button.
		driver.findElement(By.name("submitButton")).click();
	//	- Click on the edit button.
		driver.findElement(By.linkText("Edit")).click();
	//	- Clear the Description Field.
		driver.findElement(By.id("updateLeadForm_description")).clear();
	//	- Fill the Important Note Field with Any text.
		driver.findElement(By.name("importantNote")).sendKeys("Testing");
	//	- Click on the update button.
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	//	- Get the Title of the Resulting Page.
		String title = driver.getTitle();
		System.out.println(title);
	//	- Close the browser window.
		driver.close();
		

	}

}
