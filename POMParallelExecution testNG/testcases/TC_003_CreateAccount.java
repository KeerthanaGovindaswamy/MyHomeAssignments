package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Page1_LoginPage;

public class TC_003_CreateAccount extends ProjectSpecificMethod {
	@Test
	public void runCreateAccount() {
		
		Page1_LoginPage lpObj = new Page1_LoginPage(driver);
		lpObj.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFAlink()
		.clickAccountsButton()
		.clickCreateAccountsButton()
		.enterAccountName().selectIndustry().selectOwnership().selectSource().selectMarketing().selectProvince().clickCreateAccountButton()
		.verifyAccountName();
		
		
	}

}
