@US_005
Feature:US 005 Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir.

  Background: Ortak adimlar
    Given Belirtilen url gidilir
    When Anasayfada Make an Appointment butonuna tiklanir
    Then Kullanici 2 saniye bekler

    @US_005_TC_01
  Scenario Outline: TC - 01  Kullanicinin herhangi bir karakter iceren "First Name" yazmasi gerekir ve bos birakilamaz.


    When First Name tiklanir
    Then Verilen "<isimler>" girilir
    And Send an Appointment Request tiklanir
    And Girilen her bir isim icin Your FirstName is required. yazisinin goruntulenmedigi dogrulanir
    And Sayfa yenilenir
    And Send an Appointment Request tiklanir
    And First Name altinda Your FirstName is required. yazisinin goruntulendigi dogrulanir
    And Sayfa kapatilir.

    Examples:
      | isimler                   |
      | John123                   |
      | jhonnie                   |
      | Jack.                     |
      | Ja-son                    |
      | John123jhonnieJack.Ja-son |


  @US_005_TC_02
  Scenario: TC - 02   Kullanici SSN numarasi girmeli (kayitli SSN bos birakilama)

    When SSN tiklanir
    Then Verilen kayitli SSN girilir
    And Email tiklanir
    And SSN altinda Your SSN is required. goruntulenmedigi dogrulanir
    And Kullanici 5 saniye bekler
    And Sayfa yenilenir
    And Send an Appointment Request tiklanir
    And Your SSN is required. yazisinin goruntulendigi dogrulanir
    And Sayfa kapatilir.


  @US_005_TC_03
  Scenario Outline: TC - 03 Kullanici, herhangi bir karakter iceren "Last Name" yazmasi gerekir, bos birakilamaz.

    When Last Name tiklanir
    Then Verilen "<soyisimler>" textbox'a girilir
    And  Kullanici 5 saniye bekler
    And Send an Appointment Request tiklanir
    And Girilen her bir Soy isim icin Your LastName is required. yazisinin goruntulenmedigi dogrulanir
    And Sayfa yenilenir
    And Send an Appointment Request tiklanir
    And Last Name altinda Your LastName is required. yazisinin goruntulendigi dogrulanir
    And Sayfa kapatilir.


    Examples:
      | soyisimler         |
      | asd                |
      | asd123             |
      | a-asd              |
      | asd?               |
      | asdasd123a-asdasd? |

  @US_005_TC_04
  Scenario: TC - 04 Kullanici, 3. ve 6. rakamdan sonra "-" olan 10 rakamli telefon numarasini girmeli, bos birakilamaz.

    When Phone bolumune verilen Tel NoBir  - isaretleri ile girilir
    Then Send an Appointment Request tiklanir
    And Phone number is required. yazisinin goruntulenmedigi dogrulanir
    And Kullanici 3 saniye bekler
    And Sayfa yenilenir
    And Phone tiklanir
    And Send an Appointment Request tiklanir
    And Phone number is required. yazisinin goruntulendigi dogrulanir
    And Kullanici 3 saniye bekler
    And Sayfa yenilenir
    And Phone bolumune verilen Tel NoIki girilir
    And Send an Appointment Request tiklanir
    And Phone number is invalid yazisinin goruntulendigi dogrulanir
    And Kullanici 3 saniye bekler
    And Sayfa yenilenir
    And Phone bolumune verilen Tel NoUc girilir
    And Send an Appointment Request tiklanir
    And Phone number is invalid yazisinin goruntulendigi dogrulanir
    And Kullanici 3 saniye bekler
    And Sayfa yenilenir
    And Phone bolumune verilen Tel NoDort girilir
    And Send an Appointment Request tiklanir
    And Phone number is invalid yazisinin goruntulendigi dogrulanir
    And Sayfa kapatilir.


  @US_005_TC_05
  Scenario: TC - 05   Kullanici randevu alir, kayitli hesabindan profillerini gorebilir ve uygulamada oturum acabilir

    When Kullanici 3 saniye bekler
    When First Name bolumune verilen isim girilir
    Then Last Name bolumune verilen soyisim girilir
    And SSN bolumune verilen SSN numarasi girilir
    And E-mail bolumune random bir e-mail adresi girilir
    And Phone bolumune verilen tel no girilir
    And Appointment DateTime bolumune istenen tarih girilir
    And Send an Appointment Request tiklanir
    And Kullanici 3 saniye bekler
    And Appointment registration saved! We will call you as soon as possible.' yazisinin goruntulendigi dogrulanir
    And Sayfa kapatilir.

  @US_005_TC_05
  Scenario: TC - 06   Kayitli hasta hesabindan profillerini gorebilir ve uygulamada oturum acabilir

    When Kullanici 3 saniye bekler
    When Sign In tiklanir
    Then Username bolumune verilen username girilir
    And Password bolumune verilen password girilir
    And Pop-up üzerindeki Sign In tiklanir
    And Kullanicinin oturum actigi dogrulanir
    And MY PAGES (PATIENT) tiklanir
    And My Appointments tiklanir
    And from bolune verilen tarih girilir
    And Kullanici 3 saniye bekler
    And to bolumune verilen tarih girilir
    And Kullanici 3 saniye bekler
    And Randevunun goruntulendigi dogrulanir
    And Sayfa kapatilir.
