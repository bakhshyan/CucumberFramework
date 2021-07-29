package com.cucumber.testng.runner;



//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-reports",
        "json:target/cucumber-reports/CucumberTests.json",
        "json:target/cucumber-reports/CucumberTests.xml"},
        monochrome = true,
        tags = "@smoke",
        glue = "com.cucumber.testng",
        features = "classpath:com/cucumber/testng/features"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
