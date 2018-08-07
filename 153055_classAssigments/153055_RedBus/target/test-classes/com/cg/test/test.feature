Feature: Bus Booking
Scenario: Book a ticket
Given I am on Redbus login Page
And I enter source address as Pune
And then I enter destination address as Bangalore
And I click on search
And I click on view seats
And I enter name as Shraddha
And I enter age 22
And enter gender
And entering email as skapse@gmail.com
And phone number as 9860586605
When I submit form
Then I get forwaded to next page