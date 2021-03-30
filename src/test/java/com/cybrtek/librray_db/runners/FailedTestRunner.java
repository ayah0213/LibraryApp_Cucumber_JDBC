package com.cybrtek.librray_db.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "",
        glue = "com/cybrtek/librray_db/step_definitions"
)
public class FailedTestRunner {



}
