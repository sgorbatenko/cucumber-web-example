@ignore
Feature: Signin
  In order to use advanced features of  Mercury Tours app, 
  As a user
  I want to sign in to the app with valid credentials

Scenario Outline: Sign-in with valid credentials
    Given I am on the Sign-in page
    When I submit <username> username and  <password> password 
    Then I should see Flight Finder page
Examples:
  | username      | password     | 
  | valid         | invalid      |
 
Scenario Outline: Login with invalid credentials
    Given I am on the Sign-in page  
    When I submit <username> username and  <password> password 
    Then I see error message "Bad credentials"
Examples:
  | username      | password     | 
  | valid         | invalid      |
  | valid         | empty        | 
  | empty         | valid        | 
  | empty         | empty        | 
