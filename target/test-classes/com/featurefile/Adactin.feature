

Feature: Adactin Hotel Booking
  
#Scenario: Adactin Hotel Login Page
#Given to Launch The Website Url
#When to Enter The Username
#When to Enter The Password
#Then Click Login Button

Scenario Outline: Login Functionality
Given to Launch the Website Url
Given to enter the "<Username>" in Username Field
And to enter the "<Password>" in Password Field
Then click login Button

Examples:
|Username  |   Password   |
|Christina |    ecechris@ |
|Joys      |     Joys123  |
|minipriya |     mini09   |
    
Scenario: Searching Hotel
Given to select Location
And to select Hotels
And to select Room Type
And to select Number of Rooms
And to select Check In Date
And to select Check Out Date
And to select Adults per Room
And to select Children per Room
Then Click search Button
