package com.cydeo.step_definitions;

import com.cydeo.pages.LogoutPage3;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout3_stepDefinitions {

    LogoutPage3 logoutPage3=new LogoutPage3();

    @When("user close the all tabs")
    public void user_close_the_all_tabs() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        Driver.closeDriver();
    }
    @When("user go to xfleet")
    public void user_go_to_xfleet() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
    }
    @Then("user should be on the login page")
    public void user_should_be_on_the_login_page() {
        Assert.assertTrue(logoutPage3.loginPage.isDisplayed());
        Assert.assertTrue(logoutPage3.loginPage.getText().equals("Login"));
    }

}
