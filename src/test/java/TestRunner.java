
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
monochrome=true,
glue={"com.bdd.specs"},
features={"classpath:Search"}

		)
public class TestRunner {

}
