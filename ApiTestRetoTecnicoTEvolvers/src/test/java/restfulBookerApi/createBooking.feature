Feature: Create User Booker API

  @getId
  Scenario: Create Booking
    Given url 'https://restful-booker.herokuapp.com/booking'
    And header Content-Type = 'application/json'
    And  header Accept = 'application/json'
    When def body = read('/jsons/createBooking.json')
    And request body
    And method POST
    Then  status 200
    And def Id = $.bookingid
    And print Id