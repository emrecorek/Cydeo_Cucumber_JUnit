package com.cydeo.pages.n11;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyFavourites {

    public MyFavourites() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Favorilerim']")
    public WebElement pageTitle;

    @FindBy(xpath = "//span[.='Sil']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[@class='btn btnBlack confirm']")
    public WebElement confirmButton;

    @FindBy(xpath = "//div[@class='emptyWatchList hiddentext']")
    public WebElement emptyFavourite;

    @FindBy(xpath = "//a[@class='logoutBtn']")
    public WebElement logOut;


}
