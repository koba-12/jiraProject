Feature: Login feature
  User story:
  All users can log in with valid credentials (We have 3 types of users such as sales manager, store manager, truck driver).
  - Driver should land on the "Quick Launchpad" page after successful login
  - Sales Manager/ Store Manager should land on the "Dashboard" page after successful login


  Scenario Outline:Xfleet login functionality
    When User enters the username "<username>"
    And User enters the password "<password>"
    And User clicks login button
    Then User should be able to see "<homePage>"

Examples:
| username        | password    | homePage        |
| user1           | UserUser123 | Quick Launchpad |
| storemanager51  | UserUser123 | Dashboard       |
| salesmanager127 | UserUser123 | Dashboard       |