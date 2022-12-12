@US_16_DB
Feature: Oda bilgilerini DB ile dogrulama

  Scenario: Oda bilgilerini DB ile dogrulama
    Given Admin medunna database baglanir
    When Admin databseden ID si belirtilen odayi cagirir <query>
    Then Admin expectedData larini olusturur
    Then Admin databaseden gelen oda bilgilerini dogrular
    And Admin databse ile baglantısını kapatır



