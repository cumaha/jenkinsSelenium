package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import wrappers.LeafTapsWrappers;

public class LoginPage1 extends LeafTapsWrappers{

	public LoginPage1(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM"))
			reportStep("This is not Login Page", "FAIL");

	}
	//This is the enter username
	public LoginPage1 enterUserName(String data) {
		enterById("username", data);
		return this;

	}
	//This is the enter password
	public LoginPage1 enterPassword(String data) {
		enterById("password", data);
		return this;
	}
	//This is the click login
	public HomePage1 clickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage1(driver,test);		
	}
	//This is the click login for failure
	public LoginPage1 clickLoginForFailure() {
		clickByClassName("decorativeSubmit");
		return this;
		
	}
	
	public LoginPage1 verifyErrorMessage(String data) {		
		verifyTextContainsByXpath("//*[@id='errorDiv']", data);		
		return this;		
	}
	
	public HomePage1 login(String Value){
		clickByClassName(Value);
		return new HomePage1(driver, test);
	}
	
	
	




















}





