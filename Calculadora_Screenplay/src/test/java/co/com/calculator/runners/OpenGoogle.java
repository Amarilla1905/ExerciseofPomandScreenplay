package co.com.calculator.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/open_google.feature",
                snippets = SnippetType.CAMELCASE,
                glue = "co.com.calculator/stepsdefinitions")
public class OpenGoogle {
}
