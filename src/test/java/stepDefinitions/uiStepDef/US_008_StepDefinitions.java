package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EsraPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_008_StepDefinitions {
    EsraPage page = new EsraPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("Kullanici Medunna  sayfa url`sine gider")
    public void kullanici_medunna_sayfa_url_sine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
    }

    @When("Kullanici profil simgesine tiklar")
    public void kullanici_profil_simgesine_tiklar() {
        page.accountMenu.click();

    }

    @Then("Kullanici Sign in sekmesine tiklar")
    public void kullanici_sign_in_sekmesine_tiklar() {
        page.signIn.click();
    }

    @Then("Kullanici gecerli bir username ve password girer")
    public void kullanici_gecerli_bir_username_ve_password_girer() {
        page.usernameAshley.sendKeys(ConfigReader.getProperty("usernameAshley"));
        page.passwordAshley.sendKeys(ConfigReader.getProperty("passwordAshley"));

    }

    @Then("Kullanici Sign in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {
        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).perform();
    }

    @Then("Kullanici profil sekmesinden Password`a tiklar")
    public void kullanici_profil_sekmesinden_password_a_tiklar() {
        page.profilMenu.click();
        page.passwordButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanici current passwordu girer")
    public void kullanici_current_passwordu_girer() {
        page.currentPassword.sendKeys(ConfigReader.getProperty("currentPassword"));
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici new password girer")
    public void kullaniciNewPasswordGirer() {
        page.newPassword.click();
        page.newPassword.sendKeys(ConfigReader.getProperty("newPassword"));
        ReusableMethods.waitFor(2);
        page.savePasswordButton.click();
    }

    @Then("Kullanici new password confirmation onaylandigini gorur")
    public void kullanici_new_password_confirmation_onaylandigini_gorur() {
        page.comfirmPasswords.click();
        page.comfirmPasswords.sendKeys(ConfigReader.getProperty("newPassword"));
        page.savePasswordButton.click();
        ReusableMethods.waitFor(2);


        // sifre bir onceki adimlarda degisti, sonraki TC`lerin calisabilmesi icin eski haline aliyoruz
        // gecerli sifre "ashley" olarak tum US calisacak

        page.currentPassword.click(); page.currentPassword.clear();page.currentPassword.sendKeys("Ashley");
        ReusableMethods.waitFor(2);

        page.newPassword.click(); page.newPassword.clear(); page.newPassword.sendKeys("ashley");
        ReusableMethods.waitFor(2);

        page.comfirmPasswords.click(); page.comfirmPasswords.clear(); page.comfirmPasswords.sendKeys("ashley");
        ReusableMethods.waitFor(2);

        page.savePasswordButton.click(); ReusableMethods.waitFor(2); Assert.assertTrue(page.succesNewButton.isDisplayed());
        ReusableMethods.waitFor(1);


    }

    @Then("Kullanici daha guclu sifre icin kucuk harf {string} kullanir")
    public void kullaniciDahaGucluSifreIcinKucukHarfKullanir(String kucukHarf) {

        ReusableMethods.jsclick(page.newPassword);
        page.newPassword.sendKeys(kucukHarf);

    }

    @And("Kullanici Password strength seviyesinin doorduncu cizgide oldugunu goruntuler")
    public void kullaniciPasswordStrengthSeviyesininDoorduncuCizgideOldugunuGoruntuler() {

        Assert.assertTrue(page.passStrength4.isDisplayed());


    }

    @Given("Kullanici daha guclu sifre icin buyuk harf {string} kullanir")
    public void kullaniciDahaGucluSifreIcinBuyukHarfKullanir(String buyukHarf) {

        ReusableMethods.jsclick(page.newPassword);
        page.newPassword.sendKeys(buyukHarf);

    }
    @Then("Kullanici Password strength seviyesinin ikinci cizgide oldugunu goruntuler")
    public void kullaniciPasswordStrengthSeviyesininIkinciCizgideOldugunuGoruntuler() {

        Assert.assertTrue(page.passStrength4.isDisplayed());
        ReusableMethods.waitFor(2);

    }

    @Given("Kullanici daha guclu sifre icin rakam {string} kullanir")
    public void kullaniciDahaGucluSifreIcinRakamKullanir(String rakam) {
        page.newPassword.click();
        page.newPassword.sendKeys(rakam);

    }

    @Then("Kullanici daha guclu sifre icin ozel karakter {string} kullanir")
    public void kullaniciDahaGucluSifreIcinOzelKarakterKullanir(String ozelKarakter) {
        page.newPassword.click();
        page.newPassword.sendKeys(ozelKarakter);
        ReusableMethods.waitFor(2);



    }
    @And("Kullanici Password strength seviyesinin besinci cizgide oldugunu goruntuler")
    public void kullaniciPasswordStrengthSeviyesininBesinciCizgideOldugunuGoruntuler() {
        Assert.assertTrue(page.passStrength5.isDisplayed());
        ReusableMethods.waitFor(2);

    }

    @Then("Kullanici {string}den olusan sifre girer")
    public void kullaniciDenOlusanSifreGirer(String enAz7Karakter) {
        page.newPassword.sendKeys(enAz7Karakter);
        ReusableMethods.waitFor(2);
    }


    @Then("Kullanici {string}den olusan bir sifre girer")
    public void kullaniciDenOlusanBirSifreGirer(String AzKarakter) {
        page.newPassword.sendKeys(AzKarakter);
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici guclu sifre olusmadigini goruntuler")
    public void kullaniciGucluSifreOlusmadiginiGoruntuler() {
        Assert.assertTrue(page.passStrength1.isDisplayed());
        ReusableMethods.waitFor(2);

    }



}
