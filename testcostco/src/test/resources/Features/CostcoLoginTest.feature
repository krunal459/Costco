Feature: Login to www.costco.com

Scenario: Successful login
    Given browser is open
    Given User is on costco.com  page
    Given I am on the Costco login page
    When I enter my username and password
    When I click the Sign In
    Then I should be logged in successfully