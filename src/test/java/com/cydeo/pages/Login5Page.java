package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login5Page {

    public Login5Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "custom-checkbox__text")
    public WebElement rememberMeLink;

    @FindBy(className = "custom-checkbox__icon")
    public WebElement rememberMeClickable;
}
