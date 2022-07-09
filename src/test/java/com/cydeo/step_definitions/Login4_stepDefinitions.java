package com.cydeo.step_definitions;

import com.cydeo.pages.Login4Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login4_stepDefinitions {

    Login4Page login4Page=new Login4Page();

    @When("user clicks the Forgot your password? button")
    public void user_clicks_the_forgot_your_password_button() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        login4Page.forgotPasword.click();
    }
    @Then("user lands on the {string} page")
    public void user_lands_on_the_page(String string) {
        Assert.assertTrue(login4Page.forgotPasswordPage.isDisplayed());
    }

}
