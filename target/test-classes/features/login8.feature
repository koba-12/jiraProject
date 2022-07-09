Feature: login feature
  User story:
  All users can see their own usernames in the profile menu, after successful login

  Scenario Outline: own username

    When user, enters username "<username>"
    And user, enters password "<password>"
    And user, clicks the login button
    Then user sees "<name>" in the profile menu


    Examples: search values will be as below listed


      | username       |  password              |     name               |
      |  user4         | UserUser123            |    John Doe            |
      | storemanager70 | UserUser123            |    John Doe            |
      |salesmanager141 | UserUser123            |    John Doe            |