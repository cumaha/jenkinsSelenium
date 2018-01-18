package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import wrappers.LeafTapsWrappers;

public class HomePage1 extends LeafTapsWrappers{

	public HomePage1(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM"))
			reportStep("This is not Home Page", "FAIL");

	}

	public HomePage1 verifyLoggedName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), data);
		return this;
	}

	public LoginPage1 clickLogout() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new LoginPage1(driver,test);

	}

	public MyHomePage clickCRMSFA() {
		clickByLink(prop.getProperty("Home.CRMSFA.Link"));
		return new MyHomePage(driver,test);

	}

}





