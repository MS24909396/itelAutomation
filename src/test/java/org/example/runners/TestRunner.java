package org.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.example.stepdefinitions",
        plugin = {
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true
)
public class TestRunner {
    static {
        System.setProperty("extent.reporter.spark.start", "true");
        System.setProperty("extent.reporter.spark.out", "target/reports/ExtentReport.html");
        System.out.println("🟡 [DEBUG] TestRunner started...");
    }
}