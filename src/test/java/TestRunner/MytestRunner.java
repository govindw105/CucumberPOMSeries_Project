package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:parallel"},
        glue = {"parallel"},
      //  tags = "@All",
        plugin = {
        		  "pretty",
        	        "html:target/cucumber-reports.html",
        	        "json:target/cucumber.json",
        	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                   "timeline:test-output-thread/"
            }
		)

public class MytestRunner {
	
	

}
  