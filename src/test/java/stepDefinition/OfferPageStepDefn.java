package stepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OfferPage;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class OfferPageStepDefn 
{
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	public String OffersPageprodname;
	public OfferPageStepDefn(TestContextSetup testContextSetup)
	{
	this.testContextSetup =testContextSetup;
	}
	@Then("^User searched with same shortname (.+) and product should exists$")
	public void user_searched_with_same_shortname_and_product_should_exists(String Shortname ) throws InterruptedException {
	    LandingPage landingpage=testContextSetup.pageObjectManager.GetLandingPageObject();
		landingpage.ClickTopdeals();
		testContextSetup.generic.SwitchtoChildWindow();
		OfferPage offerpage=testContextSetup.pageObjectManager.GetOfferPageObject();
		offerpage.SearchItem(Shortname);
		Thread.sleep(2000);
		OffersPageprodname=offerpage.GetSearchText();
		Assert.assertEquals(OffersPageprodname, testContextSetup.Landingpageprodname);		
	}
	
}
