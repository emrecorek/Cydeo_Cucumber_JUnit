package com.cydeo.pages.n11;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class N11_ResultPage2 {

    public  N11_ResultPage2() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='active ']")
    public WebElement actualPageNum;

    @FindBy (xpath = "(//span[@title='Favorilere ekle'])[3]")
    public WebElement thirdProductFavourite;

    @FindBy(xpath = "//div[@class='myAccount']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[@title='Favorilerim / Listelerim']")
    public WebElement myFavouritesLists;


}
