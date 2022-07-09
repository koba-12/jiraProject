package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login4Page {

    public Login4Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPasword;

    @FindBy(className = "title")
    public WebElement forgotPasswordPage;
}
