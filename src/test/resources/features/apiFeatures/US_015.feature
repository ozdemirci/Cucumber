Feature: Admin hasta bilgilerini APİ ile dogrular

  Scenario: Admin hasta bilgilerini dogrulayabilmeli
    Given Admin hasta bilgilerini Get request ile alir
    Then Admin status konunun 200 oldugunu dogrular
    And admin hasta bilgilerini dogrular
