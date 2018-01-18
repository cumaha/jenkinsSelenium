package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class LoginPage extends LeafTapsWrappers{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test =test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM")) {
			reportStep("This is not My Login Page", "FAIL");			
		}
	}
	
	
	public LoginPage enterUserName(String data) {
		enterById(prop.getProperty("Login.UserName.Id"), data);		
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		enterById("password", data);
		return this;
	}
	
	public HomePage clickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage(driver, test);
		//return hp;
		
	}
	
	public LoginPage verifyErrName(String text) {
		verifyTextContainsById("errorDiv", text);
		return this;
	}
	
	public LoginPage clickLoginforFailure() {
		clickByClassName("decorativeSubmit");
		return this;
		//return hp;
		
	}
	

}
