package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {
		"org.stepdefinition" }, monochrome = true, plugin = {"json:@.target/JSONOutput2","html:target","rerun:./src/test/resources/failed.txt"},tags = "smoke")

public class Runner {

}