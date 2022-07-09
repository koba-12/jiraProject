package com.cydeo.step_definitions;

import com.cydeo.pages.Login1Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login1_stepDefinitions {

    Login1Page login1Page=new Login1Page();


    @When("User enters the username {string}")
    public void user_enters_the_username(String string) {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        login1Page.usernameBox.sendKeys(string);

    }
    @When("User enters the password {string}")
    public void user_enters_the_password(String string) {
        login1Page.passBox.sendKeys(string);

    }
    @When("User clicks login button")
    public void user_clicks_login_button() {
        login1Page.loginButton.click();

    }
    @Then("User should be able to see {string}")
    public void user_should_be_able_to_see(String string) {
        Assert.assertTrue(login1Page.homePage.isDisplayed());
        Assert.assertTrue(login1Page.homePage.getText().equals(string));
    }

}
