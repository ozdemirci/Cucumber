 @US013
Feature: US013 Physician (Doktor) "Test Results" işlemleri yapabilmeli



  @US013_TC01
  Scenario:"Test sonuçları talep edildikten ve Staff test sonuçlarını güncelledikten sonra
doktor ""id, name(Urea, Sodium, Glucose etc..), default max value, default min value,
test, description and the date"" bilgilerini görebilmelidir."
    Given Doktor Medunna url`sine gider
    When  Doktor profil simgesine tiklar
    Then  Doktor Sign in sekmesine tiklar
    And   Doktor username ve password girer.
    And   Doktor Sign in butonuna tiklar
    And   Doktor My Pages butonuna tiklar
    And   Doktor acilan dropdownda My Appointments butonuna tiklar
    And   Doktor acilan sayfada edit butonuna tiklar
    Then  Doktor Show Test Result sekmsine tiklar
    And   Doktor Appointment kisminda hasta id`sinden islem yapacagi hastayi bulur ve sag taraftaki View Result butonuna tiklar
    And   Doktor "id, name(Urea, Sodium, Glucose etc..),default max value, default min value,test, description and the date" bilgilerini gorebildigini dogrular
    And   Sayfa kapatilir


   @US013_TC02
   Scenario: TC02 Doktor "Request Impatient" isteğinde bulunabilmelidir
     Given Doktor Medunna url`sine gider
     When  Doktor profil simgesine tiklar
     Then  Doktor Sign in sekmesine tiklar
     And   Doktor username ve password girer.
     And   Doktor Sign in butonuna tiklar
     And   Doktor My Pages butonuna tiklar
     And   Doktor acilan dropdownda My Appointments butonuna tiklar
     And   Doktor acilan sayfada edit butonuna tiklar
     And   Doktor acilan sayfadan Request Impatient butonunun aktif oldugunu dogrular
     And   Sayfa kapatilir
