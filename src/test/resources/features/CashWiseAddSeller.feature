@RegressionTest
Feature: Cash Wise Add Seller
  Background:

    Given User goes to the url "https://cashwise.us"
    Then user click on username "vladtest@gmail.com"
    Then user click on password "123456"
    Then user click on sign in
@positive
Scenario: add seller
  Then user clicks on Expensess
  Then user clicks on seller
  Then user clicks on add Seller
  Then user input title "title"
  Then user input full name "fullName"
  Then user input Email "email"
  Then user input phoneNumber "phoneNumber"
  Then user input address "string"
  Then user click save
  Then user close the browser

  @Verify
    Scenario: Verify Seller was added
    Then user clicks on Expensess
    Then user clicks on seller
    Then user verify seller was added
    Then user close the browser


  @Negative
  Scenario:  added seller with wrong full name
    Then user clicks on Expensess
    Then user clicks on seller
    Then user clicks on add Seller
    Then user input title "addedtitle"
    Then user input Wrong full-name "Johny Dankha1"
    Then user input Email "email"
    Then user input phoneNumber "phoneNumber"
    Then user input address "string"
    Then user click save
    Then user verify error message
    Then user close the browser

    @Search
    Scenario: search name in search bar
      Then user clicks on Expensess
      Then user clicks on seller
      Then user clicks on search bar
      Then user will input a seller name
      Then user close the browser


      @NegativeSearch
      Scenario: user enter a name that is not a seller
        Then user clicks on Expensess
        Then user clicks on seller
        Then user clicks on search bar
        Then user input wrong seller name "Johny"
        Then user close the browser











