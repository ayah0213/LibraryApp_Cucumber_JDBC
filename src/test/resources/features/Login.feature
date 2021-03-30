@login
  Feature: Cybertek library login
    As a librarian1 I should be able login.

    Background: User is already logged in
      Given user is on login page

  Scenario: login as a librarian1
    When user login as librarian1
    Then user veriefies  that dashboard page subtitle is displayed




