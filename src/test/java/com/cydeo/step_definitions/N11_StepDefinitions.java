package com.cydeo.step_definitions;

import com.cydeo.pages.n11.*;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class N11_StepDefinitions {


    N11_MainPage n11MainPage = new N11_MainPage();
    N11_LoginPage n11LoginPage = new N11_LoginPage();
    FacebookPage facebookPage = new FacebookPage();
    N11_ResultPage1 n11ResultPage1 = new N11_ResultPage1();
    N11_ResultPage2 n11ResultPage2 = new N11_ResultPage2();
    MyFavouritesListsPage myFavouritesListsPage = new MyFavouritesListsPage();
    MyFavourites myFavourites = new MyFavourites();

    Actions actions = new Actions(Driver.getDriver());

    @When("User goes to the main page")
    public void userGoesToTheMainPage() {
        Driver.getDriver().get("https://n11.com");
    }

    @And("User verify the main page is opened")
    public void userVerifyTheMainPageIsOpened() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.n11.com/";

        Assert.assertEquals(expectedUrl, currentUrl);
    }

    @And("User clicks sign in button")
    public void userClicksSignInButton() {

        WaitUtils.waitVisibilityOfElement(n11MainPage.signInButton);

        n11MainPage.signInButton.click();

    }

    @And("User clicks login with facebook")
    public void userClicksLoginWithFacebook() {

        n11LoginPage.loginWithFacebookButton.click();

    }

    String firstWindowHandle = Driver.getDriver().getWindowHandle();

    @And("User clicks agree button")
    public void userClicksAgreeButton() {

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        for (String windowHandle : windowHandles) {
            Driver.getDriver().switchTo().window(windowHandle);
        }

        facebookPage.agreeButton.click();

    }



    @And("User writes email in email box {string}")
    public void userWritesEmailInEmailBox(String email) {

        facebookPage.emailInput.sendKeys(email);

    }

    @And("User writes password in password box and press enter {string}")
    public void userWritesPasswordInPasswordBoxAndPressEnter(String password) {

        facebookPage.passwordInput.sendKeys(password + Keys.ENTER);
    }

    @And("User verify login process {string}")
    public void userVerifyLoginProcess(String userName) {

        Driver.getDriver().switchTo().window(firstWindowHandle);

        WaitUtils.waitVisibilityOfElement(n11MainPage.userName);
        Assert.assertEquals(userName, n11MainPage.userName.getText());

    }

    @And("User types a product name in search box {string}")
    public void userTypesAProductNameInSearchBox(String product) {

        n11MainPage.searchBox.sendKeys(product + Keys.ENTER);

    }

    @And("User verify the searched product {string}")
    public void userVerifyTheSearchedProduct(String product) {

        Assert.assertTrue(n11ResultPage1.searchedElement.getText().startsWith(product));

    }

    @And("User goes to the second page on the result page")
    public void userGoesToTheSecondPageOnTheResultPage() {

        n11ResultPage1.secondPage.click();
    }

    @And("User verify the second page is opened")
    public void userVerifyTheSecondPageIsOpened() {

        Assert.assertEquals("2", n11ResultPage2.actualPageNum.getText() );
    }

    @And("User adds the third product to favourites")
    public void userAddsTheThirdProductToFavourites() {

        n11ResultPage2.thirdProductFavourite.click();

    }

    @And("User goes to the My favourites page")
    public void userGoesToTheMyFavouritesPage() {


        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//div[@class='myAccount']"))).perform();

        n11ResultPage2.myFavouritesLists.click();

        myFavouritesListsPage.myFavourites.click();



    }

    @And("User verify My favourites page is opened")
    public void userVerifyMyFavouritesPageIsOpened() {

        Assert.assertEquals("Favorilerim", myFavourites.pageTitle.getText());


    }

    @And("User deletes the added product")
    public void userDeletesTheAddedProduct() {
        myFavourites.deleteButton.click();
        myFavourites.confirmButton.click();
    }

    @And("User verify teh deletion process")
    public void userVerifyTehDeletionProcess() {
        Assert.assertTrue(myFavourites.emptyFavourite.isDisplayed());
    }

    @Then("User logs out")
    public void userLogsOut() {

        actions.moveToElement(n11ResultPage2.myAccount).perform();

        myFavourites.logOut.click();

        Assert.assertTrue( Driver.getDriver().getTitle().contains("Giriş Yap"));
    }



}
