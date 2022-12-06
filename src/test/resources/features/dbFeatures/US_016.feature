@US_16_DB
Feature: Oda bilgilerini DB ile dogrulama

 Scenario Outline:oda bilgileri database testi
   Given Admin baglanti kurar
   When Admin olusturulan oda bilgilerini db den alir "<query>" ve "<columnName>"
  Then Kullanici bilgilerini dogrular


   Examples:
     |query|columnName|
     |SELECT * FROM|id|