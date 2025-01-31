package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
/*- Launch the URL https://www.ajio.com/
- In the search box, type as "bags" and press enter
- To the left of the screen under "Gender" click on "Men"
- Under "Category" click "Fashion Bags"
- Print the count of the items found.
- Get the list of brand of the products displayed in the page and print the list.
- Get the list of names of the bags and print it

 * 
 */
public class AJIO {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bag for Boys",Keys.ENTER);
		WebElement search = driver.findElement(By.name("searchVal"));
		search.sendKeys("bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		//Print the count of the items found.
		String countItems = driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		countItems=countItems.substring(0,5);
		countItems=countItems.replace(",", "");
		int count=Integer.parseInt(countItems);
		System.out.println("The count of items found : " +count);
		
		//to get the names of all elements use findlelements
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> brandList = new ArrayList<String>();
		System.out.println("Brand names : ");
		for(int j=0;j<brand.size();j++) {
			
			brandList.add(j, brand.get(j).getText());
		
		}
		
	//	System.out.println("Names of the Brands : " + brandList);
		for(int k=0;k<brandList.size();k++) {
			System.out.println(brandList.get(k));//get(index) to get the values
		}
		//to get all the bag names use findelements
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		//cant get text from webelement so making it into arraylist
		List<String> bagsList = new ArrayList<String>();
	//	System.out.println(bagsList);
		for(int j=0;j<bags.size();j++) {
			bagsList.add(j, bags.get(j).getText());//adding each webelement by (index,gettetx) into arrayList
		
		}
	//	System.out.println("Names of the Bags : " + bagsList);
		System.out.println("Bags names : ");
		for(int k=0;k<bagsList.size();k++) {
			System.out.println(bagsList.get(k));//get(index) to get the values
		}
		Thread.sleep(5000);
		driver.close();
	}

}
