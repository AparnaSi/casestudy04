package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/skeleton/reg.feature","src/test/resources/skeleton/login.feature","src/test/resources/skeleton/example.feature","src/test/resources/skeleton/example2.feature"},glue="stepdef")
 
public class runnerclass {

}
