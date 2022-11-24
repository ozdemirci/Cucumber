package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Fatih_Page;
import utilities.Driver;

public class US_020_StepDefinitions {
    Fatih_Page fatih_page=new Fatih_Page();
    @Then("Administration bolumunden User Management sekmesine tıklar")
    public void administrationBolumundenUserManagementSekmesineTıklar() throws InterruptedException {
        fatih_page.administrationButton.click();
        Thread.sleep(1000);
        fatih_page.userManagementButton.click();
    }

    @And("Kayıtlı kullanicilar listesinde ki satirda yer alan View bolumune tiklar")
    public void kayıtlıKullanicilarListesindeKiSatirdaYerAlanViewBolumuneTiklar() {
        fatih_page.viewButton.click();
    }

    @And("Gelen kullanici bilgilerinde firstname, lastname, email bilgilerinin goruldugunu test eder")
    public void gelenKullaniciBilgilerindeFirstnameLastnameEmailBilgilerininGoruldugunuTestEder() {
       Assert.assertTrue(fatih_page.userFirstName.isDisplayed());
       Assert.assertTrue(fatih_page.userLastName.isDisplayed());
       Assert.assertTrue(fatih_page.userEmail.isDisplayed());
    }


    @And("Edit butonuna tiklar")
    public void editButonunaTiklar() {
        fatih_page.editButton.click();
    }


    @And("Kullanici activated secenegini secerek kullanici aktive edebilir")
    public void kullaniciActivatedSeceneginiSecerekKullaniciAktiveEdebilir() {
        fatih_page.activatedClick.isSelected();
    }

    @And("kullanici bilgilerinde yer alan profil sekmesinden rol degisikligi yapabilir.")
    public void kullaniciBilgilerindeYerAlanProfilSekmesindenRolDegisikligiYapabilir() throws InterruptedException {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(fatih_page.profileDdmAdmin.isDisplayed());
        Thread.sleep(1000);
        Assert.assertTrue(fatih_page.profileDDmUser.isDisplayed());
        Thread.sleep(1000);
        Assert.assertTrue(fatih_page.profileDDmPatient.isDisplayed());
        Thread.sleep(1000);
        Assert.assertTrue(fatih_page.profileDDmStaff.isDisplayed());
        Thread.sleep(1000);
        Assert.assertTrue(fatih_page.profileDDmPhysician.isDisplayed());



    }
}
