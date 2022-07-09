Feature: Login feature
  User Story :
  Invalid username or password." should be displayed for invalid
  (valid username-invalid password and invalid username-valid password) credentials

  Scenario Outline: invalid login
    Given User is on Xfleet home page
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    Then user sees the alert of "<InvalidAlert>"


    Examples: search values will be as below listed

      | username       |  password              |           InvalidAlert                |
      |  user9         | fnrbhche               |  Invalid user name or password.       |
      | storemanager62 | thelotr                |  Invalid user name or password.       |
      |salesmanager111 | qwertyuo               |  Invalid user name or password.       |
      |  lmbvlcvı      | UserUser123            |  Invalid user name or password.       |
      |storemanagerrrr | UserUser123            |  Invalid user name or password.       |
      |salesmanager404 | UserUser123            |  Invalid user name or password.       |