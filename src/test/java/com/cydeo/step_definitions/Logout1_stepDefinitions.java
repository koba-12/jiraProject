package com.cydeo.step_definitions;

import com.cydeo.pages.Logout1Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout1_stepDefinitions {

    Logout1Page logout1Page=new Logout1Page();

    @When("user enters username {string}.")
    public void user_enters_username(String string) {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        logout1Page.username.sendKeys(string);
    }
    @When("user enters password {string}.")
    public void user_enters_password(String string) {
        logout1Page.password.sendKeys(string);
    }
    @When("user, clicks the login button.")
    public void user_clicks_the_login_button() {
        logout1Page.loginButton.click();
    }
    @When("user is on  title page")
    public void user_is_on_title_page() {
        Assert.assertTrue(logout1Page.title.isDisplayed());

    }
    @When("user clicks Logout Dropdown menu")
    public void user_clicks_logout_dropdown_menu() {
        logout1Page.logoutDropdown.click();
    }
    @When("user clicks Logout button in the Dropdown menu")
    public void user_clicks_logout_button_in_the_dropdown_menu() {
        logout1Page.logout.click();
    }
    @Then("user sees Login Page")
    public void user_sees_login_page() {
        Assert.assertTrue(logout1Page.loginPage.isDisplayed());
    }

}
