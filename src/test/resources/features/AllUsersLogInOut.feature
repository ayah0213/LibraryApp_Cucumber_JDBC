@student_librarian_login
Feature: Both Student and Librarians login to library app

Background:  User is already logged in
 Given user is on login page

  Scenario Outline: As a user, I should be able to login to the library app.
    When users enters "<email>" and "<password>"
    And users click on sign up button
    Then users verify that "<dashboard>" page is subtitle
    And user clicks on logout button

    Examples: making sure all credentials are successfully logged in and dashboard same
      | email               | password | dashboard |
      | student11@library   | tScBPCUr |Books      |
      | student54@library   | 3nHQlWhN |Books      |
      | student55@library   | 8TPM4JKJ |Books      |
      | student56@library   | 4dJYzMiG |Books      |
      | librarian43@library | np6AxVIh |Dashboard  |
