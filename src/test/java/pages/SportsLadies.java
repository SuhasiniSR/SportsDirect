package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportsLadies extends BasePage {
	
	// WebElements for LadiesHome
	@FindBy(xpath="//*[@id=\"lnkTopLevelMenu_1870520\"]")
	//@FindBy(xpath="//a[@class='lnkLevel2' and contains(text(),'Ladies')]")
	private WebElement tabLadies;


	private WebDriver driver;

	public SportsLadies(WebDriver driver) throws Exception {
		super(driver);
		this.driver =  driver;
		//if(!isLoggedinHomePageDisplayed()) throw new Exception("Home Page not displayed");

	}
	/*public boolean isLoggedinHomePageDisplayed() {
		return tabLadies.isDisplayed();
	}*/
	
	public void navigateToLadiesPage() {
		tabLadies.click();

	}

}
