@activities
Feature: Create calender event
  As user, I want to be able to create calendar events.
  Scenario: Create calendar event as sales manager
    Given  user is on the login page
    When user logs in as a sales manager
    And user navigates to "Activities" and "Calendar Events"
    Then user clicks on create calendar event button
    And user enters "Sprint Retrospective" as a title
    And user enters "On this meeting we discuss what went well" as a description
    Then user click on save and close button

