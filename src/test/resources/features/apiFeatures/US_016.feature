
Feature: Oda bilgilerini APİ ile okuma,olusturma,guncelleme,silme
  @US_016_Api
  Scenario: Test room APİ(Post)
    Given Admin oda olusturmak icin POST request gonderir
    When  Admin Status kodunu 200 oldugunu dogrular
    Then Admin gelen datalari alir ve dogrular
