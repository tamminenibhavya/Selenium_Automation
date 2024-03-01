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

import PageObjects.CheckoutPage;
import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utils.TestContextSetup;

public class CheckoutPageStepDefn {
	
	public CheckoutPage checkoutPage;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	
	public CheckoutPageStepDefn(TestContextSetup testContextSetup) 
	{
		this.testContextSetup=testContextSetup;
		this.checkoutPage=testContextSetup.pageObjectManager.GetcheckoutPageObject();
	}
	

	

	@Then("^check same product (.+) should be visible under product name column in the checkout page$")
	public void check_same_product_should_be_visible_under_product_name_in_the_checkout(String Shortname) throws InterruptedException {
		
		checkoutPage.Checkout();
		Thread.sleep(3000);
		String Actualprodname = checkoutPage.Getprodname();
		Assert.assertEquals(Actualprodname.split("-")[0].trim(), Shortname);
		
		
	}
	

	@Then("check whether user is able to apply promocode and place the order")
	public void user_is_able_to_apply_promocode_and_place_the_order() throws InterruptedException {
		Assert.assertTrue(checkoutPage.VerifyPromobtn());
		Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
	}

	


}
