#Author-Anilkumar
@Regression
Feature: Get Booking IDs
  Scenario: Getting all the Booking IDs without filtering

    Given user sends the get request to "booking"
    When user gets the status code 200
    Then user verify the respond body contains "bookingid"
    Then user verify the valid booking "SingleId"


