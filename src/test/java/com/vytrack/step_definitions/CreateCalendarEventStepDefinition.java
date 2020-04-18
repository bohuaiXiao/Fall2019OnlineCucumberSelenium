package com.vytrack.step_definitions;

import com.vytrack.pages.activities.CalendarEventsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

/**
 * @author:
 * @create:
 * @date:
 */
public class CreateCalendarEventStepDefinition {
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();



    @Then("user clicks on create calendar event button")
    public void userClicksOnCreateCalendarEventButton() {
        System.out.println("User click on create calendar event button");
        calendarEventsPage.clickToCreateCalendarEvent();

    }

    @Then("user enters {string} as a description")
    public void userEntersAsADescription(String arg0) {
        System.out.println("User enters description : "+arg0);
        calendarEventsPage.enterCalendarEventDescription(arg0);
    }


    @Then("user enters {string} as a title")
    public void userEntersAsATitle(String arg0) {
        System.out.println("User enter title :"+arg0);
        calendarEventsPage.enterCalendarEventTitle(arg0);
    }

    @Then("user click on save and close button")
    public void userClickOnSaveAndCloseButton() {
        System.out.println("User click on save and close button");
        calendarEventsPage.clickOnSaveAndClose();
    }
}
