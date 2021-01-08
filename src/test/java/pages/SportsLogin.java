package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportsLogin extends BasePage{

	// WebElements for Login
	@FindBy(xpath="//*[@id=\"Login_EmailAddress\"]")
	private WebElement txtEmail;
	
	@FindBy(xpath="//*[@id=\"Login_Password\"]")
	private WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"LoginButton\"]")
	private WebElement btnLogin;
	
	
	private WebDriver driver = null;
	
	// Constructor to Initialize the Page Factory
	
	public SportsLogin(WebDriver driver) throws Exception {
		super(driver);
		this.driver =  driver;
		if(!isLoginPageDisplayed()) throw new Exception("Login Page not displayed");
	}
		
	
	// Actions to be performed in Login Page
	public boolean isLoginPageDisplayed() {
		return txtEmail.isDisplayed();
	}
	
	public void performLogin(String email, String password) {
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
	
		
}