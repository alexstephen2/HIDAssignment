package com.automation.RunnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/React.feature"
		,glue={"com.automation.StepDefn"}
		,dryRun=false
		,tags={"@MainConcepts ,@AdvanceGuides ,@ScrollFunctionality"}
		)

public class TestRunner {
}
