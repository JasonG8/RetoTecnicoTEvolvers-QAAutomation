@token
  Feature: getToken

    @getToken
    Scenario: Obtener token de acceso
      * url 'https://restful-booker.herokuapp.com/auth'
      * header 'Content-Type' = 'application/json'
      * request {"username" : "admin","password" : "password123"}
      * method POST
      * status 200
      * match responseType == 'json'
      * def token = response.token
      * print token