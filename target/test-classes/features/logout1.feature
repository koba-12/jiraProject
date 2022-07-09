Feature: Logout feature
  User story:
  User Story :

  As a user, I should be able to log out
  The user can log out and ends up on the login page.

  Scenario Outline:Xfleet logout functionality

    When user enters username "<username>".
    And user enters password "<password>".
    And user, clicks the login button.
    And user is on  title page
    And user clicks Logout Dropdown menu
    And user clicks Logout button in the Dropdown menu
    Then user sees Login Page

    Examples: search values will be as below listed

      | username       |  password              |
      |  user7         | UserUser123            |
      | storemanager88 | UserUser123            |
      |salesmanager122 | UserUser123            |