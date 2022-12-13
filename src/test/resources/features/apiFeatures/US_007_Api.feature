@US007_Api
Feature: Randevular dogrulanabilmeli

 Scenario: API kullanarak randevular görüntülenebilmeli

   Given Esra  347300  id nolu hastanin randevularini get reguest ile ulasir
   When  Esra gelen response'un status kodunun 200 oldugunu test eder
   Then  Esra response bodydeki 347300 nolu idnin  datalarla ayni oldugunu dogrular


