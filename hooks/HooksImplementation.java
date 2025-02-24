/*package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//if we declare driver and extends this it cannot be done
//You're not allowed to extend classes that define Step Definitions or hooks.
public class HooksImplementation extends BaseclassforDriverObject{
//	public static RemoteWebDriver driver;
//100% cucumber conifg....use hooks
@Before
public void launchBrowser() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://leaftaps.com/opentaps");
}

@After
public void closeBrowser() {
	driver.close();
}

}*/
