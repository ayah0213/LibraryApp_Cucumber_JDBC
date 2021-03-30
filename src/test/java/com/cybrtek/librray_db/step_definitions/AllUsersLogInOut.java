package com.cybrtek.librray_db.step_definitions;

import com.cybrtek.librray_db.pages.Login_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AllUsersLogInOut {


    Login_Page login= new Login_Page();

    @When("users enters {string} and {string}")
    public void users_enters_and(String username, String password) {
       login.loginWithParam(username, password);

    }


    @When("users click on sign up button")
    public void users_click_on_sign_up_button() {
        login.signUpBtn.click();
    }
    @Then("users verify that {string} page is subtitle")
    public void users_verify_that_page_is_subtitle(String expectedTxt) {
        String actualTxt = login.dashboardTxt.getText();
        Assert.assertTrue(actualTxt.equalsIgnoreCase(expectedTxt));

    }


    @And("user clicks on logout button")
    public void userClicksOnLogoutButton() {
        login.logOutBtn.click();
        login.logoutClick.click();
    }
}
