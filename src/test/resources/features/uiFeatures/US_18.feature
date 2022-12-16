@US18
Feature: US_018 Admin olarak; Yeni Physicians Oluşturur / Günceller / Görüntüler ve Sil yapar

  Background: Ortak islemler
    Given Kullanici https:"arananUrl" adresine gider
    And Kullanici SignIn butonuna tiklar


  @US18_TC001
  Scenario: TC_001	Admin olarak; Yeni Physicians Oluşturur / Günceller / Görüntüler ve Sil yapar
    And Admin olarak daha önceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanıcı admin olarak öğeler ve ünvanlar sekmesini tıklar ve gelen şıklardan physician secer ve tıklar.
    And Admin Doktorlar sayfasinda bütün doktorlarin bilgilerinin görülebildiğini  test  eder.
    And doktor sayfayi kapatir

  @US18_TC002
  Scenario: Admin olarak; Yeni Physicians Oluşturur / Günceller / Görüntüler ve Sil yapar
    And Admin olarak daha önceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanıcı admin olarak öğeler ve ünvanlar sekmesini tıklar ve gelen şıklardan physician secer ve tıklar.
    And Admin Create or edit a Physician sayfasında mevcut kullanıcılar arasından SSN kimliğine göre kayıtlı bir doktoru seçer ve  arar.
    And doktor sayfayi kapatir

  @US18_TC003
  Scenario: Admin olarak; Yeni Physicians Oluşturur / Günceller / Görüntüler ve Sil yapar
    And Admin olarak daha önceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanıcı admin olarak öğeler ve ünvanlar sekmesini tıklar ve gelen şıklardan physician secer ve tıklar.
    And Kullanıcı Physicians sayfasında Edit butonuna tıklar.
    And Kullanıcı admin olarak Create or edit a Physician sayfasında doktorların bilgilerini  düzenler.
    And    doktor sayfayi kapatir

  @US18_TC004
  Scenario: Admin olarak; Yeni Physicians Oluşturur / Günceller / Görüntüler ve Sil yapar
    And Admin olarak daha önceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanıcı admin olarak öğeler ve ünvanlar sekmesini tıklar ve gelen şıklardan physician secer ve tıklar.
    And  Kullanıcı admin olarak Create or edit a Physician sayfasında doktorların bilgilerini  düzenler.
    And Kişilerin "firstname, lastname birth date .." bilgileri doldurabilir.
    And   doktor sayfayi kapatir

  @US18_TC005
  Scenario: Admin olarak; Yeni Physicians Oluşturur / Günceller / Görüntüler ve Sil yapar
    And Admin olarak daha önceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanıcı admin olarak öğeler ve ünvanlar sekmesini tıklar ve gelen şıklardan physician secer ve tıklar.
    And  Kullanıcı admin olarak Create or edit a Physician sayfasında doktorların bilgilerini  düzenler.
    And Admin Doktor için bir uzmanlık alanı seçer.
    And  doktor sayfayi kapatir

  @US18_TC006
  Scenario: Admin olarak; Yeni Physicians Oluşturur / Günceller / Görüntüler ve Sil yapar
    And Admin olarak daha önceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanıcı admin olarak öğeler ve ünvanlar sekmesini tıklar ve gelen şıklardan physician secer ve tıklar.
    And  Kullanıcı admin olarak Create or edit a Physician sayfasında doktorların bilgilerini  düzenler.
    And Admin, doktorun profil resmini sağlayabilir.
    And   doktor sayfayi kapatir

  @US18_TC007
  Scenario: Admin olarak; Yeni Physicians Oluşturur / Günceller / Görüntüler ve Sil yapar
    And Admin olarak daha önceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanıcı admin olarak öğeler ve ünvanlar sekmesini tıklar ve gelen şıklardan physician secer ve tıklar.
    And  Kullanıcı admin olarak Create or edit a Physician sayfasında doktorların bilgilerini  düzenler.
    And Admin, doktorun Muayene ücretini girebilmelidir. (Exam fee)
    And   doktor sayfayi kapatir

  @US18_TC008
  Scenario: Admin olarak; Yeni Physicians Oluşturur / Günceller / Görüntüler ve Sil yapar
    And Admin olarak daha önceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanıcı admin olarak öğeler ve ünvanlar sekmesini tıklar ve gelen şıklardan physician secer ve tıklar.
    And  Kullanıcı admin olarak Create or edit a Physician sayfasında doktorların bilgilerini  düzenler.
    And Admin Create or edit a Physician sayfasında mevcut kullanıcılar arasından doktoru seçer.
    And   doktor sayfayi kapatir

  @US18_TC009
  Scenario: Admin olarak; Yeni Physicians Oluşturur / Günceller / Görüntüler ve Sil yapar
    And Admin olarak daha önceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.
    And Kullanıcı admin olarak öğeler ve ünvanlar sekmesini tıklar ve gelen şıklardan physician secer ve tıklar.
    And Admin mevcut doktorları silebilir.
    And   doktor sayfayi kapatir