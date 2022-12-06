Feature: Admin olarak; Country oluşturma / Okuma ve Silme

  Scenario: Kullanici yeni bir ulke olusturmayı API ile dogrular
    Given Kullanici ulke icin baseUrl'den url getirir
    Then  Kullanici yeni bir ulke olusturulabildigini test etmek icin expected data olusturur
    And   Kullanici ulke icin  request gonderip response alir
    And   Kullanici ulke icin actual datayı cagirir
    And   Kullanici ulke icin expected data ile actual data yı karsilastirarark dogrulama yapar

    Scenario: Kullanici ulkeye bagli bir sehir olusturmayı API ile dogrular
      Given Kullanici sehir icin baseUrl'den url getirir
      Then  Kullanici yeni bir sehir olusturulabildigini test etmek icin expected data olusturur
      And   Kullanici sehir icin request gonderip response alir
      And   Kullanici sehir icin actual datayı cagirir
      And   Kullanici sehir icin expected data ile actual data yı karsilastirarark dogrulama yapar





