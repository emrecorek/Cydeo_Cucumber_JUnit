package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableCydeoPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Map;

public class WebTableCydeoSteps {

    WebTableCydeoPage webTableCydeoPage = new WebTableCydeoPage();

    @Given("user goes to login page")
    public void user_goes_to_login_page() {

        String url = ConfigurationReader.getProperty("web.table.url");

        Driver.getDriver().get(url);

    }
    @When("user gives correct username {string}")
    public void user_gives_correct_username(String username) {

        webTableCydeoPage.usernameBox.sendKeys(username);


    }
    @When("user gives correct password {string}")
    public void user_gives_correct_password(String password) {

        webTableCydeoPage.passwordBox.sendKeys(password + Keys.ENTER);
    }
    @Then("url should end with orders")
    public void url_should_end_with_orders() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("orders"));
    }


    @When("user gives username {string} password {string}")
    public void userGivesUsernamePassword(String username, String password) {

        /*
        user_gives_correct_username(username);
        user_gives_correct_password(password);
         */

        webTableCydeoPage.login(username, password);

    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {

        webTableCydeoPage.login(credentials.get("username"), credentials.get("password"));

    }

}
