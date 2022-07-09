package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2Page {

    public Login2Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement invalidLoginAlert;
}
