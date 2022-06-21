package com.cydeo.pages.n11;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11_MainPage {

    public N11_MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (className = "btnSignIn")
    public WebElement signInButton;


    @FindBy(xpath = "(//a[@title='Hesabım'])[2]")
    public WebElement userName;

    @FindBy(id = "searchData")
    public WebElement searchBox;










}
