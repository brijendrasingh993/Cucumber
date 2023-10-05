package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@Test
	@CucumberOptions(features="./src/test/java/features/LoginParellalExecution.feature",glue = "stepdefination",tags = "@regression")
	public class RunnerParellalExecution extends AbstractTestNGCucumberTests{

	}
