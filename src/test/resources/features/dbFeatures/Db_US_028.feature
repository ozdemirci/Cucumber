
Feature:  Kullanici tarafından olusturulan ulke ve sehir dogrulama

@US028_DB_TC01
  Scenario: Kullanici, olusturulan ulkeleri DB ile dogrulamalidir

    Given Kullanici database ile baglanti kurar
    Then  Kullanici kayitli ulkeler listesini gormek icin query olusturur
    And   Kullanici olusturulan ulkeler tablosunun sutun basliklarini getirir
    And   Kullanici dogrulama yapabilmek icin ulkeleri idlere gore kaydeder
    And   Kullanici Ulke isimlerine gore dogrulama yapar

  @US028_DB_TC02
  Scenario: Kullanici,ulkelere bagli olusturulan sehirleri DB ile dogrulamalidir
    Given  Kullanici database ile baglanti kurar
    When   Kullanici kayitli sehirler listesini gormek icin query olusturur
    Then   Kullanici olusturulan sehirler tablosunun sutun basliklarini getirir
    And    Kullanici olusturulan sehirleri sehir id no'ya gore getirir
    And    Kullanici dogrulama yapabilmek sehirleri idlere gore kaydeder
    And    Kullanici sehir isimlerini dogrular

