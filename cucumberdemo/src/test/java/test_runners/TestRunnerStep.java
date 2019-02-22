package test_runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\jenkins_workspace\\cucumberdemo\\src\\test\\java",
                 glue={"step_defs"},
                		 plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
                		 monochrome = true)
public class TestRunnerStep {

}
