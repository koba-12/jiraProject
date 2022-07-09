package com.cydeo.step_definitions;

import com.cydeo.pages.Login7Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Login7_stepDefinitions {

    Login7Page login7Page=new Login7Page();

    @When("user enters username")
    public void user_enters_username() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        login7Page.username.sendKeys("user1");
    }

    @Then("user enters the password")
    public void user_enters_the_password() {
        login7Page.password.sendKeys("UserUser123");
    }

    @Then("user use Enter keyword.")
    public void user_use_enter_keyword() {
        Keys enter = Keys.ENTER;
    }

}
