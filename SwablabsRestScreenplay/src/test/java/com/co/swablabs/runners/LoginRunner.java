package com.co.swablabs.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
snippets = CucumberOptions.SnippetType.CAMELCASE,
glue = "com.co.swablabs.stepsdefinitions")
public class LoginRunner {
}
