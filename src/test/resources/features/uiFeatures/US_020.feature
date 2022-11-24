@All_US_020
  Feature: Admin; User management menüsünden,kullanıcı Active eder ve gerekli rolleri oluşturur.
    @US_020_TC01
    Scenario: Admin, kayıtlı kişilerin "firstname, lastname, email... Gibi bilgilerini görebilmeli.

    Given  Kullanici admin olarak giris yapar
    Then   Administration bolumunden User Management sekmesine tıklar
    And    Kayıtlı kullanicilar listesinde ki satirda yer alan View bolumune tiklar
    And    Gelen kullanici bilgilerinde firstname, lastname, email bilgilerinin goruldugunu test eder

     @US_020_TC02
    Scenario: Admin, kullanicilari aktive edebilir ve rollerini
                "ADMIN, USER PATIENT, STAFF ve PHYSICIAN" olarak atayabilir.

     Given Kullanici admin olarak giris yapar
     Then  Administration bolumunden User Management sekmesine tıklar
     And   Edit butonuna tiklar
     And   Kullanici activated secenegini secerek kullanici aktive edebilir
     And   kullanici bilgilerinde yer alan profil sekmesinden rol degisikligi yapabilir.

















