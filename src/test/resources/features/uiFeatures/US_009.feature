@US_009
Feature: US_009 Staff (Personel), hasta bilgilerini gorebilmeli,duzenleyebilmeli ama silememelidir.

  Background: Sign In
    Given Personel "baseUrl" e gider
    And Personel sayfanin sag ust  kosesindeki drop down a tiklar
    And Personel Sing in segmesine tiklar
    And Personel  Username box a gecerli "medunnaStaffUsername" girer
    And Personel Password box a gecerli "medunnaStaffPassword" girer
    And Personel  giris yapmak uzere Sign in butonuna  tiklar
    And Personel MY PAGES sekmesine tiklar
    And Personel Search Patient sekmesine tiklar

  @US_009_TC_001
  Scenario: TC_001 "My Pages" sekmesinden hasta bilgilerini gorebilmelidir.
    Then Gidilen sayfada hasta bilgilerinin gorunur oldugunu dogrular
    And Personel sayfayi kapatir

  @US_009_TC_002
  Scenario: TC_002 Kullanici butun hasta bilgilerini "id, firstname, lastname, birthdate, email, phone, gender,
  blood group, address, description, user, country and state/city" duzenleyebilmelidir
    When Personel Patient SSN box a tiklar ve hasta "111-35-1994" girer
    Then Personel hastanin Edit buttonuna tiklar
    And Personel 3 saniye bekler
    And Personel ID yi duzenler
    And Personel 3 saniye bekler
    And Personel FirstName i duzenler
    And Personel 3 saniye bekler
    And Personel LastName i duzenler
    And Personel 3 saniye bekler
    And Personel Birth Date i duzenler
    And Personel 3 saniye bekler
    And Personel Email i duzenler
    And Personel 3 saniye bekler
    And Personel Phone u duzenler
    And Personel 3 saniye bekler
    And Personel Gender i duzenler
    And Personel 3 saniye bekler
    And Personel Blood Group u duzenler
    And Personel 3 saniye bekler
    And Personel Address i duzenler
    And Personel 3 saniye bekler
    And Personel Description i duzenler
    And Personel 3 saniye bekler
    And Personel User i duzenler
    #And Personel 3 saniye bekler
    And Personel Country i duzenler
    #And Personel 3 saniye bekler
    And Personel State-City i duzenler
    And Personel 3 saniye bekler
    #And Personel save buttonuna basar
    #And Personel 3 saniye bekler
    #And Personel back tusuna basar
    #And Personel 3 saniye bekler
    #And Personel Patient SSN box a tiklar ve hasta "111-35-1994" girer
    #And Personel 3 saniye bekler
    #And Personel yaptigi degisiklikleri dogrular
    #And Personel 3 saniye bekler
    And Personel sayfayi kapatir

  Scenario: TC_003  Kullanici, SSN'lerine gore yeni bir basvuru sahibi arayabilmeli ve
  tum kayit bilgilerinin dolduruldugunu gorebilmelidir.
    When Personel Patient SSN box a tiklar ve hasta "111-35-1994" girer
    Then Personel hasta bilgilerinin dolduruldugunu dogrular
    And Personel sayfayi kapatir

    Scenario: TC_004  Kullanici herhangi bir hasta bilgisini silebilir.
      When Personel Patient SSN box a tiklar ve hasta "111-35-1994" girer
      Then Personel hastanin Edit buttonuna tiklar
      And Personel hasta bilgilerini siler
      And Personel save buttonuna basar
      And Personel back tusuna basar
      And Personel Patient SSN box a tiklar ve hasta "111-35-1994" girer
      And Personel hasta bilgilerini sildigini dogrular
      #And Personel sayfayi kapatir