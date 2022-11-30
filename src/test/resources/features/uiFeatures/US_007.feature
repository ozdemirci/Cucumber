@US007
Feature: Hastalar randevu tarihi oluşturabilmeli


  @US007_TC01
  Scenario: US007_TC01 Kullanıcı guncel tarih girebilmeli
    Given Hasta Medunna  sayfa url`sine gider
    When  Hasta profil simgesine tiklar
    Then  Hasta sign in sekmesine tiklar
    And   Hasta gecerli bir username ve password girer
    And   Hasta sign in butonuna tiklar
    And   Hasta My Pages butonuna tiklar
    Then  Hasta acilan dropdownda Make an Appoitment butonuna tiklar
    And   Hasta acilan sayfada; First Name, SSN, Email, Phone textboxlarini doldurur
    And   Hasta Send an Appointment Request butonunu tiklar
    And   Hasta Appointment registration saved yazisini gorur ve randevu olusturdugunu dogrular
    And   Sayfa kapatilir

  @US007_TC02
  Scenario: US007_TC02 TKullanıcı geçerli tarih girmeli
    Given Hasta Medunna  sayfa url`sine gider
    When  Hasta profil simgesine tiklar
    Then  Hasta sign in sekmesine tiklar
    And   Hasta gecerli bir username ve password girer
    And   Hasta sign in butonuna tiklar
    And   Hasta My Pages butonuna tiklar
    Then  Hasta acilan dropdownda Make an Appoitment butonuna tiklar
    And   Hasta acilan sayfada; First Name, SSN, Email, Phone textboxlarini doldurur
    Then  Hasta Appointment DateTime kismina gelecekteki bir tarihi girer
    And   Hasta Send an Appointment Request butonunu tiklar
    And   Hasta Appointment registration saved yazisini gorur ve randevu olusturdugunu dogrular
    And   Sayfa kapatilir

  @US007_TC03
  Scenario: US007_TC03  Kullanıcı gecersiz tarih girememeli
    Given Hasta Medunna  sayfa url`sine gider
    When  Hasta profil simgesine tiklar
    Then  Hasta sign in sekmesine tiklar
    And   Hasta gecerli bir username ve password girer
    And   Hasta sign in butonuna tiklar
    And   Hasta My Pages butonuna tiklar
    Then  Hasta acilan dropdownda Make an Appoitment butonuna tiklar
    And   Hasta acilan sayfada; First Name, SSN, Email, Phone textboxlarini doldurur
    And   Hasta Appointment DateTime kismina gecmis bir tarihi girer
    And   Hasta Appointment date can not be past date yazisini goruntuler
    And   Sayfa kapatilir

  @US007_TC04
  Scenario: US007_TC04 Tarih sırası gün/ay/yıl (ay/gün/yıl) şeklinde olmalıdır
    Given Hasta Medunna  sayfa url`sine gider
    When  Hasta profil simgesine tiklar
    Then  Hasta sign in sekmesine tiklar
    And   Hasta gecerli bir username ve password girer
    And   Hasta sign in butonuna tiklar
    And   Hasta My Pages butonuna tiklar
    Then  Hasta acilan dropdownda Make an Appoitment butonuna tiklar
    And   Hasta acilan sayfada; First Name, SSN, Email, Phone textboxlarini doldurur
    And   Hasta Appointment DateTime kismina tarihi gun,ay,yil seklinde yazar
    And   Hasta Appointment registration saved yazisini gorur ve randevu olusturdugunu dogrular
    And   Sayfa kapatilir
