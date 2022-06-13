package com.cydeo.step_definitions;

import com.cydeo.pages.GooglePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GooglePage googlePage = new GooglePage();

    @When("user types {word} and clicks enter")
    public void user_types_and_clicks_enter2(String searchKeyword) {
        googlePage.acceptButton.click();
        googlePage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }




    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {
        googlePage.acceptButton.click();
        googlePage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String searchKeyword) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = searchKeyword;

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);

        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }



    @Then("user sees {word} in the google title")
    public void userSeesAppleInTheGoogleTitle(String word) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(word));

    }
}
