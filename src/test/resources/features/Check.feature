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
     And user inputs comments"Tuition feee"
     And user adds the date "08/02/2024"
     And user clicks Add button
     And close the browser

