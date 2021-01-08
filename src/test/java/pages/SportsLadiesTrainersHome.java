package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportsLadiesTrainersHome extends BasePage{
	// WebElements for LadiesTrainersHome
	@FindBy(xpath="(//span[@class=\"productdescriptionbrand\" and contains(text(), \"Nike\")]) [1]")
	private WebElement selectTrainer;


	private WebDriver driver;

	public SportsLadiesTrainersHome(WebDriver driver) throws Exception {
		super(driver);
		this.driver =  driver;
		//if(!isLadiesHomePageDisplayed()) throw new Exception("LadiesHome Page not displayed");

	}
	public boolean isLadiesTrainersHomePageDisplayed() {
		
		return selectTrainer.isDisplayed();
	}
	
	public void navigateToTrainersPage() 
	{
				selectTrainer.click();}
	}



