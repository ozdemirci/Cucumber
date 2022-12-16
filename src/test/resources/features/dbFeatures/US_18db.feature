@US_18db
Feature: US_18db Admin olarak doktor bilgilerini DB ile dogrular

  Scenario: Kullanici Admin olarak doktor bilgilerini DB ile Test eder.
    Given Kullanici database  baglanti kurar
    When  Kullanici doktor bilgilerini gorebilmek icin query olusturur
    Then Kullanici olusturulan doktor bilgileri tablosunu sutun isimlerine gore getirir
    And   Kullanıcı kayitli doktor bilgilerini dogrulama yapabilmek icin idlere gore kaydeder
    And   Kullanici kayitli doktorlari dogrular
    And Database kapatir


