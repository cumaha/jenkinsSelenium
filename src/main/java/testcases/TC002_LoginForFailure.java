package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002_LoginForFailure extends LeafTapsWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC002_Login(negative)";
		testDescription = "Login for Failure";
		authors = "Manish";
		category ="Sanity";
		browserName = "chrome";
		dataSheetName = "TC002";
	}
	
	@Test(dataProvider = "fetchData")
	public void login(String uName, String pwd, String VerifyError) {
		new LoginPage(driver,test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLoginforFailure()
		.verifyErrName(VerifyError);
	}

}
