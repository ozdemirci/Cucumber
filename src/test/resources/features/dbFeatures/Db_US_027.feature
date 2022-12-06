@Db_US027
Feature: Mesajlar kullanici  tarafından DB ile dogrulanir

  Scenario: Kullanıcı mesajları DB ile dogrulamalidir

    Given Kullanici database ile baglanti kurar
    When  Kullanici kayitli mesajlari gorebilmek icin query olusturur
    Then  Kullanici olusturulan mesajları mesaj sutununa gore listeler
    And   Kullanıcı kayitli mesajları dogrulama yapabilmek icin kaydeder
    And   Kullanici kayitli mesajları dogrular