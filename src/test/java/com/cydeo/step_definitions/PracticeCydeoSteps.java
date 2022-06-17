package com.cydeo.step_definitions;

import com.cydeo.pages.PracticeCydeoPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class PracticeCydeoSteps {

    PracticeCydeoPage cydeoPage = new PracticeCydeoPage();

    @Given("User is on the dropdowns page of practice tool")
    public void userIsOnTheDropdownsPageOfPracticeTool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    @Then("User should see all month in dropdown")
    public void userShouldSeeAllMonthInDropdown(List<String> expectedResults) {

        Assert.assertEquals(expectedResults, cydeoPage.getTexts());

    }

}
