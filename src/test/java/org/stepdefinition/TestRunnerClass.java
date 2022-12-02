package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.stepdefinition",
monochrome = true, 
dryRun = false,
strict = true,
snippets = SnippetType.CAMELCASE,
tags = "@Feature4",
plugin = {"html:JVM","junit:JVM\\junitreport.xml","json:JVM\\jsonreport.json"})
public class TestRunnerClass {

}
