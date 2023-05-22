package Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/TH20463800/Documents/Thara/Irctc/"
				+ "src/main/java/Cucumber/Login.feature"
		,glue={"Cucumber"},
		tags ="@Birds"
		
		
		)
public class Runner {

}
