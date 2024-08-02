@AddingClient
Feature: Add Client

  Background:
    Given user is on "https://www.cashwise.us/main"
      And user clicks on singIn button
      And user enters email "vladtest@gmail.com"
      And user enters password "123456"
      Then user clicks on login


      @SuccessfullyLogsIng
      Scenario: Adding client test positive
        When user clicks on sales button
        And user clicks on Add client
        And user clicks on select tag
        And user clicks on create new tag
        And user inputs tag name
        And user clicks on save
        And user clicks on tag
        And user selects created tag
        And user inputs company name
        And user inputs user name
        And user inputs email
        And user inputs phone number
        And user inputs address
        And user clicks on save button
        Then verify client info is displayed
        Then user close the window





        @UserFaildtoLogIn
        Scenario: Adding client test negative
          When user clicks on sales button
          And user clicks on Add client
          And user clicks on select tag
          And user clicks on create new tag
          And user inputs tag name
          And user clicks on save
          And user clicks on tag
          And user selects created tag
          And user inputs company name
          And user inputs user name
          And user inputs email "amanbaev123"
          And user inputs phone number "31243965"
          And user inputs address
          And user clicks on save button
          Then verify error message is displayed
          Then user close the window



          @UserSelectingAllTags
          Scenario: User selecting all tags
            When user clicks on sales button
            And user click on check all button
            Then verify all tags are selected
            Then user close the window



            @ArchiveAll
            Scenario: Test if user can archive all users
              When user clicks on sales button
              And user click on check all button
              And user clicks on archive all button
              Then verify that list of clients is empty
              Then user close the window










