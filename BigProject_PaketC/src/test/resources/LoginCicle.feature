@Login
Feature: Login
  As User, I want to login to cicle staging app

  Scenario: Normal Login By Google
    Given User open the cicle staging login page
    When User click login with google account
    Then User see list google account page
    And User

  Scenario: Invalid Login
    Given User open the sauce login page
    When User input "standard_user" as username and "password" as password
    Then User see error "Epic sadface: Username and password do not match any user in this service" on login page