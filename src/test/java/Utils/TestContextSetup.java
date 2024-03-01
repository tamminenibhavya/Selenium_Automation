package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String Landingpageprodname;
	public PageObjectManager pageObjectManager;
	public BaseSetup baseSetup;
	public Generic generic;
	
	public TestContextSetup() throws IOException 
	{
		baseSetup=new BaseSetup();
		pageObjectManager=new PageObjectManager(baseSetup.WebDriverManager());
		generic=new Generic(baseSetup.WebDriverManager());
		
		
	}
	

}
