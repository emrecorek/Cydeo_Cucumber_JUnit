package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "L2AGLb")
    public WebElement acceptButton;

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    public WebElement searchBox;



}
