package experibank.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/experiBank.feature"}
        ,tags = "@Regresion"
        ,glue = "experibank.stepdefinitions"
        ,snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
