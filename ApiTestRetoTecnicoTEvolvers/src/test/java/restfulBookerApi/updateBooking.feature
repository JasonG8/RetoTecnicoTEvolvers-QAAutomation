Feature: Update User Booker API

  Scenario: Update Booking
    * call read('createBooking.feature@getId')
    * call read('token.feature@getToken')
    Given url 'https://restful-booker.herokuapp.com/booking/' + Id
    And header Content-Type = 'application/json'
    And header Accept = 'application/json'
    And header Cookie = "token=" + token
    * def body = read('/jsons/updateBooking.json')
    When request body
    And method PUT
    Then  status 200




