Feature: Login feature
  User story:
  "Please fill out this field" message should be displayed if the password or username is empty


  Scenario Outline:  "Please fill out this field" message

    When user enters the username "<username>"
    And user enters the password "<password>"
    And user clicks the login button.
    Then user sees the message of "<error_message>"


    Examples:
      | username       | password    | error_message               |
      |   user15       |             | Lütfen bu alanı doldurun.   |
      | storemanager90 |             | Lütfen bu alanı doldurun.   |
      |salesmanager131 |             | Lütfen bu alanı doldurun.   |
      |                | UserUser123 | Lütfen bu alanı doldurun.   |
      |                | UserUser123 | Lütfen bu alanı doldurun.   |
      |                | UserUser123 | Lütfen bu alanı doldurun.   |
