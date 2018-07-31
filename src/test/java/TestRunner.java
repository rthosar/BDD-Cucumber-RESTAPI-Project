
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
monochrome=true,
glue={"com.bdd.specs"},
features={"classpath:Search"},
plugin={"pretty","html:target/cucumber","json:target/cucumber.json"}

)
public class TestRunner {

}
