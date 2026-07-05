@regression
Feature: Login tests

    Background:
        Given Launch the application
        And User clicks on the login link

    Scenario Outline: Valid Login
        And User enter the email as "<email>"
        And User enter the password as "<password>"
        When the user click login button
        Then the login should be successful

        Examples:
        | email                   | password    |
        | doedavis@yahoo.com      | 12345       |

    Scenario: Invalid Login
        And User enter invalid credentials from json file
        When the user click login button
        Then the login should fail