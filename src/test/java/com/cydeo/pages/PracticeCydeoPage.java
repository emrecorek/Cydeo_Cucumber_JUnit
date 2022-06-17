package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PracticeCydeoPage {

    public PracticeCydeoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "month")
    public WebElement select;



    public List<String> getTexts(){

        Select select = new Select(this.select);

        List<String> months = new ArrayList<>();

        for (WebElement element : select.getOptions()) {
            months.add(element.getText());
        }

        return months;
    }



}
