package com.cybrtek.librray_db.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = "html:target/cucumber-report.html",
        features ="src/test/resources/features",
        glue = "com/cybrtek/librray_db/step_definitions",
        dryRun = false,
        tags = "@student_librarian_login"
       // "@login"

)

public class CukesRunner {
}
