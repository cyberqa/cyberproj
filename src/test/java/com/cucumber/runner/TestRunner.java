package com.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/com/cucumber/feature/test.feature",glue={"com.cucumber.stepdefinitions"}
, format = { "pretty", "html:target/cucumber-reports" })
public class TestRunner {

}
