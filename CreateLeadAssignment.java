package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ti = "Software Tester";
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.className("inputBox")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthana");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(ti);
		driver.findElement(By.name("submitButton")).click();
		String title = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		System.out.println(title);
		if(title.equals(ti)) {
			System.out.println("Verified successfully");
		}else {
			System.out.println("not verified successfully");
		}
		driver.close();
	}

}
