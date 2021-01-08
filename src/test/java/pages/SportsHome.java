package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportsHome extends BasePage{
	
	// WebElements for Home
	@FindBy(xpath="//*[@id=\"divSignIn\"]/a")
	private WebElement btnLogin;
	
	
	private WebDriver driver = null;
	
	// Constructor to Initialize the Page Factory	
	public SportsHome(WebDriver driver) throws Exception 
	{
		super(driver);
		this.driver =  driver;
		if(!isHomePageDisplayed()) throw new Exception("Home Page not displayed");
	}
	
	// Actions to be performed in Home Page
	
	public boolean isHomePageDisplayed() {
		return btnLogin.isDisplayed();
	}
	
	public void navigateToLoginPage() {
		//moveToElement(driver, profile);
		btnLogin.click();
	}
	
	
	

}