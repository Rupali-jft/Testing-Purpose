Feature: Sign In Gmail
  Scenario: Entering the login credentials
    Given I am on the login page of Gmail
    When Entering the valid Credentials username and password
    Then Click on Login button

    Scenario: Compose Function
      Given I am on Gmail Home Page
      When Click on Compose icon
      Then Enter email address in To field
      And Subject in the subject field
      And Write the body of the mail
      Then Click on Send button

