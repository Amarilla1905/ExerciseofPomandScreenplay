package co.com.demoqa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/web_tables.feature",
            snippets = SnippetType.CAMELCASE,
            glue= "co.com.demoqa.stepsdefinitions")
    public class WebTableRunner {

    }

