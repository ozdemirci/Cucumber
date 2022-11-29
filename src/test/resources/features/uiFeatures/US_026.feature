@US26
  Feature: İletişim Mesajı (Contact messages)

    @US26_TC01

    Scenario: Herhangi bir kullanici, bilgi almak icin Contact portal uzerinden istek gönderebilmeli.

      Given Kullanici baseUrl sayfasina gider
      Then Kullanici CONTACT butonunun gorunur oldugunu test eder
      When Kullanici CONTACT butonuna tiklar
      Then Kullanici acilan sayfanin CONTACT sayfasini oldugunu dogrular


    @US26_TC02

    Scenario: Kullanici Name, Email, Subject, Message bolumlerine data girebilmeli ve mesajini gonderebilmeli.


      Given Kullanici Name butonunun gorunur oldugunu test eder
      When Kullanici Name butonuna tiklar
      And Kullanici gecerli bir isim girer
      Then Kullanici Email butonunun gorunur oldugunu test eder
      When Kullanici Email butonuna tiklar
      And Kullanici gecerli bir Email girer
      Then Kullanici Subject butonunun gorunur oldugunu test eder
      When Kullanici Subject butonuna tiklar
      And Kullanici gecerli bir Subject girer
      Then Kullanici Message butonunun gorunur oldugunu test eder
      When Kullanici Message butonuna tiklar
      And Kullanici herhangi bir mesaj girer
      Then Kullanici Send butonunun gorunur oldugunu test eder
      When  Kullanici Send butonuna tiklar
      Then Kullanici dogrulama mesajinin "Your message has been received" icerdigini test eder
      And Kullanici sayfayi kapatir