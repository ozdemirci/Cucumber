@US_004
Feature: US - 04   Giriş sayfası yalnızca geçerli kimlik bilgileriyle erişilebilir olmalıdır.

  Background: Ortak adimlar
    Given Belirtilen url gidilir
    When Ana sayfanın göründüğü doğrulanır
    Then Kullanici 3 saniye bekler
    And Sign In butonuna tiklanir

    @US_004_TC_01
  Scenario: TC - 01   Giris yapmak icin basari mesajini dogrulayan, gecerli bir kullanici adi ve sifre olmali


    When Username ve password girisi yapmak için textbox'larin acildigi dogrulanir
    Then Acilan pencerede ilgili kisimlara gecerli e-mail ve sifre girildikten sonra Sign In butonuna tiklanir
    And Basariyla giris yapildigi mesaji gorulur
    And Sayfa kapatilir.


  @US_004_TC_02
  Scenario: TC - 02   Gecersiz kullanici adi ve sifre ile giris yapilamadigi ve hata mesaji alindigi dogrulanir


    When Username ve password girisi yapmak için textbox'larin acildigi dogrulanir
    Then Acilan pencerede ilgili kisimlara gecersiz e-mail ve sifre girildikten sonra Sign In butonuna tiklanir
    And Kullanici 3 saniye bekler
    And Giris yapilamadigi mesaji gorulur
    And Sayfa kapatilir.

  @US_004_TC_03
  Scenario: TC - 03   Kullanicinin mevcut kimlik bilgilerini her zaman kullanabilcegi, "Remember Me" secenegi olmalidir


    When Kullanici 3 saniye bekler
    When Remember Me seceneginin gorunur oldugu dogrulanir
    Then Remember Me seceneginin kullanilabilir oldugu dogrulanir
    And Kullanici 3 saniye bekler
    And Sayfa kapatilir.

  @US_004_TC_04
  Scenario: TC - 04    Eger sifre unutulursa diye "Did you forget your password?" secenegi olmalidir.


    When Kullanici 3 saniye bekler
    When Did you forget your password? seceneginin gorunur oldugu dogrulanir
    Then Kullanici 3 saniye bekler
    Then Did you forget your password? seceneginin kullanilabilir oldugu dogrulanir
    And Kullanici 3 saniye bekler
    And Secenege tiklandiktan sonra Reset Your Password sayfasina gidildigi dogrulanir
    And Sayfa kapatilir.

  @US_004_TC_05
  Scenario: TC - 05   "You don't have an account yet? Register a new account" secenegi olmalidir


    When Kullanici 3 saniye bekler
    When You don't have an account yet? Register a new account secenegi gorunur olmalidir
    Then Kullanici 3 saniye bekler
    Then You don't have an account yet? Register a new account secenegi kullanilabilir olmalidir
    And Kullanici 3 saniye bekler
    And Secenege tikladiktan sonra kayit sayfasina yonlendirdigi dogrulanir
    And Sayfa kapatilir.


  @US_004_TC_06
  Scenario: TC - 06    "Cancel" secenegi olmalidir


    When Kullanici 3 saniye bekler
    When Sign In butonunun yanindaki Cancel butonunun gorunur oldugu test edilir
    Then Kullanici 3 saniye bekler
    Then Cancel butonunun kullanilabilir oldugu test edilir
    And Kullanici 3 saniye bekler
    And Cancel butonuna tikladiktan sonra ana sayfaya donuldugu dogrulanir
    And Sayfa kapatilir.