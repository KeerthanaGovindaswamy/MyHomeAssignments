package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
	//create obj forthis class
	/*	System.out.println("Invoking child class");
		DeleteLead delObj =new DeleteLead();
		delObj.LauchBrowser();*/
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
//	- Enter the username.
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//	- Click on the Login Button.
		driver.findElement(By.className("decorativeSubmit")).click();
//	- Click on the CRM/SFA Link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
//	- Click "Find leads."
		driver.findElement(By.linkText("Find Leads")).click();
//	- Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
//	- Enter the phone number.
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9500137110");
//	- Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//	- Capture the lead ID of the first resulting lead.
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(text);
//	- Click the first resulting lead.
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
//	- Click the "Delete" button.
		driver.findElement(By.linkText("Delete")).click();
//	- Click "Find leads" again.
		driver.findElement(By.linkText("Find Leads")).click();
//	- Enter the captured lead ID.
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
//	- Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//	- Verify the presence of the message "No records to display" in the Lead List. This
//	message confirms the successful deletion.
		String message = driver.findElement(By.xpath("(//div[@class='x-paging-info'])")).getText();
		System.out.println(message);
		System.out.println("The lead is deleted successfully");
		
		driver.close();


	}

}
