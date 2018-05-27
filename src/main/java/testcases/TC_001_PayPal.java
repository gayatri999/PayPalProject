package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SignupPage;
import wdMethods.ProjectMethods;

public class TC_001_PayPal extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC_001_PayPal";
		testDescription="Login paypal";
		testNodes = "Leads";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Gayatri";
	}
	
	
	@Test(dataProvider="fetchData")
	public void payPal(String email, String pwd, String repwd) {
		new SignupPage()
		.clickSignup()
		.verifyAccount()
		.clickNext()
		.selectCountry()
		.enterEmail(email)
		.enterPassword(pwd)
        .enterRepassword(repwd)	
        .clickContinue();
		
		
		
		
		
		
		
		
		
		
	}

}
