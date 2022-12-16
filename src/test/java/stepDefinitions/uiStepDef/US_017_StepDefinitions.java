package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.RecepPage;

import utilities.ConfigReader;
import utilities.Driver;

public class US_017_StepDefinitions {
    RecepPage us17_page = new RecepPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici https:{string} adresine gider")
    public void kullaniciHttpsAdresineGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(arananUrl));
    }

    @And("Kullanici Sign in butonuna tiklar.")
    public void kullaniciSignInButonunaTiklar() {
        us17_page.account.click();
        us17_page.signIn.click();
    }

    @And("Admin olarak daha onceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.")
    public void adminOlarakDahaOncedenAldigiUsarnameVePasswordunuBelirtilenKutucuklaraGirerVeSignInButonunaTiklar() throws InterruptedException {
        us17_page.username.sendKeys("Batch81");
        actions.sendKeys(Keys.TAB).perform();
        us17_page.password.sendKeys("Batch81+");
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        us17_page.signIn2.click();
    }

    @And("Kullanici admin olarak ogeler ve unvanlar sekmesini tiklar ve gelen siklardan test ogesini secer ve tiklar.")
    public void kullaniciAdminOlarakOgelerVeUnvanlarSekmesiniTiklarVeGelenSiklardanTestOgesiniSecerVeTiklar() {
        us17_page.Items.click();
        us17_page.testItem.click();
    }

    @And("Admin Test items sayfasindan \"Yeni bir Test ogesi oluşturu tiklar.")
    public void adminTestItemsSayfasindanYeniBirTestOgesiOluşturuTiklar() throws Throwable {
        Thread.sleep(2000);
        us17_page.creatItem.click();
    }

    @When("Admin yeni test ogeleri oluşturabilir oldugunu test eder.")
    public void adminYeniTestOgeleriOluşturabilirOldugunuTestEder() throws InterruptedException {
        Thread.sleep(2000);
        us17_page.nameLabel.sendKeys("Mercan");
        actions.sendKeys(Keys.TAB).sendKeys("Doctor").sendKeys(Keys.TAB).sendKeys("1000").
                sendKeys(Keys.TAB).sendKeys("13").sendKeys(Keys.TAB).sendKeys("16").perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        us17_page.save1.click();
    }

    @When("Admin Yeni Test Öğeleri sayfasında İsim, Tanım, Fiyat, Varsayılan Min. Değer, Varsayılan Maks. Değer, Oluşturulma Tarihi gibi bilgileri girilebilir olduğunu test eder.")
    public void adminYeniTestÖğeleriSayfasındaİsimTanımFiyatVarsayılanMinDeğerVarsayılanMaksDeğerOluşturulmaTarihiGibiBilgileriGirilebilirOlduğunuTestEder() throws InterruptedException {
        Thread.sleep(2000);
        //Driver.getDriver().manage().window().setSize(new Dimension(600,300));
        us17_page.nameLabel.sendKeys("Fahld");
        actions.sendKeys(Keys.TAB).sendKeys("Doctor").sendKeys(Keys.TAB).sendKeys("1000").
                sendKeys(Keys.TAB).sendKeys("13").sendKeys(Keys.TAB).sendKeys("16").perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(4000);
        us17_page.save3.click();
        Thread.sleep(2000);
    }

    @And("Admin sayfanın en altındaki Test ogeleri son sayfaya giderek girdiği bilgiler kontrol eder ve güncelleme butonuyla güncelleme yapar.")
    public void adminSayfanınEnAltındakiTestOgeleriSonSayfayaGiderekGirdiğiBilgilerKontrolEderVeGüncellemeButonuylaGüncellemeYapar() throws InterruptedException {
        us17_page.ID.click();
        us17_page.edit.click();
        us17_page.name.sendKeys("Medine");
        actions.sendKeys(Keys.TAB).sendKeys("Hasta").sendKeys(Keys.TAB).sendKeys("1001").
                sendKeys(Keys.TAB).sendKeys("14").sendKeys(Keys.TAB).sendKeys("15").perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us17_page.save2.click();
    }


    @And("Admin Test ogeleri son sayfaya giderek girdiği bilgiyi kontrol eder.")
    public void adminTestOgeleriSonSayfayaGiderekGirdiğiBilgiyiKontrolEder() throws InterruptedException {
        Thread.sleep(7000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        us17_page.ssayfa.click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        us17_page.edit.click();
        us17_page.name.sendKeys("Arzu");
        actions.sendKeys(Keys.TAB).sendKeys("Hasta").sendKeys(Keys.TAB).sendKeys("1001").
                sendKeys(Keys.TAB).sendKeys("14").sendKeys(Keys.TAB).sendKeys("15").perform();
        Thread.sleep(2000);
        us17_page.save2.click();
    }

    @And("Admin Test ogeleri son sayfaya giderek test öğelerini siler.")
    public void adminTestOgeleriSonSayfayaGiderekTestÖğeleriniSiler() {

        us17_page.delete.click();
    }


    @And("Admin sayfayi kapatir")
    public void adminSayfayiKapatir() {
        Driver.closeDriver();

    }
}
