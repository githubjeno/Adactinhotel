Feature: Booking hotel and validate the booking no 

Scenario: user login into his accout with valid username and pasword 

	Given when user launches the url 
	When user enters the valid username  and valid password
    And  clicks on login button

Scenario: Search for the required hote and select the required room with your requirements
    When user selects his location
    And selects the hotel
    And selects the room type
    And selects the required no of rooms
    And selects his required checkin date
    And selects his checkout date
    And selects the no of adults per room
    And selects the no of children per room
    And clicks on search button
    Then user is navigated to select hotel page
 
Scenario: user selects the hotel confirming the pricing details 
 When user selects hotel and clicks on continue button
 
 Scenario: user enters the booking details and payment details
 When user enters his first name and enters his lastname
 And enters his billing address
 And enters his creadit card no
 And selects credit card type
 And selects the expiry date of credit card
 And enters his cvv no
 And clicks book now
 Then the full details of roder is displayed user saves his order no for future reference
 
 