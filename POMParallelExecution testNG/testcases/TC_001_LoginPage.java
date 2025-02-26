package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Page1_LoginPage;

public class TC_001_LoginPage extends ProjectSpecificMethod {
	@Test
	public void runLoginPage() {
		Page1_LoginPage lpObj = new Page1_LoginPage(driver);
		lpObj.enterUsername()
		.enterPassword()
		.clickLoginButton();
	}

}
