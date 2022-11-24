
Feature: Oda Olusturma / Goruntuleme / Guncelleme /Silme (Admin)

  @US_16_01
  Scenario: Admin, yatan hastalar icin yeni oda olusturabilir
    Given Admin medunnaUrl ine gider
    When Admin sag ust kosedeki insan emojisine tiklar
    Then Admin Sing in secenegine tiklar
    And Admin gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar
    And Admin giris yaptigini dogrular
    And Admin items&Titles secenegini dogrular ve tiklar
    And Admin items&Titles seceneginden Room secenegini secer
    And Admin Rooms sayfasinda oldugunu dogrular
    And Admin Rooms sayfasinda Create a new Room secenegine tiklar
    And Admin Create or edit a Room sayfasinda oldugunu dogrular

