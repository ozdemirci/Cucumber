@US17 @SmokeTests
Feature: US_017 Admin Test items(oge) Olusturur / Günceller / Sil yapar

  Background: Ortak islemler
    Given Kullanici https:"arananUrl" adresine gider
    And Kullanici Sign in butonuna tiklar.

  @US17_TC001
  Scenario: TC_001	Admin Test items(oge) Oluşturur / Günceller / Sil yapar
    And Admin olarak daha onceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanici admin olarak ogeler ve unvanlar sekmesini tiklar ve gelen siklardan test ogesini secer ve tiklar.
    And Admin Test items sayfasindan "Yeni bir Test ogesi oluşturu tiklar.
    When Admin yeni test ogeleri oluşturabilir oldugunu test eder.
    And Admin sayfayi kapatir

  @TC_002
  Scenario: TC_002 Admin Test items(oge) Oluşturur / Günceller / Sil yapar
    And Admin olarak daha onceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanici admin olarak ogeler ve unvanlar sekmesini tiklar ve gelen siklardan test ogesini secer ve tiklar.
    And Admin Test items sayfasindan "Yeni bir Test ogesi oluşturu tiklar.
    And Admin Yeni Test Öğeleri sayfasında İsim, Tanım, Fiyat, Varsayılan Min. Değer, Varsayılan Maks. Değer, Oluşturulma Tarihi gibi bilgileri girilebilir olduğunu test eder.
    And Admin sayfanın en altındaki Test ogeleri son sayfaya giderek girdiği bilgiler kontrol eder ve güncelleme butonuyla güncelleme yapar.
    And Admin sayfayi kapatir
  @TC_003
  Scenario: TC_003 Admin Test items(öğe) Oluşturur / Günceller / Sil yapar
    And Admin olarak daha onceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanici admin olarak ogeler ve unvanlar sekmesini tiklar ve gelen siklardan test ogesini secer ve tiklar.
    And Admin Test items sayfasindan "Yeni bir Test ogesi oluşturu tiklar.
    And Admin Yeni Test Öğeleri sayfasında İsim, Tanım, Fiyat, Varsayılan Min. Değer, Varsayılan Maks. Değer, Oluşturulma Tarihi gibi bilgileri girilebilir olduğunu test eder.
    And Admin sayfayi kapatir
  @TC_004
  Scenario: TC_004 Admin Test items(oge) Oluşturur / Günceller / Sil yapar
    And Admin olarak daha onceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanici admin olarak ogeler ve unvanlar sekmesini tiklar ve gelen siklardan test ogesini secer ve tiklar.
    And Admin Test items sayfasindan "Yeni bir Test ogesi oluşturu tiklar.
    And Admin Yeni Test Öğeleri sayfasında İsim, Tanım, Fiyat, Varsayılan Min. Değer, Varsayılan Maks. Değer, Oluşturulma Tarihi gibi bilgileri girilebilir olduğunu test eder.
    And Admin Test ogeleri son sayfaya giderek test öğelerini siler.
    And Admin sayfayi kapatir


