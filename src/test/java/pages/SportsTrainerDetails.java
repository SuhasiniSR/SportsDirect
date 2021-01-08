package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportsTrainerDetails extends BasePage {
	
	// WebElements for SportsTrainerDetails
	@FindBy(xpath="//*[@id=\"cvli27116008\"]/a/img")
	private WebElement colourOption;

	@FindBy(xpath="(//*[@id=\"ancLink\"]) [7]")
	private WebElement sizeOption;
	
	@FindBy(xpath="//a[@title=\"Increase quantity\"]")
	private WebElement addQuantity;
	
	@FindBy(xpath="//*[@id=\"aAddToBag\"]/span")
	private WebElement btnAddtoBag;
	
	@FindBy(xpath="//*[@id=\"bagQuantity\"]")
	private WebElement myBag;
	
	private WebDriver driver;
	
	public SportsTrainerDetails(WebDriver driver) {
		super(driver);
		this.driver =  driver;
			}
	public void performAddtoBag()
	{
		colourOption.click();
		sizeOption.click();
		addQuantity.click();
		btnAddtoBag.click();
		myBag.click();
	}

}
