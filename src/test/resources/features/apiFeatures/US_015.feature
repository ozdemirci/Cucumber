Feature: Api dogrulama
  Scenario: Api ile hasta dogrulamasi yapilabilmeli
    Given Admin medunna base url ine gider
    When  Admin hasta bilgileri icin GET request gonderir ve GET response alir
    Then  Admin deserialization yapar Json-Java
    And Admin Status kodunun "200" oldugunu dogrular
    And Admin verileri dogrular