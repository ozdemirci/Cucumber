@US014
Feature:Physician (Doctor) "Edit Inpatient" (Yatılı Tedavi) işlemleri yapabilmeli
  (My Appointments / View / Edit Inpatients)


  @US014_TC01
  Scenario: US014_TC01 Doktor "ID, start and end dates, description, created date
  appointment id, status, room and patient" bilgilerini görüntülüyebilmelidir

    Given Doktor Medunna url`sine gider
    When  Doktor profil simgesine tiklar
    Then  Doktor Sign in sekmesine tiklar
    And   Doktor username ve password girer.
    And   Doktor Sign in butonuna tiklar
    And   Doktor My Pages butonuna tiklar
    And   Doktor acilan dropdownda my inpatients butonuna tiklar
    And   Doktor acilan sayfada edit butonuna tiklar
    And   Doktor "ID, start and end dates, description, created date appointment id, status, room and patient"" bilgilerini goruntuleyebildigini dogrular
    And   Sayfa kapatilir

  @US014_TC03
  Scenario: US014_TC03 "Status" doktor tarafından"CANCELLED" olarak güncellenebilmelidir
    Given Doktor Medunna url`sine gider
    When  Doktor profil simgesine tiklar
    Then  Doktor Sign in sekmesine tiklar
    And   Doktor username ve password girer.
    And   Doktor Sign in butonuna tiklar
    And   Doktor My Pages butonuna tiklar
    And   Doktor acilan dropdownda my inpatients butonuna tiklar
    And   Doktor acilan sayfada edit butonuna tiklar
    And   Doktor acilan sayfada status butonuna tiklar ve hastanin durumunu CANCELLED olarak guncelleyebilir.
    And   Doktor Save butonuna tiklar
    And   Sayfa kapatilir