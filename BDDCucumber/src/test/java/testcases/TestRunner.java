package testcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( tags = "not @login",
				  features="src/test/java/testcases/",
				  //glue="Login",
				  plugin = {"pretty",
							  "html:target/cucumber-reports.html",
							  "json:target/cucumber-reports.json",
							  "junit:target/cucumber-reports.xml"
						   },
				  dryRun = true
				  
				)
public class TestRunner 
{

}
