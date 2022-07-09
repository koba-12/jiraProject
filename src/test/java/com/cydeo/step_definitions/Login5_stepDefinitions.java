package com.cydeo.step_definitions;

import com.cydeo.pages.Login5Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login5_stepDefinitions {

    Login5Page login5Page=new Login5Page();

    @When("user sees the Remember Me link on the login page")
    public void user_sees_the_remember_me_link_on_the_login_page() {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        Assert.assertTrue(login5Page.rememberMeLink.isDisplayed());

    }
    @Then("user can click the Remember Me checkbox")
    public void user_can_click_the_remember_me_checkbox() {
        login5Page.rememberMeClickable.click();

    }
}
