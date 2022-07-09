package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login6Page {

    public Login6Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "prependedInput2")
    public WebElement bulletSign;
}
