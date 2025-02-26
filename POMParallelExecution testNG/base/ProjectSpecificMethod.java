package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
//	public static ChromeDriver driver;//use static to create single reference for start to end
	public ChromeDriver driver; //to run parallely
	//include all the pre and post conditions of the test cases
	@BeforeMethod
	public void runPrecondition() {
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void runPostcondition() {
		driver.close();
	}

}
