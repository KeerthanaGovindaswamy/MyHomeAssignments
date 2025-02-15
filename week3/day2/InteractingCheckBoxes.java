package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		//implcit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//setTimeout(function(){debugger},5000)
		String displayedtext = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(displayedtext.equals("Checked")) {
			System.out.println("Checked box appers successfully after clicking notification checkbox");
		}
		//Click on your favorite language (assuming it's related to checkboxes).
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		//Click on the "Tri-State Checkbox."
		
		driver.findElement(By.xpath("((//div[@class='ui-chkbox ui-widget'])[6])")).click();
		Thread.sleep(3000);
		//Verify which tri-state option has been chosen.
		String verifyText = driver.findElement(By.xpath("//span[text()='State has been changed.']/following::p")).getText();
		System.out.println("Tri-state option choosen is: " + verifyText);
		
		//Click on the "Toggle Switch."
		Thread.sleep(3000);
		driver.findElement(By.id("j_idt87:j_idt100")).click();
		String displayedText2 = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if(displayedText2.equals("Checked")) {
			System.out.println("Checked box appers successfully after clicking toggle switchbox");
		}
		
		//Verify if the Checkbox is disabled.
		Thread.sleep(3000);
		boolean verifyCheckBox = driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled();
		if(verifyCheckBox == false) {
			System.out.println("The ckeckbox is disabled");
		}
		//Select multiple options on the page (details may be needed)
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(3000);
		//Perform any additional actions or verifications required.
		String country = driver.findElement(By.xpath("((//div[@class='ui-selectcheckboxmenu-items-wrapper']//ul/li)[2])")).getText();
		System.out.println(country);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ui-selectcheckboxmenu-items-wrapper']//ul/li)[2]/div[@class='ui-chkbox ui-widget']")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		String selectedCountry=driver.findElement(By.xpath("//span[@class='ui-selectcheckboxmenu-token-label']")).getText();
		if(country.equals(selectedCountry)) {
		System.out.println("options are selected successfully");	
		}else {
			System.out.println("Select the options");
		}
		
		driver.close();
		
		
	}

}
