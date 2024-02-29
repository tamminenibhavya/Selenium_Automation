package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup)
	{
	     this.testContextSetup =testContextSetup;
	}
	@After
	public void AfterScenario() throws IOException {
		 testContextSetup.baseSetup.WebDriverManager().quit();
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver =testContextSetup.baseSetup.WebDriverManager();
		if(scenario.isFailed())
		{
		//screenshot
		File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");
		
		}
	}
	

}
