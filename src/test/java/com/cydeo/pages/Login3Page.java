package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login3Page {

    public Login3Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(name = "_csrf_token")
    public WebElement errorMessage;
}
