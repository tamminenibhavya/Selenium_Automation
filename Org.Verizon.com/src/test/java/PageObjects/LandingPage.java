package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By Search=By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By FindProdname=By.cssSelector("h4.product-name");
	By Topdeals=By.linkText("Top Deals");
	By Plusicon=By.cssSelector("a.increment");
	//By CartQty=By.cssSelector("input.quantity");
	By AddtoCartBtn=By.xpath("//button[contains(text(),'ADD TO CART')]");
	
	public void SearchItem(String name) {
		driver.findElement(Search).sendKeys(name);
	}
	
	
	public String GetSearchText() {
	    return driver.findElement(FindProdname).getText();
	}
	public void ClickTopdeals() {
        driver.findElement(Topdeals).click();
	}
	
	public String GetTitle() {
        return driver.getTitle();
	}
	
	public void IncrementBtn(int Quantity ) {
		int ReqQty =Quantity-1 ;
		while(ReqQty>0)
		{
		driver.findElement(Plusicon).click();
		ReqQty--;
		}	
	}
	public void ClickAddtoCart() {
        driver.findElement(AddtoCartBtn).click();
	}
	
	
}
