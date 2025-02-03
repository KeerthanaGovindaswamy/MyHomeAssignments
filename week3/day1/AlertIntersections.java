package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertIntersections {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		//- Click on the "Prompt Box" button to trigger the alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//Switch to the alert and type a message in the alert box
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Keerthana");
		String textInPrompt = promptAlert.getText();
		System.out.println("Text present inside alert box : "+ textInPrompt);
		promptAlert.dismiss();
		
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("After dismissing the alert box : "+text);
		
		driver.close();
		

	}

}
