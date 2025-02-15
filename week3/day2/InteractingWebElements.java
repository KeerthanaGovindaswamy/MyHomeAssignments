package week3.day2;
//leafground assignmenet
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWebElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println("The button is clicked");
		//verify the title of the page is dashboard
		String title = driver.getTitle();
		System.out.println("The title is " + title);
		driver.navigate().back();
		boolean checkconfirmButton = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println(checkconfirmButton);
		if(checkconfirmButton == false) {
			System.out.println("Yes the button is disabled ");
		}
		//Find and print the position of the button with the text ‘Submit.’
		Point locationOfElement= driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("The position of the element : " + locationOfElement);
		
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		String backgroundColor = driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-save']")).getCssValue("background-color");
		System.out.println("The background color : " + backgroundColor);
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		Dimension sizeofButton = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("The button size is : " + sizeofButton );
		
		//Close the browser window.

		driver.close();

	}

}
