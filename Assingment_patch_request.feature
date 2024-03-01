Feature: To verify patch request 

Background: 
* def requestBody =
"""
{

"firstname" : "James",
"lastname" : "Brown"

}

"""

Scenario: updates the partial recource on to the database
Given url 'https://restful-booker.herokuapp.com/booking/1'
And request requestBody
When method put
Then status 200
* def  responseBody  = response
* print responseBody 