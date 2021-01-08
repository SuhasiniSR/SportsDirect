package tests;

import pages.SportsAddtoBag;



public class SportsdLogout extends TestBase {
	SportsAddtoBag addtobag = null;
	
	
	public void verifySportdLogout () throws Exception
{
		addtobag= new SportsAddtoBag(getDriver());
		addtobag.logout();
	
}

}
