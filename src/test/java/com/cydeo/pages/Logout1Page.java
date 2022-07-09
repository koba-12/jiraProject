package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout1Page {

    public Logout1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.='Fleet Management']")
    public WebElement title;

    @FindBy(id = "user-menu")
    public WebElement logoutDropdown;

    @FindBy(className = "no-hash")
    public WebElement logout;

    @FindBy(className = "title")
    public WebElement loginPage;
}
