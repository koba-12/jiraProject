package com.cydeo.step_definitions;

import com.cydeo.pages.Login3Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login3_stepDefinitions {

        Login3Page login3Page=new Login3Page();

    @When("user enters the username {string}")
    public void user_enters_the_username(String string) {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        login3Page.usernameBox.sendKeys(string);
    }
    @When("user enters the password {string}")
    public void user_enters_the_password(String string) {
        login3Page.passBox.sendKeys(string);
    }
    @When("user clicks the login button.")
    public void user_clicks_the_login_button() {
        login3Page.loginButton.click();
    }
    @Then("user sees the message of {string}")
    public void user_sees_the_message_of(String string) {
        Assert.assertTrue(login3Page.errorMessage.isDisplayed());
        Assert.assertTrue(login3Page.errorMessage.getText().equals(string));
    }

}
