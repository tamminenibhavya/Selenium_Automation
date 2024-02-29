package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	
	public WebDriver driver;
	public OfferPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By Search=By.id("search-field");
	By FindProdname=By.cssSelector("tr td:nth-child(1)");
	
	public void SearchItem(String name) {
		driver.findElement(Search).sendKeys(name);
	}
	
	
	public String GetSearchText() {
	return driver.findElement(FindProdname).getText();
	}
	


}
