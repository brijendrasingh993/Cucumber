package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features="./src/test/java/features/Login.feature",glue = "stepdefination")
public class Runner extends AbstractTestNGCucumberTests{

}