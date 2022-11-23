@US12
Feature: US_012 Test içeriğinde "Glucose, Urea, Creatinine, Sodium
  Potassium, Total protein, Albumin, Hemoglobin" seçenekleri olmalıdır.

  Background: Ortak islemler
    Given doktor medunna ana sayfasina gider
    When doktor signin sekmesine tiklar
    And doktor gecerli username girer
    And doktor gecerli password girer
    And doktor signin butonuna tiklar
    When doktor my pages sekmesine tiklar
    And doktor my appointments sekmesine tiklar
    And doktor randevularinda Edit butonuna tiklar
    And doktor  "request a test"  butonuna tiklar

  @US12_TC01
  Scenario: TC01  Doktor, randevu listesinde "Request A Test"" işlemlerini yapabilmeli

    Then Doktor testlerin seçilebilir oldugunu dogrular
    And doktor sayfayi kapatir

  @US12_TC02
  Scenario: TC02  Doktor, "Glucose, Urea, Creatinine, Sodium
  Potassium, Total protein, Albumin, Hemoglobin" testlerini isteyebilmeli

    And doktor "Glucose, Urea, Creatinine, Sodium Potassium, Total protein, Albumin, Hemoglobin" testlerini ister
    Then testlerin istenildiğini dogrular
    And doktor sayfayi kapatir






