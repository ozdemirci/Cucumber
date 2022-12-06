
Feature:  Kullanici tarafından ulke olusturma,guncelleme,okuma ve silme

  Scenario: Kullanici, ulkeye göre ilgili eyaletler veya sehirler olusturabilmeyi DB ile dogrulamalidir

    Given Kullanici database ile baglanti kurar
    When  Kullanici kayitli sehirler listesini gormek icin query olusturur
    Then  Kullanici kayitli ulkeler listesini gormek icin query olusturur
    And   Kullanici ulkeye bagli sehirler listesini gormek icin query olusturur
    And   Kullanici olusturulan ulkeleri ulke ID no'ya gore getirir
    And   Kullanici dogrulama yapabilmek icin ulke isimlerini kaydeder
    And   Kullanici Ulke ID'ye gore dogrulama yapar
    And   Kullanici dogrulama yapabilmek icin bir ülke id'sine baglı sehir isimlerini kaydeder
    And   Kullanici sehir isimlerini dogrular

