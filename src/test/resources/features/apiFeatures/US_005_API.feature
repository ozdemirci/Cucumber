Feature: US_005  Hastalar (patients), hastaneden randevu (appointment) olusturabilmelidir.
  @API
  Scenario: TC_007 API Test - Kayitli hasta olarak alinan randevuyu dogrulayin

    Given User generates token with admin account
    When User prepares expected data to verify
    Then User send get request for appointment and get response
    And User deserializes the appointment data to java
    And User verifies the response with the expected data