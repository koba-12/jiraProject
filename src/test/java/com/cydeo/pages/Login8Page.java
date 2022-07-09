package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login8Page {

    public Login8Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(className = "dropdown-toggle")
    public WebElement ownName;
}
