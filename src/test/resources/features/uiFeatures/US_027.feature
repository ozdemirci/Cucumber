@All_US_027
Feature: "Messages by Admin
   @US_027_TC01
    Scenario: Admin, mesaj portalına gidebilir ve tüm mesajları, yazarlarini ve e-postalarini goruntuleyebilir.

        Given Kullanici admin olarak giris yapar
        Then  Items&Titles sekmesinde Messages bolumune tiklar
        And   Acilan ekranda yazilan mesajları, yazarlarini ve  epostalarinin gorulebildigini test eder

    @US_027_TC02
    Scenario: Admin, mesajları oluşturabilir

        Given Kullanici admin olarak giris yapar
        Then  Items&Titles sekmesinde Messages bolumune tiklar
        And   Create a new massage butonuna tiklar
        And   Acilan ekranda name, email,subject,message bolumlerini doldurarark save butonuna tiklayarak mesaj olusturur

    @US_027_TC03
      Scenario: Admin, mesajları güncelleyebilir

       Given    Kullanici admin olarak giris yapar
       Then     Items&Titles sekmesinde Messages bolumune tiklar
       And      Acilan listede guncellemek istedigi mesaj satirindaki edit butonuna tiklar
       And      Messge alanini güncelleyerek save butonuna tiklar

      @US_027_TC04
      Scenario: Admin, mesajları silebilir

        Given   Kullanici admin olarak giris yapar
        Then    Items&Titles sekmesinde Messages bolumune tiklar
        And     Silinmesi istenen mesaj satirindaki delete butonuna tiklar
        And     Confirm delete operation uyarı ekranında Delete butonuna tiklar
















