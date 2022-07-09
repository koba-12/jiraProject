package com.cydeo.step_definitions;

import com.cydeo.pages.Login6Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login6_stepDefinitions {

    Login6Page login6Page=new Login6Page();

    @When("user enters password")
    public void user_enters_password() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        login6Page.password.sendKeys("UserUser123");

    }
    @Then("user can see the password in bullet signs")
    public void user_can_see_the_password_in_bullet_signs() {
        Assert.assertTrue(login6Page.bulletSign.isDisplayed());
    }
}
