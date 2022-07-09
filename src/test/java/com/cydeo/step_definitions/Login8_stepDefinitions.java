package com.cydeo.step_definitions;

import com.cydeo.pages.Login8Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login8_stepDefinitions {

    Login8Page login8Page=new Login8Page();

    @When("user, enters username {string}")
    public void user_enters_username(String string) {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        login8Page.username.sendKeys(string);
    }
    @When("user, enters password {string}")
    public void user_enters_password(String string) {
        login8Page.password.sendKeys(string);
    }
    @When("user, clicks the login button")
    public void user_clicks_the_login_button() {
        login8Page.loginButton.click();
    }
    @Then("user sees {string} in the profile menu")
    public void user_sees_in_the_profile_menu(String string) {
        Assert.assertTrue(login8Page.ownName.isDisplayed());
        Assert.assertTrue(login8Page.ownName.getText().equals(string));
    }
}
