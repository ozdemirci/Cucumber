Feature: US_16 Admin  Oda olusturma ,Goruntuleme , guncelleme ve silme yapabilmeli
  Scenario: Admin API ile oda olusturur post
    Given  endpointi api "api" ve rooms "rooms" olan uzantiyi ekler
    Then   bir room olusturur oda tipi "TWIN" oda fiyati 100 oda numarasi 173173258 description "team08"post
    And    status kodunun 201 oldugunu dogrular
    And    Odayi okur


  Scenario: Admin API ile oda numaralararini Update eder
    Given  endpointi api "api" ve rooms "rooms" olan uzantiyi ekler
    Then   olusturulan odada id nosu 398053 olan oda tipini "DELUXE" oda fiyatini 500 , oda numarasini 699635 descriptionu "team008"  Update eder
    And    Update yi assert eder


  Scenario:Admin API ile kayitli odayi Delete eder
    Given   endpointi api "api" ve rooms "rooms" ve id si 396745 olan uzantiyi ekler
    When    Admin kayitli odayi Delete eder
    And    Deleteyi assert eder