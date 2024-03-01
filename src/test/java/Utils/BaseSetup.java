package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSetup 
{
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop=new Properties();
		prop.load(fs);
		String Url = prop.getProperty("QAUrl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		// result = testCondition ? value1 : value2
		
		String browser = browser_maven!=null ? browser_maven : browser_properties;
		if (driver==null)
		 {
			if(prop.getProperty("browser").equalsIgnoreCase("Chrome"))
			{
			   driver = new ChromeDriver();
		    }
		driver.get(Url);
		}
		return driver;
	}
}

