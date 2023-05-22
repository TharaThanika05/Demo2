package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/TH20463800/Documents/Thara/Irctc/src/main/java/Features/ABC.feature"
		,glue={"Binding"},
		//tags ="@Brands",
		dryRun =true,
		monochrome=true
		//plugin = {"pretty", "html:target/cucumber-reports"}
		
		)
public class Runner extends AbstractTestNGCucumberTests{

}
