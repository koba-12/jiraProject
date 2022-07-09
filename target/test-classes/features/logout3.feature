Feature: logout feature
  User story:
  The user must be logged out if the user close the open tab (all tabs if there are multiple open app tabs)

Scenario: close all tabs

  When user close the all tabs
  And user go to xfleet
  Then user should be on the login page
