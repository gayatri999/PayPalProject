package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="country")
	private WebElement eleCountry;
	public LoginPage selectCountry(String data) {
		selectDropDownUsingText(eleCountry, data);
		return this;
	}
	@FindBy(how=How.ID, using="email")
	private WebElement eleEmail;
	public LoginPage enterEmail(String data) {
		type(eleEmail, data);
		return this;
	}
	@FindBy(how=How.ID, using="password")
	private WebElement elepassword;
	public LoginPage enterPassword(String data) {
		type(elepassword, data);
		return this;
	}
	@FindBy(how=How.ID, using="confirmPassword")
	private WebElement eleRepassword;
	public LoginPage enterRepassword(String data) {
		type(eleRepassword, data);
		return this;
	}
	@FindBy(how=How.ID, using="_eventId_personal")
	private WebElement eleContinue;
	public LoginPage clickContinue() {
		click(eleContinue);
		return this;
	}

}
