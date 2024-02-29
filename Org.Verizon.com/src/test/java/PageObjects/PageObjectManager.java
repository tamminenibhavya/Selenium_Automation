package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{
	public WebDriver driver;
	public LandingPage landingpage;
	public OfferPage OfferPage;
	public CheckoutPage checkoutPage;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public  LandingPage GetLandingPageObject()
	{
		landingpage=new LandingPage(driver);
		return landingpage;
	}
	public  OfferPage GetOfferPageObject()
	{
		OfferPage=new OfferPage(driver);
		return OfferPage;
	}
	public  CheckoutPage GetcheckoutPageObject()
	{
		checkoutPage=new CheckoutPage(driver);
		return checkoutPage;
	}
	
	

}
