@US_006
Feature: Kullanıcı bilgisi sekmesi (Setting) Ana Sayfada düzenlenebilir olmalıdır.

  Background: Ortak Adimlar
    Given Belirtilen URL'e gidilir
    When Ana sayfanın göründüğü doğrulanir
    Then Sing In butonuna tiklanir
    And Acilan pencerede ilgili kisimlara geçerli e-mail ve şifre girildikten sonra Sign In butonuna tiklanir
    And Kullanicinin giris yaptigi dogrulanir
    And Settings secenegine tiklanir

    @US_006_TC_01
  Scenario: TC - 01   Kullanici bilgilerinden "firstname" girerken doldurulan kullanici bilgileri olmalidir.
    When First Name in girerken kullanilan first name bilgisi oldugu dogrulanir
    Then Sayfa kapatilir

  @US_006_TC_02
  Scenario: TC - 02  Kullanici bilgilerinden "lastname" girerken doldurulan kullanici bilgileri olmalidir.
    When Last Name in girerken kullanilan last name bilgisi oldugu dogrulanir
    Then Sayfa kapatilir

  @US_006_TC_03
  Scenario: TC - 03 Kullanici bilgilerinden "email" girerken doldurulan kullanici bilgileri olmalidir.
    When Email in girerken kullanilan email bilgisi oldugu dogrulanir
    Then Sayfa kapatilir

  @US_006_TC_04
  Scenario: TC - 04 "First Name" guncelleme secenegi olmalidir.
    When First Name kutucuguna tiklanir
    Then Belirtilen yeni first name yazilir
    And  First Name in guncellendigi dogrulanir
    And Sayfa kapatilir

  @US_006_TC_05
  Scenario: TC - 05 "Last Name" guncelleme secenegi olmalidir.
    When Last Name kutucuguna tiklanir
    Then Belirtilen yeni last name yazilir
    And Last Name in guncellendigi dogrulanir
    And Sayfa kapatilir

  @US_006_TC_06
  Scenario: TC - 06 "Email" guncelleme secenegi olmalidir.
    When Email kutucuguna tiklanir
    Then Belirtilen yeni email yazilir
    And Email in guncellendigi dogrulanir
    And Sayfa kapatilir





