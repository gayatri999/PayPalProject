package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignupPage extends ProjectMethods{

	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="signup-button")
	private WebElement eleSignup;
	public AccountPage clickSignup() {
		click(eleSignup);
		return new AccountPage();
	}
}
