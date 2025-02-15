package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoRadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select 'Your most favourite browser' from the radio buttons
		String browser = "Chrome";
		String text = "";
		List<WebElement> browserElements = driver.findElements(By.xpath("//table[@id='j_idt87:console1']//tr//td"));
	//	System.out.println(browserElements.get(1).getText());
		for(int i=0;i<browserElements.size();i++) {
			text = browserElements.get(i).getText();
			if(text.equals(browser)) {
				browserElements.get(i).click();
				
			}
		}
		System.out.println("My fav browser is "  +text);
		
		//Click on a radio button, then click on the same radio button again to verify that
		//it becomes ‘unselected’.
				String city = "Chennai";
				 List<WebElement> cityList = driver.findElements(By.xpath("//div[@id='j_idt87:city2']/div[@class='ui-g']/div/label"));
				for(int i=1;i<cityList.size();i++) {
					String cityFound= driver.findElement(By.xpath("(//div[@id='j_idt87:city2']/div[@class='ui-g']/div/label)["+i+"]")).getText();
					if(cityFound.equals(city)) {
						driver.findElement(By.xpath("((//div[@id='j_idt87:city2']//div[@class='ui-radiobutton ui-widget'])["+i+"])")).click();
						Thread.sleep(2000);
						System.out.println("The selected city is "  +cityFound);
						//again click
						driver.findElement(By.xpath("((//div[@id='j_idt87:city2']//div[@class='ui-radiobutton ui-widget'])["+i+"])")).click();
						boolean check=driver.findElement(By.xpath("((//div[@id='j_idt87:city2']//div[@class='ui-radiobutton ui-widget'])["+i+"])")).isSelected();
					//	System.out.println(check);
						if(check == false) {
						System.out.println("after clikcing it again it becomes unselected successfully");
						}
					}
				}

		//check the default selected radio button
				List<WebElement> radioElementslist = driver.findElements(By.xpath("(//table[@id='j_idt87:console2']//td//input[@id])"));
				for(int i=1;i<radioElementslist.size();i++) {
					boolean checkRadiobutton = driver.findElement(By.xpath("(//table[@id='j_idt87:console2']//td//input[@id])["+i+"]")).isSelected();
				//	System.out.println(i + " is " +checkRadiobutton);
					if(checkRadiobutton == true) {
						String radiobuttonName = driver.findElement(By.xpath("(//table[@id='j_idt87:console2']//td//label[text()])["+i+"]")).getText();
						System.out.println(radiobuttonName + " is selected by default" );
					}
				}
		//Check and select the age group (21-40 Years) if not already selected.
		String age="21-40 Years";
		List<WebElement> ageElements = driver.findElements(By.xpath("//div[@id='j_idt87:age']/div/div//label"));
		for(int k=1;k<ageElements.size();k++) {
			String checkAge1 = driver.findElement(By.xpath("(//div[@id='j_idt87:age']/div/div//label)["+k+"]")).getText();
		//	System.out.println(checkAge1);
			if(checkAge1.equals(age)) {
				System.out.println("check age group " +age + " is selected already");
				//find element
				boolean isselected = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']")).isSelected();
			//	System.out.println(isselected);
				if(isselected == true) {
					System.out.println( age + " is selected already");
				}
				else {
					driver.findElement(By.xpath("//input[@id='j_idt87:age:1']")).click();
				}
			
			}
			
		}
		
		driver.close();
		

	}

}
