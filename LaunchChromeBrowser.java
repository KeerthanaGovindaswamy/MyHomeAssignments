package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public void LauchBrowser() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		System.out.println("Invoking parent class");

	}

}
