package TestRunner;


import java.io.File;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Features"},
		glue= {"StepsDefination"}
		)

public class MyTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider
	public Object[][] scenarios(){
		return super.scenarios();
	}


}