package com.cybrtek.librray_db.step_definitions;

import com.cybrtek.librray_db.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {


    @Before
    public void seTupScenario() {
       // Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        System.out.println("******************************");
        System.out.println("Setting up browser with details");
    }


    @After
    public void tearDownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Test FAILED");
        } else {
            System.out.println("---Take a screenshot");
            System.out.println("---Closing browser and ");
        }
        System.out.println("******************************");
        Driver.closeDriver();

    }
}