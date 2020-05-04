Feature: Search feature of the web page

  Scenario: Search based on Title
    Given  I am at the home page
    When User click on the Menu Button
    Then User click on Top Rated movies
    And Verify the TV show Category
    When User search for Game of Thrones
    Then User select Game of Thrones The Last Watch from the suggestion window
    And Verify the Titile, Rating and Reviews


  Scenario: Create a new Account
    Given I am at the home page
    When User click on the SignIn Button
    Then User click on the Create New Account Button
    Then User enter Your Name
    Then User enter EmailID
    Then User enter Password and ReTry Password
    And User click on the Create your IMDB Account Button
    And User click on the Signout Button
    And Verify User able to Login
