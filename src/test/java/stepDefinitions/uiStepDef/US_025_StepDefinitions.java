package stepDefinitions.uiStepDef;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import pages.SumeyyePage;
import utilities.ConfigReader;
import utilities.Driver;


public class US_025_StepDefinitions {

    SumeyyePage sumeyyePage=new SumeyyePage();


    //25_TC01
    @Given("Hasta <sumeyyeUrl> sayfasina gider.")
    public void hastaSumeyyeUrlSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("sumeyyeUrl"));
    }


    @When("Hasta sign in butonuna tiklar.")
    public void hastaSignInButonunaTiklar() {
        sumeyyePage.ilkSignInButton.click();

    }

    @And("Hasta patient sign in butonuna tiklar.")
    public void hastaPatientSignInButonunaTiklar() {
        Assert.assertTrue(sumeyyePage.patientSignButton.isDisplayed());
        sumeyyePage.patientSignButton.click();
    }

    @And("Hasta gecerli bir username girer.")
    public void hastaGecerliBirUsernameGirer() {
        sumeyyePage.patientUserName8.sendKeys("hasta81proje");


    }

    @And("Hasta gecerli bir password girer.")
    public void hastaGecerliBirPasswordGirer() {
        sumeyyePage.patientpassword8.sendKeys("qa123456789!");

    }

    @When("Hasta ikinci sign in butonuna tiklar.")
    public void hasta_ikinci_sign_in_butonuna_tiklar() {
        sumeyyePage.ikinciSignInButton.click();
    }

    @When("Hasta MY PAGES\\(PATIENT) butonuna tiklar.")
    public void hasta_my_pages_patient_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sumeyyePage.myPagesButton.isDisplayed());
        sumeyyePage.myPagesButton.click();

    }


    @When("Hasta Make an Appointment butonuna tiklar")
    public void hasta_make_an_appointment_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sumeyyePage.makeAnAppointmentButton.isDisplayed());
        sumeyyePage.makeAnAppointmentButton.click();

    }



    @Then("Hasta Phone butonunun gorunur oldugunu test eder")
    public void hasta_phone_butonunun_gorunur_oldugunu_test_eder() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.patientPhoneButton);

        Assert.assertTrue(sumeyyePage.patientPhoneButton.isDisplayed());

    }

    @Then("Hasta gecerli bir telefon numarasi girer")
    public void hasta_gecerli_bir_telefon_numarasi_girer() throws InterruptedException {

        sumeyyePage.phoneButton.sendKeys("555-555-5555" +Keys.ENTER);
        Thread.sleep(3000);
    }


    @Then("Hasta Send an Appointment Request butonunun gorunur oldugunu test eder")
    public void hasta_send_an_appointment_request_butonunun_gorunur_oldugunu_test_eder() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.sendAnAppointmentRequestButton);
        Assert.assertTrue(sumeyyePage.sendAnAppointmentRequestButton.isDisplayed());
    }
    @When("Hasta Send an Appointment Request butonuna tiklar")
    public void hasta_send_an_appointment_request_butonuna_tiklar()  {
        sumeyyePage.sendAnAppointmentRequestButton.click();
    }

    @Then("Hasta ekranda {string}yazisini gorerek randevu alindigini dogrular")
    public void hastaEkrandaAppointmentRegistrationSavedWeWillCallYouAsSoonAsPossibleYazisiniGorerekRandevuAlindiginiDogrular() {


        Assert.assertTrue(sumeyyePage.popUpMessage.isDisplayed());


    }


    // 25_TC02

    @Given("Kullanici <sumeyyeUrl> sayfasina gider")
    public void kullaniciSumeyyeUrlSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("sumeyyeUrl"));

    }

    @When("Kullanici Make an Appointment butonuna tiklar")
    public void kullanici_make_an_appointment_butonuna_tiklar()  {

        sumeyyePage.makeAnAppointmentScroll.click();

    }
    @Then("Kullanici First Name butonunun gorunur oldugunu test eder")
    public void kullanici_first_name_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.firstNameButton.isDisplayed());

    }
    @When("Kullanici First Name butonuna tiklar")
    public void kullanici_first_name_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        sumeyyePage.firstNameButton.click();

    }


    @When("Kullanici SSN butonuna tiklar")
    public void kullanici_ssn_butonuna_tiklar() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.ssnButton);
        sumeyyePage.ssnButton.click();

    }
    @Then("Kullanici First Name butonu altinda {string} yazisinin goruntulendigini dogrular")
    public void kullanici_first_name_butonu_altinda_yazisinin_goruntulendigini_dogrular(String string) {
        Assert.assertEquals("Your FirstName is required.", sumeyyePage.firstNameRequired.getText());

    }

    @And("Kullanici gecerli first name girer")
    public void kullaniciGecerliFirstNameGirer() {
        sumeyyePage.firstNameButton.sendKeys("Hasta81" + Keys.ENTER);
    }




    //25_TC03
    @Given("Kullanici Url'e gider")
    public void kullanici_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("sumeyyeUrl"));
    }

    @When("Kullanici Make An Appointment butonuna tiklar")
    public void kullaniciMakeAnAppointmentButonunaTiklar() {
        sumeyyePage.makeAnAppointmentScroll.click();

    }


    @And("Kullanici Gecerli bir first name girer")
    public void kullaniciGecerliBirFirstNameGirer() {
        sumeyyePage.firstNameButton.sendKeys("Hasta81" + Keys.ENTER);

    }



    @When("Kullanici SSN Butonuna tiklar.")
    public void kullaniciSSNButonunaTiklar() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.ssnButton);

        Assert.assertTrue(sumeyyePage.ssnButton.isDisplayed());
        sumeyyePage.ssnButton.click();
    }

    @When("Kullanici Last name butonuna tiklar")
    public void kullanici_last_name_butonuna_tiklar() throws InterruptedException {

        Assert.assertTrue(sumeyyePage.lastNameButton.isDisplayed());
        sumeyyePage.lastNameButton.click();

    }
    @Then("Kullanici SSN Butonu altinda {string} yazisinin goruntulendigini dogrular")
    public void kullanici_ssn_butonu_altinda_yazisinin_goruntulendigini_dogrular(String string) {

         Assert.assertEquals("Your SSN is required.", sumeyyePage.ssnRequired.getText());

    }
    @Then("Kullanici Gecerli bir SSN girer")
    public void kullanici_gecerli_bir_ssn_girer() {
        sumeyyePage.ssnButton.sendKeys("855-85-8888" + Keys.ENTER);

    }

    // 25_TC04

    @Given("Kullanici <sumeyyeUrl> 'e gider.")
    public void kullanici_sumeyye_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("sumeyyeUrl"));

    }
    @Then("Kullanici anasayfada make AN appointment butonunun gorunur oldugunu test eder")
    public void kullaniciAnasayfadaMakeANAppointmentButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(sumeyyePage.makeAnAppointmentScroll.isDisplayed());

    }

    @When("Kullanici make AN appointment butonuna tiklar")
    public void kullaniciMakeANAppointmentButonunaTiklar() {
        sumeyyePage.makeAnAppointmentScroll.click();

    }
    @When("kullanici gecerli bir first name girer")
    public void kullanici_gecerli_bir_first_name_girer() {
        sumeyyePage.firstNameButton.sendKeys("Hasta81" + Keys.ENTER);

    }
    @When("kullanici gecerli  SSN girer")
    public void kullanici_gecerli_ssn_girer() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.ssnButton);
        sumeyyePage.ssnButton.sendKeys("855-85-8888" + Keys.ENTER);

    }


    @When("Kullanici last Name butonuna tiklar")
    public void kullaniciLastNameButonunaTiklar() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.lastNameButton);

        sumeyyePage.lastNameButton.click();
    }


    @When("Kullanici Phone butonuna tiklar")
    public void kullanici_phone_butonuna_tiklar() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.phoneButton);
        sumeyyePage.phoneButton.click();

    }
    @Then("Kullanici Last Name butonu altinda {string} yazisinin goruntulendigini dogrular")
    public void kullanici_last_name_butonu_altinda_yazisinin_goruntulendigini_dogrular(String string) {
        Assert.assertEquals("Your LastName is required.", sumeyyePage.lastNameRequired.getText());

    }
    @Then("Kullanici gecerli bir Last Name girer")
    public void kullanici_gecerli_bir_last_name_girer() {
        sumeyyePage.lastNameButton.sendKeys("proje" + Keys.ENTER);

    }



    //25_TC05

    @Given("Kullanici <sumeyyeUrl> 'e gider")
    public void kullaniciSumeyyeUrlEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("sumeyyeUrl"));

    }


    @And("Kullanici gecerli bir firstname girer")
    public void kullaniciGecerliBirFirstnameGirer() {
        sumeyyePage.firstNameButton.click();
        sumeyyePage.firstNameButton.sendKeys("Hasta81" + Keys.ENTER);
    }

    @And("Kullanici gecerli Bir SSN girer")
    public void kullaniciGecerliBirSSNGirer() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.ssnButton);

        sumeyyePage.ssnButton.click();
        sumeyyePage.ssnButton.sendKeys("855-85-8888" + Keys.ENTER);
    }

    @And("Kullanici gecerli Bir last name girer")
    public void kullaniciGecerliBirLastNameGirer() {
        sumeyyePage.lastNameButton.click();
        sumeyyePage.lastNameButton.sendKeys("proje" + Keys.ENTER);

    }


    @Then("Kullanici Phone butonunun gorunur oldugunu test eder.")
    public void kullaniciPhoneButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(sumeyyePage.phoneButton.isDisplayed());
    }


    @And("Kullanici gecerli bir telefon numarasi girer")
    public void kullaniciGecerliBirTelefonNumarasiGirer() {
        sumeyyePage.phoneButton.sendKeys("555-555-5555" + Keys.ENTER);
    }

    //25_TC06

    @Given("K ullanici <sumeyyeUrl> 'e gider")
    public void k_ullanici_sumeyye_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("sumeyyeUrl"));

    }
    @Given("K ullanici gecerli bir first name girer")
    public void k_ullanici_gecerli_bir_first_name_girer() {
        sumeyyePage.firstNameButton.sendKeys("Hasta81" + Keys.ENTER);
    }
    @Given("K ullanici gecerli bir SSN girer")
    public void k_ullanici_gecerli_bir_ssn_girer() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.ssnButton);
        sumeyyePage.ssnButton.sendKeys("855-85-8888" + Keys.ENTER);
    }
    @Given("K ullanici gecerli bir last name girer")
    public void k_ullanici_gecerli_bir_last_name_girer() {
        sumeyyePage.lastNameButton.sendKeys("proje" + Keys.ENTER);
    }
    @Given("K ullanici gecerli bir Email girer")
    public void k_ullanici_gecerli_bir_email_girer() {
        sumeyyePage.emailButton.sendKeys("hasta81proje@gmail.com" + Keys.ENTER);
    }

    @And("K ullanici gecerli bir Phone girer")
    public void kUllaniciGecerliBirPhoneGirer() {
        sumeyyePage.phoneButton.sendKeys("555-555-5555" + Keys.ENTER);

    }

    @Given("K ullanici Appointment DateTime butonunun gorunur oldugunu test eder")
    public void k_ullanici_appointment_date_time_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.dateButton.isDisplayed());

    }
    @Given("K ullanici Appointment DateTime butonuna tiklar")
    public void k_ullanici_appointment_date_time_butonuna_tiklar() {
        sumeyyePage.dateButton.click();
    }
    @Given("K ullanici gecerli bir tarih girer")
    public void k_ullanici_gecerli_bir_tarih_girer() {
        sumeyyePage.dateButton.sendKeys("29.12.22" + Keys.ENTER);

    }
    @Given("K ullanici Send an Appointment Request butonunun gorunur oldugunu test eder")
    public void k_ullanici_send_an_appointment_request_butonunun_gorunur_oldugunu_test_eder() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.sendAnAppointmentRequestButton);

        Assert.assertTrue(sumeyyePage.sendAnAppointmentRequestButton.isDisplayed());
    }
    @Given("K ullanici Send an Appointment Request butonuna tiklar")
    public void k_ullanici_send_an_appointment_request_butonuna_tiklar() {
        sumeyyePage.dateButton.click();

    }
    @Given("K ullanici ekranda {string} yazisini gorerek randevu alindigini dogrular")
    public void k_ullanici_ekranda_yazisini_gorerek_randevu_alindigini_dogrular(String string) {
        Assert.assertTrue(sumeyyePage.popUpMessage.isDisplayed());
    }




    //25_TC07

    @Given("Kulllanici <sumeyyeUrl> 'e Gider")
    public void kulllaniciSumeyyeUrlEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("sumeyyeUrl"));


    }

    @Then("Kullanici ilk sign in butonunun gorunur oldugunu test eder")
    public void kullaniciIlkSignInButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(sumeyyePage.ilkSignInButton.isDisplayed());
        
    }

    @When("Kullanici sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        sumeyyePage.ilkSignInButton.click();
        
    }

    @Then("Kullanici username butonunun gorunur oldugunu oldugunu test eder")
    public void kullaniciUsernameButonununGorunurOldugunuOldugunuTestEder() {
        Assert.assertTrue(sumeyyePage.patientSignButton.isDisplayed());
        sumeyyePage.patientSignButton.click();

    }


    @And("Kullanici gecerli bir username girer")
    public void kullaniciGecerliBirUsernameGirer() {
        sumeyyePage.patientUserName8.sendKeys("hasta81proje");

    }

    @When("Kullanici password butonunun gorunur oldugunu oldugunu test eder")
    public void kullaniciPasswordButonununGorunurOldugunuOldugunuTestEder() {
        Assert.assertTrue(sumeyyePage.patientpassword8.isDisplayed());

    }

    @And("Kullanici gecerli bir password girer")
    public void kullaniciGecerliBirPasswordGirer() {
        sumeyyePage.patientpassword8.click();
        sumeyyePage.patientpassword8.sendKeys("qa123456789!");

    }

    @Then("Kullanici ikinci sign in butonun gorunur oldugunu test eder")
    public void kullaniciIkinciSignInButonunGorunurOldugunuTestEder() {
        Assert.assertTrue(sumeyyePage.ikinciSignInButton.isDisplayed());

    }

    @When("Kullanici ikinci sign in butonuna tiklar")
    public void kullaniciIkinciSignInButonunaTiklar() {
        sumeyyePage.ikinciSignInButton.click();

    }

    @Then("Kullanici MY PAGES\\(PATIENT) butonunun gorunur oldugunu test eder")
    public void kullaniciMYPAGESPATIENTButonununGorunurOldugunuTestEder() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sumeyyePage.myPagesButton.isDisplayed());

    }

    @When("Kullanici MY PAGES\\(PATIENT) butonuna tiklar")
    public void kullaniciMYPAGESPATIENTButonunaTiklar() {
        sumeyyePage.myPagesButton.click();
    }


    @Then("Kullanici My Appointments butonunun gorunur oldugunu test eder")
    public void kullaniciMyAppointmentsButonununGorunurOldugunuTestEder() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sumeyyePage.myAppointmentsButton.isDisplayed());


    }


    @When("Kullanici My Appointments butonuna tiklar")
    public void kullaniciMyAppointmentsButonunaTiklar() {
        sumeyyePage.myAppointmentsButton.click();
    }

    @Then("Kullanici randevunun gorundugunu dogrular")
    public void kullaniciRandevununGorundugunuDogrular() {
        Assert.assertTrue(sumeyyePage.randevuTarihi.isDisplayed());

    }


    //25_TC08

    @Given("Hasta <sumeyyeUrl> 'e gider")
    public void hasta_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("sumeyyeUrl"));

    }


    @Then("Hasta MY PAGES\\(PATIENT) butonunun gorunur oldugunu test eder")
    public void hasta_my_pages_patient_butonunun_gorunur_oldugunu_test_eder() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sumeyyePage.myPagesButton.isDisplayed());

    }

    @When("H asta MY PAGES\\(PATIENT) butonuna tiklar")
    public void h_asta_my_pages_patient_butonuna_tiklar() {
        sumeyyePage.myPagesButton.click();
    }
    @Then("Hasta Make an Appointment butonunun gorunur oldugunu test eder")
    public void hasta_make_an_appointment_butonunun_gorunur_oldugunu_test_eder() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sumeyyePage.myAppointmentsButton.isDisplayed());

    }
    @When("H asta Make an Appointment butonuna tiklar")
    public void h_asta_make_an_appointment_butonuna_tiklar() {
        sumeyyePage.myAppointmentsButton.click();
    }
    @Then("H asta Phone butonunun gorunur oldugunu test eder")
    public void h_asta_phone_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.phoneButton.isDisplayed());


    }
    @Then("H asta gecerli bir telefon numarasi girer")
    public void h_asta_gecerli_bir_telefon_numarasi_girer() {
        sumeyyePage.phoneButton.sendKeys("555-555-5555" + Keys.ENTER);

    }

    @Then("H asta Appointment DateTime butonunun gorunur oldugunu test eder")
    public void h_asta_appointment_date_time_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.dateButton.isDisplayed());

    }
    @When("H asta Appointment DateTime butonuna tiklar")
    public void h_asta_appointment_date_time_butonuna_tiklar() {
        sumeyyePage.dateButton.click();
    }
    @When("H asta guncel bir tarih girer")
    public void h_asta_guncel_bir_tarih_girer() {
        sumeyyePage.guncelRandevuTarihi.sendKeys("29.11.22" + Keys.ENTER);



    }
    @Then("H asta Send an Appointment Request butonunun gorunur oldugunu test eder")
    public void h_asta_send_an_appointment_request_butonunun_gorunur_oldugunu_test_eder() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.sendAnAppointmentRequestButton);

        Assert.assertTrue(sumeyyePage.sendAnAppointmentRequestButton.isDisplayed());
    }


    @When("H asta Send an Appointment Request butonuna tiklar")
    public void h_asta_send_an_appointment_request_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        sumeyyePage.sendAnAppointmentRequestButton.click();

    }
    @Then("Hasta ekranda {string} yazisini gorerek randevu alindigini dogrular")
    public void hasta_ekranda_yazisini_gorerek_randevu_alindigini_dogrular(String string) {
        Assert.assertTrue(sumeyyePage.popUpMessage.isDisplayed());

    }


    //US25_TC09
    @Then("Hasta Appointment DateTime butonunun gorunur oldugunu test eder")
    public void hastaAppointmentDateTimeButonununGorunurOldugunuTestEder() throws InterruptedException {

        Driver.getDriver().navigate().back();
        sumeyyePage.phoneButton.sendKeys("555-555-5555" + Keys.ENTER);
        Thread.sleep(3000);
        sumeyyePage.gelecekRandevuTarihi.sendKeys("29.11.22" + Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.sendAnAppointmentRequestButton);

        Thread.sleep(3000);
        sumeyyePage.sendAnAppointmentRequestButton.click();


    }
    @When("Hasta Appointment DateTime butonuna tiklar")
    public void hastaAppointmentDateTimeButonunaTiklar() {

    }
    @And("Hasta gelecekteki bir tarih girer")
    public void hastaGelecektekiBirTarihGirer() throws InterruptedException {
        sumeyyePage.gelecekRandevuTarihi.sendKeys("29.11.22" + Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.sendAnAppointmentRequestButton);

        Thread.sleep(3000);
    }

    @Then("Hasta ekranda {string} yazisini görerek randevu alindigini dogrular")
    public void hastaEkrandaAppointmentRegistrationSavedWeWillCallYouAsSoonAsPossibleYazisiniGörerekRandevuAlindiginiDogrular() {

        Assert.assertTrue(sumeyyePage.popUpMessage.isDisplayed());
    }



    // US25_TC10


    @When("Hasta my PAGES\\(PATIENT) butonuna tiklar")
    public void hastaMyPAGESPATIENTButonunaTiklar() {

        sumeyyePage.myPagesButton.click();
    }

    @When("Hasta make an Appointment butonuna tiklar")
    public void hastaMakeAnAppointmentButonunaTiklar() {
        sumeyyePage.makeAnAppointmentButton.click();

    }

    @Then("Hasta gecerli bir Telefon numarasi girer")
    public void hasta_gecerli_bir_Telefon_numarasi_girer() {
        sumeyyePage.phoneButton.sendKeys("555-555-5555" + Keys.ENTER);
    }


    @When("Hasta Appointment dateTime butonuna tiklar")
    public void hasta_appointment_date_time_butonuna_tiklar() {
       sumeyyePage.dateButton.click();
    }



    @And("Hasta Appointment DateTime'a tarihi istenilen sekilde yazar")
    public void hastaAppointmentDateTimeATarihiIstenilenSekildeYazar() {
        sumeyyePage.gelecekRandevuTarihi.sendKeys("29.11.22" + Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", sumeyyePage.dateButton);

    }

    @Then("Hasta Send an appointment Request butonunun gorunur oldugunu test eder")
    public void hasta_send_an_appointment_equest_butonunun_gorunur_oldugunu_test_eder() {

    }
    @When("Hasta Send an appointment Request butonuna tiklar.")
    public void hastaSendAnAppointmentRequestButonunaTiklar() {
        sumeyyePage.sendAnAppointmentRequestButton.click();
    }
    @Then("Hasta Ekranda {string} yazisini görerek randevu alindigini dogrular")
    public void hasta_ekranda_yazisini_görerek_randevu_alindigini_dogrular(String string) {
        Assert.assertTrue(sumeyyePage.popUpMessage.isDisplayed());
    }



}
