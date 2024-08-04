@AddCheck
 Feature: Login
   Background:
     Given user is on "https://www.cashwise.us/main"
     And user clicks on singIn button
     And user enters email "vladtest@gmail.com"
     And user enters password "123456"
     Then user clicks on login


   @PositiveScenario
     Scenario: Add Checks
     When user comes to expences page
     And user selects to Checks
     And user adds an account
     And user inputs name "Ellza"
     And user inputs comments "Tuition feee"
     And user adds the date "08/02/2024"
     And user clicks Add button
     And confirm the message  "The invoice was successfully created"
     Then close the browser



    @WrongUserName
    Scenario: add user with wrong name
      When user comes to expences page
      And user selects to Checks
      And user adds an account
      And user inputs name "123456"
      And user inputs comments "Tuition fee"
      And user adds the date "08/02/2024"
      And user clicks Add button
      And close the browser





