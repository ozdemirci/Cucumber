package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.RecepPage;

import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class US_018_StepDefinitions {
    RecepPage us18_page = new RecepPage();

    Actions actions = new Actions(Driver.getDriver());

    public US_018_StepDefinitions() throws AWTException {
    }

    @And("Kullanici SignIn butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        us18_page.account.click();
        us18_page.signIn.click();

    }

    @And("Admin olarak daha önceden aldigi Usarname ve Passwordunu belirtilen kutucuklara girer ve sign in butonuna tiklar.")
    public void adminOlarakDahaÖncedenAldigiUsarnameVePasswordunuBelirtilenKutucuklaraGirerVeSignInButonunaTiklar() throws InterruptedException {
        us18_page.username.sendKeys("Batch81");
        actions.sendKeys(Keys.TAB).perform();
        us18_page.password.sendKeys("Batch81+");
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        us18_page.signIn2.click();
        Thread.sleep(3000);
    }

    @And("Kullanıcı admin olarak öğeler ve ünvanlar sekmesini tıklar ve gelen şıklardan physician secer ve tıklar.")
    public void kullanıcıAdminOlarakÖğelerVeÜnvanlarSekmesiniTıklarVeGelenŞıklardanPhysicianSecerVeTıklar() throws InterruptedException {
        us18_page.items.click();
        Thread.sleep(2000);
        us18_page.physician.click();
        Thread.sleep(5000);
        //actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).perform();

    }

    @And("Admin Doktorlar sayfasinda bütün doktorlarin bilgilerinin görülebildiğini  test  eder.")
    public void adminDoktorlarSayfasindaBütünDoktorlarinBilgilerininGörülebildiğiniTestEder() {
        String expectedText = "Physicians";
        String actualText = us18_page.phstext.getText();
        Assert.assertEquals("Phscians Değil", expectedText, actualText);
    }


    @And("Admin Create or edit a Physician sayfasında mevcut kullanıcılar arasından SSN kimliğine göre kayıtlı bir doktoru seçer ve  arar.")
    public void adminCreateOrEditAPhysicianSayfasındaMevcutKullanıcılarArasındanSSNKimliğineGöreKayıtlıBirDoktoruSeçerVeArar() throws InterruptedException {
        us18_page.creatPhysician.click();
        Thread.sleep(2000);
        us18_page.useSearch.click();
        actions.sendKeys(Keys.TAB).sendKeys("123-45-8969").sendKeys(Keys.TAB).perform();
        us18_page.searchUser.click();
    }



    @And("Kullanıcı admin olarak Create or edit a Physician sayfasında doktorların bilgilerini  düzenler.")
    public void kullanıcıAdminOlarakCreateOrEditAPhysicianSayfasındaDoktorlarınBilgileriniDüzenler() throws InterruptedException {
        us18_page.creatPhysician.click();
        Thread.sleep(2000);
    }



    @And("Kişilerin {string} bilgileri doldurabilir.")
    public void kişilerinBilgileriDoldurabilir(String arg0) throws InterruptedException {
        us18_page.searchUser.sendKeys("564-23-1234");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Hafsa").
                sendKeys(Keys.TAB).sendKeys("Dar").sendKeys(Keys.TAB).
                sendKeys("24.11.2022").sendKeys(Keys.TAB).sendKeys("+905555555").
                sendKeys(Keys.TAB).sendKeys("izmir/Turkey").sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).sendKeys(Keys.ALT).sendKeys(Keys.ENTER).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);

    }

    @And("Admin Doktor için bir uzmanlık alanı seçer.")
    public void adminDoktorIçinBirUzmanlıkAlanıSeçer() throws InterruptedException {
        us18_page.searchUser.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(4000);
        us18_page.uzm.click();
        Thread.sleep(2000);
    }

    @And("Admin, doktorun profil resmini sağlayabilir.")
    public void adminDoktorunProfilResminiSağlayabilir() throws InterruptedException {
        us18_page.searchUser.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
        // String dosyaYolu = "C:\\Users\\Windows10\\Desktop\\20221019_112216.jpg";
        //us18_page.photo.click();
        //us18_page.dosyaYolu.click();
    }

    @And("Admin, doktorun Muayene ücretini girebilmelidir. \\(Exam fee)")
    public void adminDoktorunMuayeneÜcretiniGirebilmelidirExamFee() {
        us18_page.searchUser.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("5000").perform();

    }

    @And("Admin Create or edit a Physician sayfasında mevcut kullanıcılar arasından doktoru seçer.")
    public void adminCreateOrEditAPhysicianSayfasındaMevcutKullanıcılarArasındanDoktoruSeçer() throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i <4 ; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL); //CTRL ye tiklandi
            robot.keyPress(KeyEvent.VK_SUBTRACT); // - ye tiklandi
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // CTRL yi birakti
            robot.keyRelease(KeyEvent.VK_CONTROL); //- yi birakti
            // CTRL (-) ye basılarak ekran belirlenen miktarda küçültülmüş oldu.
        }
    }

    @And("Kullanıcı admin olarak öğeler ve ünvanlar sekmesini tıklar ve gelen şıklardan doktor öğesini seçer ve tıklar.")
    public void kullanıcıAdminOlarakÖğelerVeÜnvanlarSekmesiniTıklarVeGelenŞıklardanDoktorÖğesiniSeçerVeTıklar() throws AWTException {
        us18_page.edit2.click();



    }

    @And("Admin mevcut doktorları silebilir.")
    public void adminMevcutDoktorlarıSilebilir() {
        us18_page.delete.click();
    }


    @And("Kullanıcı Physicians sayfasında Edit butonuna tıklar.")
    public void kullanıcıPhysiciansSayfasındaEditButonunaTıklar() {
    }
}
