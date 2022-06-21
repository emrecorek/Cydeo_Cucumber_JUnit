package com.cydeo.step_definitions;

import com.cydeo.pages.DicePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DiceStepDefs {

    DicePage dicePage = new DicePage();
    @Given("User is on dice homepage")
    public void user_is_on_dice_homepage() {
        System.out.println("User is going to Dice Home Page");
        Driver.getDriver().get("https://www.dice.com");

        Driver.getDriver().findElement(By.xpath("//a[@class='cmpboxbtn cmpboxbtnyes cmptxt_btn_yes']")).click();

    }
    @When("User enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() {
        System.out.println("User is entering Java and 22102 zipcode and click search button");
        dicePage.keywordBox.sendKeys("java");
        dicePage.zipCodeBox.sendKeys("22102"+ Keys.ENTER);

    }
    @Then("User should see search results")
    public void user_should_see_search_results() {
        System.out.println("user is getting the result and verify");

        System.out.println("Job Count = " + dicePage.totalJobs.getText());
    }
}