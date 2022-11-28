@US10
Feature: US_010 Doktor randevulari
  Background: Ortak alan
    Given doktor medunna ana sayfasina gider
    When doktor signin sekmesine tiklar
    And doktor gecerli username girer
    And doktor gecerli password girer
    And doktor signin butonuna tiklar
    When doktor my pages sekmesine tiklar
    And doktor my appointments sekmesine tiklar

  @US010_TC01
  Scenario: TC01  Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.

    Then doktor randevularının görunur oldugunu dogrular
    And doktor sayfayi kapatir

  @US010_TC02
    Scenario: TC02 Doktor randevu listesinde "patient id, start date, end date, status" bilgilerini görebilmeli

    Then doktor randevularina ait "patient id" gorunur oldugunu dogrular
    And doktor randevularina ait "start date" gorunur oldugunu dogrular
    And doktor randevularina ait "end date" gorunur oldugunu dogrular
    And doktor randevularina ait "status" gorunur oldugunu dogrular
    And doktor sayfayi kapatir



