Feature:
  Test Time Camp functions by testing the API



  @Employee
  Scenario:Client call to GET /user data
    Given The Authentication oauth apiKey
    Then I verify the response status
    And I verify the body response

#  @Employee
#  Scenario:Test POST Request
#    Given
#    When I click on about Blue365
#    And I click on how Blue365 works
#    Then I verify How it Works

