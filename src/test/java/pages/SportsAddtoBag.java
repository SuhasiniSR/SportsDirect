package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportsAddtoBag extends BasePage{
	
	@FindBy(xpath="//*[@id=\"bagQuantity\"]")
	private WebElement myBag;

	//@FindBy(xpath="//span[@class='deleteItemText'and contains(text(),'Remove')]")
	@FindBy(xpath="//a[@class=\"prodelete\"]")
	private WebElement btnRemove;
	
	@FindBy(xpath="//a[@title=\"Reduce quantity\"]")
	private WebElement reduceQty;
	
	@FindBy(xpath="//*[@id='topLinkMenu']/ul/li/a/span[2]")
	private WebElement btnAccount;
	
	@FindBy(xpath="//*[@id='topLinkMenu']/ul/li/ul/li[5]/a/span[2]")
	private WebElement btnSignout;

	
		private WebDriver driver = null;
		
	public SportsAddtoBag(WebDriver driver) 
	{
		super(driver);
		this.driver= driver;
	}

	public void logout() throws Exception
	{
		myBag.click();
		reduceQty.click();
		Thread.sleep(3000);
		btnRemove.click();
		moveToElement(driver,btnAccount);
		btnSignout.click();
		
	}
	
}
