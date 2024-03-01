Feature: To verify post request


Background: 
*def requestBody =
"""
{
"username" : "admin",
"password" : "password123"
 
}

"""




Scenario: to create new recource on the server
Given url 'https://restful-booker.herokuapp.com/auth'
And request requestBody
When method post
Then status 200
* def responseBody = response
* print response






