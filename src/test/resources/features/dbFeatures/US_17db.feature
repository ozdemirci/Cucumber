@US_17db
Feature: US_17db Admin Test items(öğe) Api ile Test eder

  Scenario: Kullanici Admin olarak Test items(öğe) DB ile Test eder
    Given Kullanici database ie baglanti kurar
    When  Kullanici Test items(öğe) bilgilerini gorebilmek icin query olusturur
    Then Kullanici olusturulan Test items(öğe) bilgileri tablosunu sutun isimlerine gore getirir
    And   Kullanıcı kayitli Test items(öğe) bilgilerini dogrulama yapabilmek icin idlere gore kaydeder
    And   Kullanici kayitli Test items(öğe) dogrular
    And Database kapatir

