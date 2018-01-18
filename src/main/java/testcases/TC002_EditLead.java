package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage1;
import wrappers.LeafTapsWrappers;

public class TC002_EditLead extends LeafTapsWrappers {

	@BeforeClass
	public void setValues() {
		browserName = "chrome";
		testCaseName = "TC002 - Edit Lead";
		testDescription = "Edit the existing Lead";
		category="sanity";
		authors="Gopi";
		dataSheetName = "TC002";
	}
	@Test(dataProvider="fetchData")
	public void editLeadPage(String userName, String password,
			 String firstName) throws InterruptedException{
		new LoginPage1(driver,test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads();
		/*	.clickFindLead();
		.enterName(firstName)
		.clickfindLeadButton()
		.clickFirsrResultingLead()
		.clickEditLead();
//		.clickUpdate();		
*/	}

}