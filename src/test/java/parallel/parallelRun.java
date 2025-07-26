package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:parallel"},
		glue = {"parallel"},
        plugin = {
        		  "pretty",
        	        "html:target/cucumber-reports.html",
        	        "json:target/cucumber.json",
        	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                   "timeline:test-output-thread/"
            },
        monochrome = true
     		        
		      //  tags = "@All",
		)


public class parallelRun extends AbstractTestNGCucumberTests{
	
@Override 	
@DataProvider(parallel = true)
public Object [][] scenarios () {
	return super.scenarios();
	
}

}

