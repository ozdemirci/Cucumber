@US008
Feature: Kullanıcı giriş yaptığında Password sekmesi düzenlenebilir olmalı
  Background: Ortak Stepler
    Given Kullanici Medunna  sayfa url`sine gider
    When  Kullanici profil simgesine tiklar
    Then  Kullanici Sign in sekmesine tiklar
    And   Kullanici gecerli bir username ve password girer
    And   Kullanici Sign in butonuna tiklar
    And   Kullanici profil sekmesinden Password`a tiklar
    Then  Kullanici current passwordu girer


  @US08_TC01
  Scenario: "New password confirmation" onaylanabilmeli
    And  Kullanici new password girer
    And  Kullanici new password confirmation onaylandigini gorur
    And   Sayfa kapatilir

  @US08_TC02
  Scenario Outline: Daha güçlü şifre için en az 1 küçük harf olmalı ve ""Password strength:"" seviyesinin değiştiği görülebilmelidir.
    Then Kullanici daha guclu sifre icin kucuk harf "<kucukHarf>" kullanir
    And  Kullanici Password strength seviyesinin doorduncu cizgide oldugunu goruntuler
    And   Sayfa kapatilir
    Examples:
      | kucukHarf |
      | ASSHLEy |
      | ASSHley |


  @US08_TC03
  Scenario Outline: Şifrede en az 1 büyük harf olmali ve "Password strength:" seviyesinin değiştiği görülebilmeli
    Given Kullanici daha guclu sifre icin buyuk harf "<buyukHarf>" kullanir
    Then  Kullanici Password strength seviyesinin ikinci cizgide oldugunu goruntuler
    And   Sayfa kapatilir
    Examples:
      | buyukHarf |
      |  asshleY|
      |  asshlEY |


  @US08_TC04
  Scenario Outline: Şifrede en az 1 rakam olmali ve "Password strength:" seviyesinin değiştiği görülebilmeli
    Given Kullanici daha guclu sifre icin rakam "<rakam>" kullanir
    Then  Kullanici Password strength seviyesinin ikinci cizgide oldugunu goruntuler
    And   Sayfa kapatilir
    Examples:
      | rakam |
      |  ashley1 |
      |  ashley12 |



  @US08_TC05
  Scenario Outline: Şifrede en az 1 özel karakter olmali ve"Password strength:" seviyesinin değiştiği görülebilmeli
    Then Kullanici daha guclu sifre icin ozel karakter "<ozelKarakter>" kullanir
    Then  Kullanici Password strength seviyesinin ikinci cizgide oldugunu goruntuler
    And   Sayfa kapatilir
    Examples:
      | ozelKarakter |
      | ashley/ |
      | ashley. |


  @US08_TC06
  Scenario Outline: Güçlü bir parola için şifre en az 7 karakterden oluşmalı
    Then Kullanici "<enAz7Karakter>"den olusan sifre girer
    And  Kullanici Password strength seviyesinin besinci cizgide oldugunu goruntuler
    And   Sayfa kapatilir
    Examples:
      | enAz7Karakter |
      | Ashley1/ |
      | Ashley1/.|


  @US08_TC07
  Scenario Outline: Güçlü bir parola için şifre en az 7 karakterden oluşmalı
    Then Kullanici "<AzKarakter>"den olusan bir sifre girer
    And  Kullanici guclu sifre olusmadigini goruntuler
    And   Sayfa kapatilir
    Examples:
      | AzKarakter|
      | ashley|
      | ashle |

