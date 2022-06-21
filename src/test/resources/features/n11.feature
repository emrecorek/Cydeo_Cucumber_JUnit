@N11
Feature: N11 favourite product scenario

  Scenario: N11 favorite product scenario
    When User goes to the main page
    And User verify the main page is opened
    And User clicks sign in button
    And User clicks login with facebook
    And User clicks agree button
    And User writes email in email box "montekristo3533@gmail.com"
    And User writes password in password box and press enter "3533montekristo"
    And User verify login process "Monte Kristo"
    And User types a product name in search box "Iphone"
    And User verify the searched product "Iphone"
    And User goes to the second page on the result page
    And User verify the second page is opened
    And User adds the third product to favourites
    And User goes to the My favourites page
    And User verify My favourites page is opened
    And User deletes the added product
    And User verify teh deletion process
    Then User logs out