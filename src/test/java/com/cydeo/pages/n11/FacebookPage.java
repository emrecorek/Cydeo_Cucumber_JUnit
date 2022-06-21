package com.cydeo.pages.n11;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {

    public FacebookPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy (xpath = "//button[@value='1']")
    public WebElement agreeButton;


    @FindBy (xpath = "//input[@type='text']")
    public WebElement emailInput;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement passwordInput;





}
