package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By CartBtn=By.cssSelector("[alt='Cart']");
	By CheckoutBtn=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By Prodname=By.cssSelector(".product-name");
	By ApplyBtn=By.cssSelector(".promoBtn");
	By PlaceOrderBtn=By.xpath("//button[contains(text(),'Place Order')]");
	
	public void Checkout() {
		driver.findElement(CartBtn).click();
		driver.findElement(CheckoutBtn).click();
	}
	public String Getprodname()
	{
		return driver.findElement(Prodname).getText();
	}
	public boolean VerifyPromobtn()
	{
		 return driver.findElement(ApplyBtn).isDisplayed();
		
	}
	public boolean VerifyPlaceOrder()
	{
		 return driver.findElement(PlaceOrderBtn).isDisplayed();
	}
	
	
	
	
}
