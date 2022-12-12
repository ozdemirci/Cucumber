Feature: US_005  Hastalar (patients), hastaneden randevu (Appointment) olusturabilmelidir.
  @DB
  Scenario: TC_008 DB Test - Kayitli hasta olarak alinan randevuyu dogrulayin
    Given User connects to the database
    Then User gets appointments data from DB
    And User validates appointment using id with DB
    And User closes to database connection