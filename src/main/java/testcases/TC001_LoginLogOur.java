package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_LoginLogOur extends LeafTapsWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC001_LoginLogOut";
		testDescription = "Login using DemoSalesManager";
		authors = "elvarasan";
		category ="smoke";
		browserName = "chrome";
		dataSheetName = "TC001";
	}
	
	@Test(dataProvider = "fetchData")
	public void login(String uName, String pwd, String vLoginName) {
		new LoginPage(driver,test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyLoggedName(vLoginName)
		.clickLogOut();
		
	}

}
