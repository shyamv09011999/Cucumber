Feature: Hotel Booking In The Adactin Application


Scenario: User Login In The Web Application
Given user Launch The Web Application
When user Enter The Username In The Username Field
And user Enter The Password Inth Password Field
Then user Click The Login Button And Its Navigate To Search Hotel Page


Scenario: User Search The Hotel And Check The Availability
When user Select The Location In The Location Field
And user Select The Hotel In The Hotel Field
And user Select The Room type In The Room Type Field
And user Select The No.Of Rooms Required In The Number Of Rooms Field
And user Enter The Date To Check-In Into The Hotel In The Check In Date Field
And user Enter The Date To Check-Out From The Hotel In The Check Out Date field
And user Select The Required Adults Room In The Adults Per Room Field
And user elect The Required Children Room In The Children Per Room Field
Then user Click The Reset Button If User Need To Change The Requirements In The Field Orelse User Click The Search Button And Its Navigate To Select Hotel Page 


Scenario: User Check The Details And Price 
When user Check The Entered Details Are Correct
And Click On The Icon Radio Button In The Select Column
Then User Click The Continue Button And Its Navigate To Book A Hotel Page

Scenario: User Enter The Account Details To Book A Hotel
When user Check The Entered Hotel Details And Final Bill Amount
And user Enter The First Name In The First Name Field
And user Enter The Last Name In The Last Name Field
And user Enter The Address In The Billing Address Field
And user Enter The Credit Card Number In The Credit Card No Field
And user Select The Type Of Card In The Credit Card Type Field
And user Select Expiry Date Of Card By Mentioning The Month And Year In The Expiry Date Field
And user Enter CVV Number Of Card In The CVV Number Field
And user Click The Book Now Button And Its Navigates To Booking Coonfirmation Page


Scenario: User Logout From The Web Application
When user Check Final Booking Confirmed Details
And user Logout From The Adactin Hotel Application By Clicking Logout Button Orelse User Click Book Itinery Button And Its Navigates To Book Itinery Page

Scenario:User Cancel The Booking Order And Logout
When user Search The Order Id
And Select The Order Icon Button
And user Cancel The Booked Order By clicking The Cancel Booked Button
And user Click The Logout Button To Logout From The Application  
   
    
cucumber scenario.txt
Displaying cucumber scenario.txt.
 