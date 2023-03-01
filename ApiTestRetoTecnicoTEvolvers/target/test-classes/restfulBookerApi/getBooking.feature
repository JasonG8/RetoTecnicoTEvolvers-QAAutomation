Feature: Get  User ID Booker API

  Scenario: Get Booking
    * call read('createBooking.feature@getId')
    Given url 'https://restful-booker.herokuapp.com/booking/' + Id
    * header Accept = 'application/json'
    When method GET
    Then  status 200

