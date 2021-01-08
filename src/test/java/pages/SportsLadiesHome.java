package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SportsLadiesHome extends BasePage {
	
	// WebElements for LadiesHome
	@FindBy(xpath="//*[@id=\"collapse2\"]/ul/li[2]/a")
	private WebElement tabTrainers;


	private WebDriver driver;

	public SportsLadiesHome(WebDriver driver) throws Exception {
		super(driver);
		this.driver =  driver;
		//if(!isLadiesHomePageDisplayed()) throw new Exception("LadiesHome Page not displayed");

	}
	public boolean isLadiesHomePageDisplayed() {
		
		return tabTrainers.isDisplayed();
	}
	
	public void navigateToLadiesTrainersPage() {
		if (tabTrainers.isDisplayed())
		{
		//moveToElement(driver, profile);
		
		tabTrainers.click();}
		else
		{
			/*long timeout;
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(tabTrainers)); 
			wait.until(ExpectedConditions.elementToBeClickable(tabTrainers));*/
			//Actions action = new Actions(driver);
			//action.moveToElement(tabTrainers);
			//tabTrainers.click();
			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", tabTrainers);

		}
	}

}
