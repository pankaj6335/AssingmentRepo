Feature: To validate the quiry parameter

Scenario: 


* def query ={page :2}
Given url ' https://reqres.in/api/users'
And params query
When method Get
Then status 200
* def jsonResponse = response
* print jsonResponse
