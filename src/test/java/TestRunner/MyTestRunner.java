package TestRunner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"C:\\Users\\barse\\eclipse-workspace\\CucumberProj\\src\\test\\resources\\Features\\"},
		glue= {"StepsDefination"}
		)

public class MyTestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
