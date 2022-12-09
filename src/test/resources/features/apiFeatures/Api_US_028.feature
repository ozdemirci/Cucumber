@US028_All
Feature: Admin olarak; Country oluşturma / Okuma ve Silme

  @US028_TC01_Api
  Scenario: Kullanici yeni bir ulke olusturmayı API ile dogrular
    Given Kullanici ulke icin baseUrl'den url getirir
    Then  Kullanici yeni bir ulke olusturulabildigini test etmek icin expected data olusturur
    And   Kullanici ulke icin  request gonderip response alir
    And   Kullanici Country post status kod 201 oldugunu dogrular
    And   Kullanici ulke icin actual datayi cagirir
    And   Kullanici ulke icin expected data ile actual datayi karsilastirarark dogrulama yapar

  @US028_TC02_Api
    Scenario: Kullanici ulkeye bagli bir sehir olusturmayı API ile dogrular
      Given Kullanici sehir icin baseUrl'den url getirir
      Then  Kullanici yeni bir sehir olusturulabildigini test etmek icin expected data olusturur
      And   Kullanici sehir icin request gonderip response alir
      And   Kullanici sehir post status kod 201 oldugunu dogrular
      And   Kullanici sehir icin actual datayi cagirir
      And   Kullanici sehir icin expected data ile actual datayi karsilastirarark dogrulama yapar

  @US_028_TC03_Api
  Scenario: Kullanici olusturulan ulkeleri guncellemeyi API ile dogrulamalidir
    Given   Kullanici ulke icin baseUrl'den url getirir
    Then    Kullanici olusturulan ulkenin guncellenebildigini test etmek icin expected data olusturur
    And     Kullanici guncellenecek ulke icin put request gonderip response alir
    And     Kullanici guncellenen Country post status kod 200 oldugunu dogrular
    And     Kullanici guncellenen ulke icin actual datayi cagirir
    And     Kullanici guncellenen ulke icin expected data ile actual datayi karsilastirarark dogrulama yapar




