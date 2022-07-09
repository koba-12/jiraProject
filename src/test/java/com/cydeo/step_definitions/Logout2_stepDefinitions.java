package com.cydeo.step_definitions;

import com.cydeo.pages.Logout2Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Logout2_stepDefinitions {

    Logout2Page logout2Page = new Logout2Page();

    @When("user, enters the username {string}")
    public void user_enters_the_username(String string) {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        logout2Page.username.sendKeys(string);
    }

    @When("user, enters the password {string}")
    public void user_enters_the_password(String string) {
        logout2Page.password.sendKeys(string);
    }

    @When("user, clicks login button.")
    public void user_clicks_login_button() {
        logout2Page.loginButton.click();
    }

    @When("user, is on  title page")
    public void user_is_on_title_page() {
        Assert.assertTrue(logout2Page.title.isDisplayed());
    }

    @When("user, clicks Logout Dropdown menu")
    public void user_clicks_logout_dropdown_menu() {
        logout2Page.logoutDropdown.click();
    }

    @When("user, clicks Logout button in the Dropdown menu")
    public void user_clicks_logout_button_in_the_dropdown_menu() {
        logout2Page.logout.click();
    }

    @When("user, sees Login Page")
    public void user_sees_login_page() {
        Assert.assertTrue(logout2Page.loginPage.isDisplayed());
    }

    @When("user clicks the stepback button")
    public void user_clicks_the_stepback_button() {
        Driver.getDriver().navigate().back();
    }

    @Then("User should be able to see login page")
    public void user_should_be_able_to_see_login_page() {
        Assert.assertTrue(logout2Page.seeloginPage.isDisplayed());
    }
}