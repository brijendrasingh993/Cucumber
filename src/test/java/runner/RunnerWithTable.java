package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features="./src/test/java/features/LoginWithTable.feature",glue = "stepdefination",dryRun = false)
public class RunnerWithTable extends AbstractTestNGCucumberTests{

}