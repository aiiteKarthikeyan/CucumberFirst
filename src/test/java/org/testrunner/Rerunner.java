package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@./src/test/resources/failed.txt", glue = {
		"org.stepdefinition" }, plugin = {"rerun:./src/test/resources/failed.txt"})

public class Rerunner {

}