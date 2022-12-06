package stepDefinitions.uiStepDef;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.SumeyyePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_026_StepDefinitions {

    SumeyyePage sumeyyePage=new SumeyyePage();


    //26_TC01

    @Given("Kullanici baseUrl sayfasina gider")
    public void kullaniciHttpsMedunnaComSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("sumeyyeUrl"));

    }


    @Then("Kullanici CONTACT butonunun gorunur oldugunu test eder")
    public void kullanici_contact_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.contactButton.isDisplayed());

          }
    @When("Kullanici CONTACT butonuna tiklar")
    public void kullanici_contact_butonuna_tiklar() {
        sumeyyePage.contactButton.click();
          }
    @Then("Kullanici acilan sayfanin CONTACT sayfasini oldugunu dogrular")
    public void kullanici_acilan_sayfanin_contact_sayfasini_oldugunu_dogrular() {
        Assert.assertEquals("Contact", sumeyyePage.contactButton.getText());
    }




    //26_TC02



    @Given("Kullanici Name butonunun gorunur oldugunu test eder")
    public void kullanici_name_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.contactNameButton.isDisplayed());

    }
    @When("Kullanici Name butonuna tiklar")
    public void kullanici_name_butonuna_tiklar() {
        sumeyyePage.contactNameButton.click();
    }
    @When("Kullanici gecerli bir isim girer")
    public void kullanici_gecerli_bir_isim_girer() {
        sumeyyePage.contactNameButton.sendKeys("hasta81proje");

    }
    @Then("Kullanici Email butonunun gorunur oldugunu test eder")
    public void kullanici_email_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.contactEmailButton.isDisplayed());

    }
    @When("Kullanici Email butonuna tiklar")
    public void kullanici_email_butonuna_tiklar() {
        sumeyyePage.contactNameButton.click();

    }
    @When("Kullanici gecerli bir Email girer")
    public void kullanici_gecerli_bir_email_girer() {
        sumeyyePage.contactNameButton.sendKeys("hasta81proje@gmail.com");

    }
    @Then("Kullanici Subject butonunun gorunur oldugunu test eder")
    public void kullanici_subject_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.contactSubjectButton.isDisplayed());

    }
    @When("Kullanici Subject butonuna tiklar")
    public void kullanici_subject_butonuna_tiklar() {
        sumeyyePage.contactSubjectButton.click();

    }
    @When("Kullanici gecerli bir Subject girer")
    public void kullanici_gecerli_bir_subject_girer() {

        sumeyyePage.contactNameButton.sendKeys("depression");

    }
    @Then("Kullanici Message butonunun gorunur oldugunu test eder")
    public void kullanici_message_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.contactMessageButton.isDisplayed());

    }
    @When("Kullanici Message butonuna tiklar")
    public void kullanici_message_butonuna_tiklar() {
        sumeyyePage.contactMessageButton.click();
    }
    @When("Kullanici herhangi bir mesaj girer")
    public void kullanici_herhangi_bir_mesaj_girer() {
        sumeyyePage.contactNameButton.sendKeys("Depression.");

    }
    @Then("Kullanici Send butonunun gorunur oldugunu test eder")
    public void kullanici_send_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.contactSendButton.isDisplayed());

    }
    @When("Kullanici Send butonuna tiklar")
    public void kullanici_send_butonuna_tiklar() {
        sumeyyePage.contactSendButton.click();
    }
    @Then("Kullanici dogrulama mesajinin {string} icerdigini test eder")
    public void kullanici_dogrulama_mesajinin_icerdigini_test_eder(String string) {

        Assert.assertTrue(sumeyyePage.popUpMessageSend.isDisplayed());


    }
    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.quiteDriver();
    }


}
