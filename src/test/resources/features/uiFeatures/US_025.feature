@US25
Feature: US_25 My Appointments by Patient in the account
  Background: Ortak Step
    Given Kullanici <sumeyyeUrl> sayfasina gider



  @US25_TC01
  Scenario: TC01 Hasta portallerini kullanarak yeni bir randevu alabilir.

    Given Hasta <sumeyyeUrl> sayfasina gider.
    When Hasta sign in butonuna tiklar.
    And Hasta patient sign in butonuna tiklar.
    And Hasta gecerli bir username girer.
    And Hasta gecerli bir password girer.
    When Hasta ikinci sign in butonuna tiklar.
    When Hasta MY PAGES(PATIENT) butonuna tiklar.
    When Hasta Make an Appointment butonuna tiklar
    Then Hasta Phone butonunun gorunur oldugunu test eder
    And Hasta gecerli bir telefon numarasi girer
    Then Hasta Send an Appointment Request butonunun gorunur oldugunu test eder
    When Hasta Send an Appointment Request butonuna tiklar
    Then Hasta ekranda 'Appointment registration saved! We will call you as soon as possible.'yazisini gorerek randevu alindigini dogrular





  @US25_TC02
  Scenario: TC02 Kullanicinin herhangi bir karakter iceren First Name yazmasi gerekir ve bos birakilamaz.

    Given Kullanici <sumeyyeUrl> sayfasina gider
    When Kullanici Make an Appointment butonuna tiklar
    When Kullanici First Name butonuna tiklar
    When Kullanici SSN butonuna tiklar
    Then Kullanici First Name butonu altinda 'Your FirstName is required.' yazisinin goruntulendigini dogrular
    And Kullanici gecerli first name girer




  @US25_TC03
  Scenario: TC03 Kullanici SSN numarasi girmeli (kayitli SSN) bos birakilamaz.

  Given Kullanici Url'e gider
  When Kullanici Make An Appointment butonuna tiklar
  And Kullanici Gecerli bir first name girer
  When Kullanici SSN Butonuna tiklar.
  When Kullanici Last name butonuna tiklar
  Then Kullanici SSN Butonu altinda 'Your SSN is required.' yazisinin goruntulendigini dogrular
  And Kullanici Gecerli bir SSN girer



  @US25_TC04
  Scenario: Kullanici, herhangi bir karakter iceren Last Name yazmasi gerekir, bos birakilamaz.

    Given Kullanici <sumeyyeUrl> 'e gider.
    Then Kullanici anasayfada make AN appointment butonunun gorunur oldugunu test eder
    When Kullanici make AN appointment butonuna tiklar
    And kullanici gecerli bir first name girer
    And kullanici gecerli  SSN girer
    When Kullanici last Name butonuna tiklar
    When Kullanici Phone butonuna tiklar
    Then Kullanici Last Name butonu altinda 'Your LastName is required.' yazisinin goruntulendigini dogrular
    And Kullanici gecerli bir Last Name girer


  @US25_TC05
  Scenario: Kullanici gecerli bir phone girmeli

    Given Kullanici <sumeyyeUrl> 'e gider
    And Kullanici gecerli bir firstname girer
    And Kullanici gecerli Bir SSN girer
    And Kullanici gecerli Bir last name girer
    Then Kullanici Phone butonunun gorunur oldugunu test eder.
    And Kullanici gecerli bir telefon numarasi girer


  @US25_TC06
  Scenario: Kullanici randevu alip kaydolduunda, profillerini gorebilir ve uygulamada oturum acabilir.


    Given K ullanici <sumeyyeUrl> 'e gider
    And K ullanici gecerli bir first name girer
    And K ullanici gecerli bir SSN girer
    And K ullanici gecerli bir last name girer
    And K ullanici gecerli bir Email girer
    And K ullanici gecerli bir Phone girer
    And K ullanici Appointment DateTime butonuna tiklar
    And K ullanici gecerli bir tarih girer
    And K ullanici Send an Appointment Request butonunun gorunur oldugunu test eder
    And K ullanici Send an Appointment Request butonuna tiklar
    And K ullanici ekranda 'Appointment registration saved! We will call you as soon as possible.' yazisini gorerek randevu alindigini dogrular




  @US25_TC07
  Scenario: Kullanici randevu alip kaydoldugunda, profillerini gorebilir ve uygulamada oturum acabilir.

    Given Kulllanici <sumeyyeUrl> 'e Gider
    Then Kullanici ilk sign in butonunun gorunur oldugunu test eder
    When Kullanici sign in butonuna tiklar
    Then Kullanici username butonunun gorunur oldugunu oldugunu test eder
    And Kullanici gecerli bir username girer
    When Kullanici password butonunun gorunur oldugunu oldugunu test eder
    And Kullanici gecerli bir password girer
    Then Kullanici ikinci sign in butonun gorunur oldugunu test eder
    When Kullanici ikinci sign in butonuna tiklar
    Then Kullanici MY PAGES(PATIENT) butonunun gorunur oldugunu test eder
    When Kullanici MY PAGES(PATIENT) butonuna tiklar
    Then Kullanici My Appointments butonunun gorunur oldugunu test eder
    When Kullanici My Appointments butonuna tiklar
    Then Kullanici randevunun gorundugunu dogrular



  @US25_TC08
  Scenario: Kullanici gecerli tarih girmelidir. (guncel tarih secebilmelidir)

  Given Hasta <sumeyyeUrl> 'e gider
  Then Hasta MY PAGES(PATIENT) butonunun gorunur oldugunu test eder
  When H asta MY PAGES(PATIENT) butonuna tiklar
  When H asta Make an Appointment butonuna tiklar
  Then H asta Phone butonunun gorunur oldugunu test eder
  And H asta gecerli bir telefon numarasi girer
  Then H asta Appointment DateTime butonunun gorunur oldugunu test eder
  When H asta Appointment DateTime butonuna tiklar
  And H asta guncel bir tarih girer
  Then H asta Send an Appointment Request butonunun gorunur oldugunu test eder
  When H asta Send an Appointment Request butonuna tiklar
  Then Hasta ekranda 'Appointment registration saved! We will call you as soon as possible.' yazisini gorerek randevu alindigini dogrular


  @US25_TC09
  Scenario: Kullanici gecerli tarih girmelidir. (gelecek tarih secebilmelidir)

    When Hasta MY PAGES(PATIENT) butonuna tiklar
    When Hasta Make an Appointment butonuna tiklar
    And Hasta gecerli bir telefon numarasi girer
    When Hasta Appointment DateTime butonuna tiklar
    And Hasta gelecekteki bir tarih girer
    When Hasta Send an Appointment Request butonuna tiklar
    Then Hasta ekranda 'Appointment registration saved! We will call you as soon as possible.' yazisini görerek randevu alindigini dogrular


@US25_TC10
Scenario: Tarih sirasi gun/ay/yil (ay/gun/yil) seklinde olmalidir.

  When Hasta my PAGES(PATIENT) butonuna tiklar
  When Hasta make an Appointment butonuna tiklar
  And Hasta gecerli bir Telefon numarasi girer
  When Hasta Appointment dateTime butonuna tiklar
  And Hasta Appointment DateTime'a tarihi istenilen sekilde yazar
  Then Hasta Send an appointment Request butonunun gorunur oldugunu test eder
  When Hasta Send an appointment Request butonuna tiklar.
  Then Hasta Ekranda 'Appointment registration saved! We will call you as soon as possible.' yazisini görerek randevu alindigini dogrular




