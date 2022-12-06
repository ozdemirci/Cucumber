Feature: Messages by Admin Validate with API and DB
@Api_US027
  Scenario: Kullanıcı, API kullanarak mesaj oluşturmayı ve okumayı doğrulamalıdır
    Given Kullanici get request ile mesajları getirir
    Then  Kullanici status kod 200 oldugunu dogrular
    And   Kullanici mesajları guncelleyebilir
    And   Kullanici mesajları dogrular


