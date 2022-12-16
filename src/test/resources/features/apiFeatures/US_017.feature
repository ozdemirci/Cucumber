Feature: Admin Test items(öğe) Api ile Test eder

  @US_017_Api
  Scenario: Admin testItem bilgilerini dogrulayabilmeli
    Given Admin testItems bilgilerini Get request ile alir
    When  Admin Status kodunu 200 oldugunu dogrular.
    Then Admin gelen test items datalarini alir ve dogrular.





