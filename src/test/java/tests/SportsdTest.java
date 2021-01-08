package tests;

import org.testng.annotations.Test;

import pages.SportsAddtoBag;
import pages.SportsHome;
import pages.SportsLadies;
import pages.SportsLadiesHome;
import pages.SportsLadiesTrainersHome;
import pages.SportsLogin;
import pages.SportsTrainerDetails;

public class SportsdTest extends TestBase{
	
	SportsHome home =null;
	SportsLogin login = null;
	SportsLadies ladies = null;
	SportsLadiesHome ladieshome = null;
	SportsLadiesTrainersHome ladiestrainers = null;
	SportsTrainerDetails trainerdetails = null;
	//SportsAddtoBag addtobag = null;
	SportsAddtoBag addtobag = null;


	@Test
	public void verifySportsdLogin() throws Exception {
		home = new SportsHome(getDriver());
		home.navigateToLoginPage();
		login = new SportsLogin(getDriver());
		login.performLogin("suhasinisrmsc@gmail.com", "Sportsdirect123");
		ladies = new SportsLadies(getDriver());
		ladies.navigateToLadiesPage();
		ladieshome = new SportsLadiesHome(getDriver());
		ladieshome.navigateToLadiesTrainersPage();
		ladiestrainers = new SportsLadiesTrainersHome(getDriver());
		ladiestrainers.navigateToTrainersPage();
		trainerdetails= new SportsTrainerDetails(getDriver());
		trainerdetails.performAddtoBag();
		//addtobag= new SportsAddtoBag(getDriver());
		//addtobag.logout();

	}

	
	@Test	
	public void verifySportsdLogout() throws Exception {
		
		//home = new SportsHome(getDriver());
		//home.navigateToLoginPage();
		//login = new SportsLogin(getDriver());
		//login.performLogin("suhasinisrmsc@gmail.com", "Sportsdirect123");
		addtobag= new SportsAddtoBag(getDriver());
		addtobag.logout();

	}
}