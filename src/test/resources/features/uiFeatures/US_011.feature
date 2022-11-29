@US11 @smoke
Feature: US_011 "My Appointments" Doktor  tarafından düzenlenebilmeli

  Background: Ortak islemler
    Given doktor medunna ana sayfasina gider
    When doktor signin sekmesine tiklar
    And doktor gecerli username girer
    And doktor gecerli password girer
    And doktor signin butonuna tiklar
    When doktor my pages sekmesine tiklar
    And doktor my appointments sekmesine tiklar
    And doktor randevularinda Edit butonuna tiklar

  @US11_TC01
  Scenario: TC01  Doktor, randevu listesinde "Create or edit an appointment" işlemlerini yapabilmeli

    And doktor anemnesis, treatment, diagnosis bolumlerini doldurur
    And doktor Save butonuna tiklar
    Then Doktor "The Appointment is updated" mesajini gorunur oldugunu dogrular
    And doktor sayfayi kapatir

  @US11_TC02
  Scenario: TC02  Bir randevu güncellendiğinde; kullanıcı (doktor), hastanın
  "id, start and end date, Status, physician and patient"" bilgilerini görebilmeli

    And doktor anemnesis, treatment, diagnosis bolumlerini doldurur
    And doktor Save butonuna tiklar
    Then doktor randevularina ait "Anamnesis" gorunur oldugunu dogrular
    Then doktor randevularina ait "Treatment" gorunur oldugunu dogrular
    Then doktor randevularina ait "Diagnosis " gorunur oldugunu dogrular
    And doktor sayfayi kapatir


  @US11_TC03
  Scenario: TC03  Doktor  "Anamnesis, Treatment ve Diagnosis" alanlarını doldurmak zorunda olmali

    And doktor anemnesis, treatment, diagnosis bolumlerini bos birakir
    And doktor Save butonuna tiklar
    Then Doktor "This field is required." mesajinin gorunur oldugunu dogrular
    And doktor sayfayi kapatir

  @US11_TC04
  Scenario: TC04  Doktor  "prescription ve description" alanlari isteğe bağlı olmali

    And doktor prescription ve description bolumleri haric bolumleri doldurur
    And doktor Save butonuna tiklar
    Then Doktor "The Appointment is updated" mesajini gorunur oldugunu dogrular
    And doktor sayfayi kapatir

  @US11_TC05
  Scenario: TC05  Doktor "Status" bolumunu "PENDING, COMPLETED veya CANCELLED" olarak secebilmeli

    And doktor status bolumunu "PENDING" olarak secer
    And doktor anemnesis, treatment, diagnosis bolumlerini doldurur
    And doktor Save butonuna tiklar
    Then Doktor "The Appointment is updated" mesajini gorunur oldugunu dogrular
    And doktor sayfayi kapatir


