Feature: Admin Test physician Api ile Test eder

  @US_018_Api
  Scenario: Admin physician bilgilerini dogrulayabilmeli
    Given Admin physician bilgilerini Get request ile alir
    When  Adminn Status kodunu 200 oldugunu dogrular
    Then Admin gelen physician datalarini alir ve dogrular.





