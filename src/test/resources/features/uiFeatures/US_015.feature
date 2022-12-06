@US15
Feature: US_15 Yeni hastalar yalnizca yonetici tarafindan olusturulabilir

  @US_15_01
  Scenario: TC_01 Yeni hastalar yalnizca yonetici tarafindan olusturulabilir(pozitif)
    Given Admin medunnaUrl ine gider
    When Admin sag ust kosedeki insan emojisine tiklar
    When Admin Sing in secenegine tiklar
    Then Admin gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar
    And Admin giris yaptigini dogrular
    And Admin items&Titles secenegini dogrular ve tiklar
    And Admin items&Titles seceneginden Patient secenegini secer
    And Admin Patiens sayfasinda oldugunu dogrular
    And Admin Patiens sayfasinda Create a new Patient secenegine tiklar
    And Admin Create or edit a Patient sayfasinda oldugunu dogrular
    And Admin hasta bilgilerini girer
    And Admin Save butonuna tiklar
    And Admin hasta olusturuldu onay mesajini dogrular
    And Admin sing out yapar

  @US_15_02
  Scenario: TC02 Yeni hastalar yalnizca yonetici tarafindan olusturulabilir(negative)
    Given Personel Medunna url ine gider
    When Personel sag ust kosedeki insan emojisine tiklar
    Then Personel Sing in secenegine tiklar
    And Personel gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar
    And Personel giris yaptigini dogrular
    And Personel items&Titles seceneginin olmadigini dogrular
    And Personel sing out yapar

  @US_15_03
  Scenario: TC03 Yeni hastalar yalnizca yonetici tarafindan olusturulabilir(negative)
    Given Hasta Medunna url ine gider
    When  Hasta sag ust kosedeki insan emojisine tiklar
    Then  Hasta Sing in secenegine tiklar
    And   Hasta gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar
    And   Hasta giris yaptigini dogrular
    And   Hasta items&Titles seceneginin olmadigini dogrular
    And Hasta sing out yapar


  @US_15_04
  Scenario: TC04 Yeni hastalar yalnizca yonetici tarafindan olusturulabilir(negative)
    Given Doktor Medunna url ine gider
    When  Doktor sag ust kosedeki insan emojisine tiklar
    Then  Doktor Sing in secenegine tiklar
    And   Doktor gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar
    And   Doktor giris yaptigini dogrular
    And   Doktor items&Titles seceneginin olmadigini dogrular
    And Doktor sing out yapar

  @US_15_05
  Scenario: TC05 Yeni hastalar yalnizca yonetici tarafindan olusturulabilir(negative)
    Given User Medunna url ine gider
    When  User sag ust kosedeki insan emojisine tiklar
    Then  User Sing in secenegine tiklar
    And   User gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar
    And   User giris yaptigini dogrular
    And   User items&Titles seceneginin olmadigini dogrular
    And User sing out yapar

  @US_15_06
  Scenario: Yonetici "SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address,
  Description, Created Date, User, Country and state / City" gibi hasta bilgilerini gorebilir.
    Given Admin medunnaUrl ine gider
    When Admin sag ust kosedeki insan emojisine tiklar
    Then Admin Sing in secenegine tiklar
    And Admin gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar
    And Admin giris yaptigini dogrular
    And Admin items&Titles secenegini dogrular ve tiklar
    And Admin items&Titles seceneginden Patient secenegini secer
    And Admin Patiens sayfasinda oldugunu dogrular ve SSN,First Name,Last Name,Birth Date,Phone,Gender,Blood Group,Address,Description,Created Date,User,Country and state-City gibi secenekleri dogrular"
    And Admin sing out yapar

  @US_15_11
  Scenario: Yonetici herhangi bir hastayi silebilir
    Given Admin medunnaUrl ine gider
    When Admin sag ust kosedeki insan emojisine tiklar
    Then Admin Sing in secenegine tiklar
    And Admin gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar
    And Admin giris yaptigini dogrular
    And Admin items&Titles secenegini dogrular ve tiklar
    And Admin items&Titles seceneginden Patient secenegini secer
    And Admin Patiens sayfasinda Create a new Patient secenegine tiklar
    And Admin Create or edit a Patient sayfasinda oldugunu dogrular
    And Admin hasta bilgilerini girer
    And Admin Save butonuna tiklar
    And Admin Patiens sayfasinda oldugunu dogrular
    And Admin Patiens sayfasinda en sagdaki sutunlarda View-Edit-Delete seceneklerini dogrular
    And Admin Patients sayfasinda bir hasta belirler
    And Admin belirledigi hastanin Delete secenegine tiklar
    And Admin Confirm delete operation ekraninin acildigini dogrular
    And Admin Confirm delete operation ekraninda Delete butonuna tiklar
    And Admin hasta silme onay mesajini dogrular