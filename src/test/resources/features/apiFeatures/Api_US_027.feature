@US027_All
Feature: Messages by Admin Validate with API and DB
@US027_TC01
  Scenario: Kullanici, API kullanarak mesaj okumayi dogrulamalidir
    Given Kullanici mesajlari okumak icin baseUrl'den url getirir
    Then  Kullanici olusturulmus mesajlari test etmek icin expected data olusturur
    And   Kullanici mesajlar icin get request gonderip response alir
    And   Kullanici get status kod 200 oldugunu dogrular
    And   Kullanici mesajlar icin actual datayi cagirir
    And   Kullanici mesajlar icin expected data ile actual datayi karsilastirarark dogrulama yapar

  @US027_TC02
  Scenario: Kullanici, API kullanarak mesaj olusturmayı doğrulamalıdır
    Given Kullanici yeni mesaj olusturmak icin baseUrl'den url getirir
    Then  Kullanici yeni olusturulan mesaji test etmek icin expected data olusturur
    And   Kullanici yeni mesaj icin post request gonderip response alir
    And   Kullanici post status kod 201 oldugunu dogrular
    And   Kullanici yeni olusturulan mesaj icin actual datayi cagirir
    And   Kullanici yeni mesaj icin expected data ile actual datayi karsilastirarark dogrulama yapar


