package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
13. Print the cost and the discount percentage.
14. Take a snapshot of the shoes.
15. Close the current window.
16. Close the main window.*/
public class SnapdealActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Go to "Men's Fashion".
		WebElement mensFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions actObject = new Actions(driver);
		actObject.moveToElement(mensFashion).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
		//Get the count of sports shoes.
		
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Count of sports shoe : " + count);
		
		//Click on "Training Shoes".
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		
		//Sort the products by "Low to High".
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		Thread.sleep(3000);
		List<WebElement> sortedPrice = driver.findElements(By.xpath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ']//span[@class='lfloat product-price']"));
		List<String> pricelist =new ArrayList<String>();
	//	List<Integer> pricelist =new ArrayList<Integer>();
		for(int i=0;i<sortedPrice.size();i++) {
			String price = sortedPrice.get(i).getText();
	//		String Replaceprice = price.replace("Rs.", "");
	//		String afterReplaceprice = Replaceprice.replace(" ","");
	//		System.out.println(afterReplaceprice);
	//		int actualPrice = Integer.parseInt(afterReplaceprice);
	//		pricelist.add(actualPrice);
			pricelist.add(price);
		}
		System.out.println(pricelist);
	/*	for(int j=0;j<pricelist.size();j++) {
			if(pricelist.get(j)<=pricelist.get(j+1)) {
				System.out.println(pricelist.get(j));
			}
		}*/
	//	System.out.println("The price list is sorted from Low to High correctly");
		//Select any price range ex:(500-700).
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
		
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		//Filter by any colour.
		
		//use explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement colorFilterElement = driver.findElement(By.xpath("//div[@class='sdCheckbox filters-list ']//a[text()=' White & Blue']"));
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(colorFilterElement));
		actObject.moveToElement(clickableElement).click().perform();
		Thread.sleep(3000);
		//Mouse hover on the first resulting "Training Shoes".
		WebElement firstShoe = driver.findElement(By.xpath("//section[@class='js-section clearfix dp-widget dp-fired']/div[1]"));
		actObject.moveToElement(firstShoe).perform();
		//Click the "Quick View" button.
		driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]")).click();
		
		//Print the cost and the discount percentage.
		String priceOfshoe = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String discPrice = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The price is : " +priceOfshoe + " the discount percentage is " + discPrice );
		//Take a snapshot of the shoes.
		//step 1:take the screenshot by suing getscreenshotas()
				File screenshotofShoe = driver.getScreenshotAs(OutputType.FILE);
				//step2:setup the path for the file
				File filePath = new File("./SnapdealScreenshot/currentwindow.png");//path name of the file
				//step3: store the screenshot in the folder
				FileUtils.copyFile(screenshotofShoe, filePath);
		//Close the current window.
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		//close the main window
		driver.close();

	}

}
