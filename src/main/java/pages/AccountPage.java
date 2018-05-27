package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class AccountPage extends ProjectMethods{
	
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="radio-personal")
	private WebElement eleAccount;
	public AccountPage verifyAccount() {
		verifySelected(eleAccount);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT, using="Next")
	private WebElement eleNext;
	public LoginPage clickNext() {
		click(eleNext);
		return new LoginPage();
	}

}
