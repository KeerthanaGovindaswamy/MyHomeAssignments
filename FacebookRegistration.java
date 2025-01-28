package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sham");
		driver.findElement(By.name("lastname")).sendKeys("Charan");
		//handle daydropdown
		WebElement daydropdown = driver.findElement(By.id("day"));
		
		Select selobj = new Select(daydropdown);
		selobj.selectByValue("19");
		
		//monthdropdown
        WebElement monthdropdown = driver.findElement(By.id("month"));
		
		Select selobj1 = new Select(monthdropdown);
		selobj1.selectByVisibleText("Jun");
		
		//yeardropdown
        WebElement yeardropdown = driver.findElement(By.id("year"));
		
		Select selobj2 = new Select(yeardropdown);
		selobj2.selectByValue("1993");
		//select gender
	
		driver.findElement(By.xpath("(//label[text()='Female'])")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("keerthanaravi0616@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("janu123@");
	

	}

}
