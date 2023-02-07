package com.co.bonbonite.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_BonBonite.feature",
    snippets = SnippetType.CAMELCASE,
    glue = "com.co.bonbonite.stepsdefinitions")

public class RegisterBonBoniteRunner {
}
