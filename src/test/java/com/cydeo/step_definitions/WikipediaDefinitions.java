package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaDefinitions {

    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("User is on Wikipedia home page")
    public void userIsOnWikipediaHomePage() {
        Driver.getDriver().get("https://www.wikipedia.com");
    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String str) {
        wikipediaPage.searchBox.sendKeys(str);
    }

    @And("User clicks wiki search button")
    public void userClicksWikiSearchButton() {
        wikipediaPage.searchButton.click();
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String str) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String str) {
        Assert.assertEquals(str,wikipediaPage.mainHeader.getText());
    }


}
