package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteraction {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get ("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(3000);
		//enter "MAS" as the from station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		//Enter "MDU" as the "To" station.
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
		//Uncheck the "Sort on Date" checkbox.
		driver.findElement(By.xpath("//table[@id='tableTopMenu']/tbody/tr[1]/td[6]")).click();
		//Retrieve the train names from the web table.
		//--->//div[@id='divTrainsList']/table/tbody/tr/td[2]--->list of train names
		List<WebElement> trainNamesElements = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td[2]"));
		//System.out.println(trainNamesElements.get(0).getText());
		List<String> listOfTrainNames = new ArrayList<String>();
		for(int i=0;i<trainNamesElements.size();i++) {
			System.out.println(trainNamesElements.get(i).getText());
			listOfTrainNames.add(trainNamesElements.get(i).getText());
		}
		//System.out.println(listOfTrainNames);
		//Verify if there are any duplicate train names in the web table.
		int countOfduplicates=0;
		List<String> duplicateTrainNames=new ArrayList<String>();
		for(int j=0;j<listOfTrainNames.size()-1;j++) {
			
			if((listOfTrainNames.get(j)).equals(listOfTrainNames.get(j+1))) {
				duplicateTrainNames.add(listOfTrainNames.get(j));
				countOfduplicates++;
			}
		}
		System.out.println("The number of duplicates train names are : " +countOfduplicates);
		System.out.println("List of duplicate train names are : " + duplicateTrainNames);
		driver.close();
		
		
		
		//---->//div[@id='divTrainsList']/table/tbody/tr/th[2]---->title of column
		//---->//div[@id='divTrainsList']/table/tbody/tr---->row count
		//---->//div[@id='divTrainsList']/table/tbody/tr/th------>col count
		

	}

}
