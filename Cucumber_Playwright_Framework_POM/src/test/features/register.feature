@regression
Feature: Registration tests

    Background: 
        Given Launch the TutorialNinja application
        When the user click Register link

    Scenario: Valid registration
        And the user enters the required details
        |firstname|lastname|email|telephone|password|confirm|
        |shamdoe|Davis|dynamic|9087654321|12345|12345|
        And the user click the privacy policy
        When the user click continue button
        Then the user should able register successfully
    
    Scenario: Invalid registration with Existing username
        And the user enters the required details
        |firstname|lastname|email|telephone|password|confirm|
        |John|Doe|doedavis@yahoo.com|9087654321|12345|12345|
        And the user click the privacy policy
        When the user click continue button
        Then the user should able to see the error message


