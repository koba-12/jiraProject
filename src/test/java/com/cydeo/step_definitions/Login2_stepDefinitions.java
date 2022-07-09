package com.cydeo.step_definitions;

import com.cydeo.pages.Login2Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login2_stepDefinitions {

    Login2Page login2Page=new Login2Page();

    @Given("User is on Xfleet home page")
    public void user_is_on_xfleet_home_page() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        login2Page.usernameBox.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        login2Page.passBox.sendKeys(string);
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        login2Page.loginButton.click();
    }
    @Then("user sees the alert of {string}")
    public void user_sees_the_alert_of(String string) {
        Assert.assertTrue(login2Page.invalidLoginAlert.isDisplayed());
        Assert.assertTrue(login2Page.invalidLoginAlert.getText().equals(string));
    }
}
