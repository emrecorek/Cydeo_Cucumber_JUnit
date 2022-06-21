package com.cydeo.pages.n11;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11_LoginPage extends N11_MainPage {

    public N11_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[@data-connecturl]")
    public WebElement loginWithFacebookButton;






}
