package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*1. Load the URL (https://www.amazon.in/)
2. Search for "oneplus 9 pro".
3. Get the price of the first product.
4. Print the number of customer ratings for the first displayed product.
5. Click the first text link of the first image.
6. Take a screenshot of the product displayed.
7. Click the 'Add to Cart' button.
8. Get the cart subtotal and verify if it is correct.
9. Close the browser.*/
public class AmazonActions {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Amazon launched successfully");
		
		//Search for "oneplus 9 pro".
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		//Get the price of the first product.
		String price =driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-base']//span//span[@class='a-price-whole']")).getText();
		System.out.println("price is " +price);
		//Print the number of customer ratings for the first displayed product.
		String customerRatings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		Thread.sleep(3000);
		System.out.println("The number of customer ratings for the first displayed product is : " +customerRatings);
		//Click the first text link of the first image.
		driver.findElement(By.xpath("((//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'])[1])")).click();
		//transfer the driver focus
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listOfwindows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listOfwindows.get(1));
		//Take a screenshot of the product displayed.
		//find the element
		Thread.sleep(3000);
		WebElement imageOfProduct = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']/img"));
		//take the scrrenshot of element
		File image = imageOfProduct.getScreenshotAs(OutputType.FILE);
		//create file path for the screenshot
		File path = new File("./AmazonScreenshot/image.png");
		//copy the screenshot to file
		FileUtils.copyFile(image, path);
		System.out.println("Screeshot of product image is taken");
		//add to cart
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
		//get the subtotal
		Thread.sleep(3000);
		String cartPrice = driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']/span[@class='a-size-base-plus a-color-price a-text-bold']/span")).getText();
		System.out.println("Captured price : "  +cartPrice);
		String price2 = cartPrice.substring(1, 7);
		System.out.println(price2);
		if(price.equals(price2)) {
			System.out.println("Price matches,verified successfully");
		}else {
			System.out.println("Price differs");
		}
		driver.quit();//all the windows gets closed
		
		
	}

}
