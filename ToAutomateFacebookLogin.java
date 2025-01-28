package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomateFacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//enter username and pwd
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys(" Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		String title = driver.findElement(By.className("uiHeaderTitle")).getText();
		if (title.equals("Find Your Account")){
			System.out.println("Find your account page title appeared successfully");
		}else {
			System.out.println("Find your account page title not appeared ");
		}
		driver.close();

	}

}
