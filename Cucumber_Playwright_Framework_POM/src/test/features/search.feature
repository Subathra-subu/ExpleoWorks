@smoke
Feature: Search Test

    Background:
        Given Launch the TutorialNinja application

    Scenario: Valid Search
        When User searches for a product from csv file using searchbox and searchbutton
        Then all displayed products should contain the searched keyword