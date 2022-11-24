@All_US_028
  Feature: Admin olarak; Country oluşturma / Okuma ve Silme

    @US_028_TC01
    Scenario: Kullanici yeni bir ulke olusturabilir

    Given Kullanici admin olarak giris yapar
    Then  Items&Titles sekmesinde Country bolumune tiklar
    And   Acilan ekranda Create a new Country butonuna tiklar
    And   Name bolumune ulke ismi girilir ve save butonu tiklanarak kayit yapilir

    @US_028_TC02
    Scenario:Kullanici, ulkeye göre ilgili eyaletler veya sehirler olusturabilmelidir.

     Given   Kullanici admin olarak giris yapar
     Then    Items&Titles sekmesinde State_City bolumune tiklar
     And     Create a new State_City butonu tiklanir
     And     Name bolumune ilgili state_City yazilir ve save butonuna tiklanir
     And     Ulkeleye sehir eklenebildigi test edilir

      @US_028_TC03
      Scenario: Kullanıcı ülkeleri silebilmelidir.

      Given Kullanici admin olarak giris yapar
      Then  Items&Titles sekmesinde Country bolumune tiklar
      And   Silinmesi istenen country satirindaki delete butonuna tiklanir
      And   Confirm delete operation uyarı ekranında Ulke silmek icin Delete butonuna tiklar
      And   Ilgili Ulkenin silindigi test edilir.

















