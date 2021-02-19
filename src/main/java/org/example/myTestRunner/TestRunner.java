package org.example.myTestRunner;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\main\\java\\org\\example\\features\\infoUpdates.feature"},
        glue = {"org\\example\\stepDefinitions"},
        format={"pretty","html:test-outout", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"},
        dryRun = false
)
public class TestRunner {
}
//src/main/java/org/example/features/orderProducts.feature
//src/main/java/org/example/features/Login.feature
//src/main/java/org/example/features/infoUpdates.feature