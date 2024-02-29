package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;

public class LandingPageStepDefn {
	
	public String Landingpageprodname;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	LandingPage landingPage;
	
	public LandingPageStepDefn(TestContextSetup testContextSetup) 
	{
		this.testContextSetup=testContextSetup;
		this.landingPage=testContextSetup.pageObjectManager.GetLandingPageObject();
	}
	

	@Given("User is on Greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
	    Assert.assertTrue(landingPage.GetTitle().contains("GreenKart")); 
	}

	@When("^User searched with shortname (.+) and extract the product name$")
	public void user_searched_with_shortname_and_extract_the_product_name(String Shortname) throws InterruptedException {
		
		landingPage.SearchItem(Shortname);
		Thread.sleep(1000);
		testContextSetup.Landingpageprodname=landingPage.GetSearchText().split("-")[0].trim();
		System.out.println(Landingpageprodname +" is extracted from Home page");
	}
	

	@When("Added {string} items of the selected product to cart")
	public void And_increase_the_product_quantity(String Quantity) throws InterruptedException {
		
		landingPage.IncrementBtn(Integer.parseInt(Quantity));
		landingPage.ClickAddtoCart();
		
	}
	


}
