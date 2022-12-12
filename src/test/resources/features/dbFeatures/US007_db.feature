@US007db
Feature: Db test


  Scenario: DB kullanarak randevular doğrulanabilmelidir

    Given Esra database ile baglanti kurar
    When  Esra randevulari goruntuleyebilmek icin query olusturur
    Then  Esra randevulari id sutununa gore listeler
    And   Esra randevulari goruntuleyebilmek icin kaydeder
    And   Esra randevulari dogrular
