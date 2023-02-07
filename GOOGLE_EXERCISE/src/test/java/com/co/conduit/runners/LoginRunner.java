package com.co.conduit.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login_conduit.feature",
        snippets = SnippetType.CAMELCASE,
        glue= "com.co.conduit.stepsdefinitions" )

public class LoginRunner {

}
