package com.cydeo.pages.n11;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11_ResultPage1 {

    public N11_ResultPage1(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (tagName = "h1")
    public WebElement searchedElement;

    @FindBy(xpath = "//a[.='2']")
    public WebElement secondPage;
}
