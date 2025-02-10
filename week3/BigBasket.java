package week3.day4;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Launched big basket successfully");
		
		//Click on "Shop by Category".
		driver.findElement(By.xpath("(//div[@class='relative h-full'])[4]")).click();
		WebElement hover1 = driver.findElement(By.linkText("Foodgrains, Oil & Masala"));
		Actions act = new Actions(driver);
		act.moveToElement(hover1).perform();
		WebElement hover2 = driver.findElement(By.linkText("Rice & Rice Products"));
		act.moveToElement(hover2).perform();
		driver.findElement(By.linkText("Boiled & Steam Rice")).click();
		Thread.sleep(4000);	
		//use explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement checkBrand = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='i-BBRoyal']")));
		System.out.println(checkBrand.getText());
		act.moveToElement(checkBrand).click().perform();
		
		//Click on "Tamil Ponni Boiled Rice".
		WebElement selectRice =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='break-words h-10 w-full'])[5]/h3[text()='Tamil Ponni Boiled - Rice']")));
		System.out.println(selectRice.getText());
		act.moveToElement(selectRice).click().perform();
		
		//transfer the focus
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindowHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindowHandles.get(1));
		//select the 5kg bag
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//div[@class='w-40 xl:w-52'])[2]")).click();
		//get the price
		String price = driver.findElement(By.xpath("//table/tr[2]/td[1]")).getText();
		System.out.println(price);
		//click on add to cart button
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		//Verify the success message that confirms the item was added to your cart.
		////setTimeout(function(){debugger},5000)
		String msg =driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
		System.out.println(msg + " appears successfully");
		
		//step 1:take the screenshot by suing getscreenshotas()
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		//step2:setup the path for the file
		File filePath = new File("./BigBasketScreenshot/currentwindow.png");//path name of the file
		//step3: store the screenshot in the folder
		FileUtils.copyFile(screenshot, filePath);
		driver.close();//closes the child window which is in focus
		//transfer the focus to parent window
		driver.switchTo().window(listWindowHandles.get(0));
		driver.close();//closes the parent window
		
		
	}

}
