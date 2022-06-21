package com.cydeo.pages.n11;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyFavouritesListsPage {

    public MyFavouritesListsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h4[@class='listItemTitle']")
    public WebElement myFavourites;
}
