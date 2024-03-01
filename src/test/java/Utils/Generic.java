package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generic
{
	public WebDriver driver;
public Generic(WebDriver driver) 
{
	this.driver=driver;
}
	public void SwitchtoChildWindow()
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parentwindow=i1.next();
		String childwindow=i1.next();
		driver.switchTo().window(childwindow);
	
	}
}
