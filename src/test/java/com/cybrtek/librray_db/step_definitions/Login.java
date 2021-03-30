package com.cybrtek.librray_db.step_definitions;

import com.cybrtek.librray_db.pages.Login_Page;
import com.cybrtek.librray_db.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login {

   Login_Page page =new Login_Page();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");

    }

    @When("user login as librarian1")
    public void user_login_as_librarian1() {
       page.loginMethod();

    }


    @Then("user veriefies  that dashboard page subtitle is displayed")
    public void userVeriefiesThatDashboardPageSubtitleIsDisplayed() {
       Assert.assertTrue(page.dashboardTxt.isDisplayed());


    }



}
