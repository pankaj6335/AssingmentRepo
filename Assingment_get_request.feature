Feature: To verify get request

Scenario: get the user details from server
Given url 'https://restful-booker.herokuapp.com/booking'
When method get 
Then status 200
* def responseBody = response
* print response






