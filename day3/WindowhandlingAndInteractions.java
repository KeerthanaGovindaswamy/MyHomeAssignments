package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlingAndInteractions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//	- Enter the username and password.
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		- Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
//		- Click on the CRM/SFA link.
		driver.findElement(By.linkText("CRM/SFA")).click();
//		- Click on the Contacts button
		driver.findElement(By.linkText("Contacts")).click();
		//click on merge contacts
		driver.findElement(By.linkText("Merge Contacts")).click();
	//	Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']/following::a")).click();
		
	//	String title = driver.getTitle();
	//	System.out.println(title);
		Set<String> allwindow1 = driver.getWindowHandles();
	//	System.out.println(allwindow1);
	//	To change the driver focus convert it to list
		List<String> windowLists1 = new ArrayList<String>(allwindow1);
		
		driver.switchTo().window(windowLists1.get(1));
//		- Click on the first resulting contact.
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(windowLists1.get(0));
//		- Click on the widget of the "To Contact".
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdTo']/following::a")).click();
		Set<String> allWindow2 = driver.getWindowHandles();
		List<String> windowLists2 = new ArrayList<String>(allWindow2);	
		driver.switchTo().window(windowLists2.get(1));
		driver.manage().window().maximize();
	//	- Click on the second resulting contact.
		driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2])")).click();
		driver.switchTo().window(windowLists1.get(0));
	//	- Click on the Merge button.
		driver.findElement(By.linkText("Merge")).click();
	//	- Accept the alert.
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
	//	- Verify the title of the page.
		String title = driver.getTitle();
		System.out.println("Title of the current page " +title);
		
		driver.close();
	
	
	
		
		
	}

}
