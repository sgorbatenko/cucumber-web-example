@login
Feature: User registration
  In order to use advanced features of  Mercury Tours app, 
  As a user
  I want to register an account


Scenario: Successfull user registration
    Given I am on Registration page
    When I submit valid register information 
    Then I should see the message that user successfully registered 
    And notification email is sent to the user

Scenario: User registration with the name that already exists
    Given I am on Registration page
    When I submit valid register information with username that already exists
    Then I should see error message "user with the name already exists" 

Scenario Outline: User registration without mandatory fields
    Given I am on Registration page
    When I submit <username> username, <password> password, <confirmed> confirmed password 
    Then I see error message "Please fill in mandatory fields"
Examples:
  | username      | password     | confirmed |
  | valid         | empty        | empty     |
  | empty         | valid        | valid     |
  | empty         | empty        | empty     |
  
Scenario Outline: Confirmed password is not equal to the password
    Given I am on Registration page
    When I submit <username> username, <password> password, <confirmed> confirmed password 
    Then I see error message "Confirmed password is not equal to the password"
Examples:
  | username      | password     | confirmed |
  | valid         | valid        | invalid   |
  | valid         | valid        | empty     |
    
  