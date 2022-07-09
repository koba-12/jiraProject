Feature: logout feature
  User story:
  The user can not go to the home page again by clicking the step back button after successfully logging out.

 Scenario Outline: clicking the step back button after successfully logging out.

   When user, enters the username "<username>"
   And user, enters the password "<password>"
   And user, clicks login button.
   And user, is on  title page
   And user, clicks Logout Dropdown menu
   And user, clicks Logout button in the Dropdown menu
   And user, sees Login Page
   And user clicks the stepback button
   Then User should be able to see login page

   Examples: search values will be as below listed

     | username       |  password              |
     |  user1         | UserUser123            |
     | storemanager91 | UserUser123            |
     |salesmanager114 | UserUser123            |