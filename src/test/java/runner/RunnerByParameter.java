package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features="./src/test/java/features/LoginByParameters.feature",glue = "stepdefination")
public class RunnerByParameter extends AbstractTestNGCucumberTests{

}
