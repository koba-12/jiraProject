package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage3 {

    public LogoutPage3(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "title")
    public WebElement loginPage;
}
