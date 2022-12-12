@US16
Feature: Oda Olusturma / Goruntuleme / Guncelleme /Silme (Admin)

  @US_16_01 @E2E
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
    And Admin oda bilgilerini girer
    And Admin Save butonunu dogrular ve tiklar
    And Admin oda olusturuldu onay mesajini goruntuler
    And Admin sing out yapar

  @US_16_02
  Scenario: Oda olusturulurken "Room Number" mutlaka olmali,(ODA NUMBER BOS BIRAKMA TESTİ)
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
    And Admin Room number secenegini bos birakir ve hata mesajini alir
    And Admin sing out yapar

  @US_16_03
  Scenario: Oda olusturulurken "Room Number" mutlaka olmali,(oda numarasi sozel deger almamali testi)
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
    And Admin Room number sozel deger girer  ve hata mesajini alir
    And Admin sing out yapar

  @US_16_04
  Scenario: Oda olusturulurken "Room Number" mutlaka olmali,(oda numarasi ozel karakter almamali testi)
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
    And Admin Room number ozel karakter girer  ve hata mesajini alir
    And Admin sing out yapar

  @US_16_05
  Scenario: Oda olusturulurken "Room Number" mutlaka olmali,(oda numarasi negatif deger alabilmeli BODRUM testi)
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
    And Admin Room number  Negative deger girer
    And Admin sing out yapar

  @US_16_06
  Scenario: "Room Type"; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olmali
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
    And Admin Room Type secenegini dogrular ve tiklar
    And Admin TWIN, DELUXE, PREMIUM_DELUXE, SUIT, DAYCARE seceneklerini gorur
    And Admin sing out yapar

  @US_16_07
  Scenario: Oda icin "Status" ayarlanabilir olmali
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
    And Admin Status seceneginin Chexbox ini secili degilse secer
    And Admin sing out yapar

  @US_16_08
  Scenario: Fiyat eklenebilir olmali ve bos birakilamamali.(bos birakma testi)
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
    And Admin Price secenegini bos birakir  ve hata mesajini alir
    And Admin sing out yapar


  @US_16_09
  Scenario: Fiyat eklenebilir olmali ve bos birakilamamali.(negative deger testi)
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
    And Admin  Price secenegine Negative deger girilir ve hata mesajini alir
    And Admin sing out yapar

  Scenario: Fiyat eklenebilir olmali ve bos birakilamamali.(sozel deger testi)
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
    And Admin  Price secenegine sozel deger girilir ve hata mesajini alir
    And Admin sing out yapar

  @US_16_10
  Scenario: Fiyat eklenebilir olmali ve bos birakilamamali.(pozitif deger testi)
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
    And Admin  Price secenegine Pozitif deger girer ve hata mesajini almaz
    And Admin sing out yapar

  @US_16_11
  Scenario: Description istege bagli olarak doldurulmali.
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
    And Admin Room number-RoomType-Status-Price seceneklerini gecerli datalar ile doldurur
    And Admin Description secenegini dogrular
    And Admin Description secenegine Sozel-ozelkarakter-negatif farketmeyen bir deger girer
    And Admin Save butonunu dogrular ve tiklar
    And Admin oda olusturuldu onay mesajini goruntuler
    And Admin sing out yapar

  @US_16_13
  Scenario:Admin aynı tur odalari gorebilir
    Given Admin medunnaUrl ine gider
    When Admin sag ust kosedeki insan emojisine tiklar
    Then Admin Sing in secenegine tiklar
    And Admin gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar
    And Admin giris yaptigini dogrular
    And Admin items&Titles secenegini dogrular ve tiklar
    And Admin items&Titles seceneginden Room secenegini secer
    And Admin Rooms sayfasinda oldugunu dogrular
    And Admin Room Type secenegine tiklayarak istedigi turdeki odalari goruntuler
    And Admin sing out yapar
  @US_16_14
  Scenario: Admin mevcut odaları duzenleyebilir ve guncelleyebilir
    Given Admin medunnaUrl ine gider
    When Admin sag ust kosedeki insan emojisine tiklar
    Then Admin Sing in secenegine tiklar
    And Admin gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar
    And Admin giris yaptigini dogrular
    And Admin items&Titles secenegini dogrular ve tiklar
    And Admin items&Titles seceneginden Room secenegini secer
    And Admin Rooms sayfasinda oldugunu dogrular
    And Admin Rooms sayfasinda en sagdaki sutunda View-Edit-Delete seceneklerini dogrular
    And Admin mevcut bir oda secer ve onun Edit secenegine tiklar
    And Admin oda bilgilerinde guncelleme yapar
    And Admin Save butonuna tiklar
    And Admin guncelleme yapildi onay mesajini goruntuler
    And Admin sing out yapar

    @US_16_15
    Scenario: Odalar Admin tarafindan silinebilir
      Given Admin medunnaUrl ine gider
      When Admin sag ust kosedeki insan emojisine tiklar
      Then Admin Sing in secenegine tiklar
      And Admin gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar
      And Admin giris yaptigini dogrular
      And Admin items&Titles secenegini dogrular ve tiklar
      And Admin items&Titles seceneginden Room secenegini secer
      And Admin Rooms sayfasinda Create a new Room secenegine tiklar
      And Admin Create or edit a Room sayfasinda oldugunu dogrular
      And Admin oda bilgilerini girer
      And Admin Save butonunu dogrular ve tiklar
      And Admin mevcut bir oda secer ve onun Delete secenegine tiklar
      And Admin Confirm delete operation ekraninin acildigini dogrular
      And Admin Confirm Delete operation ekraninda Delete butonuna tiklar
      And Admin oda silme onay mesajini dogrular








