package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_Scenarios.txt",glue="stepDefinition", 
monochrome=true,plugin={"html:target/cucmber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
//,tags="@placeorder or @searchorder")

public class TestRunnerforFailedScenarios extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
     public Object[][] scenarios()
     {
    	 return super.scenarios();
     }
	
}
