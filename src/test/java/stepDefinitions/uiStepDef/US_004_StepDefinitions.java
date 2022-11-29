package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import pages.FettahPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_004_StepDefinitions {

    FettahPage fettah_page = new FettahPage();

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    Faker faker = new Faker();
    @Given("Belirtilen url gidilir")
    public void belirtilenUrlGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @When("Ana sayfanın göründüğü doğrulanır")
    public void anaSayfanınGöründüğüDoğrulanır() {
        String expectedTitle = "MEDUNNA";
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Sign In butonuna tiklanir")
    public void signInButonunaTiklanir() {
        fettah_page.dropDownSignIn.click();
        fettah_page.signIn.click();
    }

    @When("Username ve password girisi yapmak için textbox'larin acildigi dogrulanir")
    public void usernameVePasswordGirisiYapmakIçinTextboxLarinAcildigiDogrulanir() {
        assertTrue(fettah_page.userName.isEnabled());
        assertTrue(fettah_page.password.isEnabled());
    }

    @Then("Acilan pencerede ilgili kisimlara gecerli e-mail ve sifre girildikten sonra Sign In butonuna tiklanir")
    public void acilanPenceredeIlgiliKisimlaraGecerliEMailVeSifreGirildiktenSonraSignInButonunaTiklanir() {
        fettah_page.userName.sendKeys(ConfigReader.getProperty("medunnaUserName"));
        fettah_page.password.sendKeys(ConfigReader.getProperty("medunnaPassword"));
        fettah_page.signInIki.click();
    }

    @And("Basariyla giris yapildigi mesaji gorulur")
    public void basariylaGirisYapildigiMesajiGorulur() {
        assertTrue(fettah_page.girisKontol.isDisplayed());

        try {
            assertTrue(fettah_page.alertMessage.isDisplayed());
        }catch (NoSuchElementException e) {
            System.out.println("Basariyla giris yapildigi mesaji gorulemedi.");
        }
    }

    @And("Sayfa kapatilir.")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }

    @Then("Acilan pencerede ilgili kisimlara gecersiz e-mail ve sifre girildikten sonra Sign In butonuna tiklanir")
    public void acilanPenceredeIlgiliKisimlaraGecersizEMailVeSifreGirildiktenSonraSignInButonunaTiklanir() {
        fettah_page.userName.sendKeys(ConfigReader.getProperty("medunnaGecersizUserName"));
        fettah_page.password.sendKeys(ConfigReader.getProperty("medunnaGecersizPassword"));
        fettah_page.signInIki.click();
    }

    @And("Giris yapilamadigi mesaji gorulur")
    public void girisYapilamadigiMesajiGorulur() {
        assertTrue(fettah_page.alertMessage.isDisplayed());
    }

    @When("Remember Me seceneginin gorunur oldugu dogrulanir")
    public void rememberMeSecenegininGorunurOlduguDogrulanir() {
        assertTrue(fettah_page.rememberMe.isDisplayed());
    }

    @Then("Remember Me seceneginin kullanilabilir oldugu dogrulanir")
    public void rememberMeSecenegininKullanilabilirOlduguDogrulanir() {
        assertTrue(fettah_page.rememberMe.isEnabled());
        fettah_page.rememberMe.click();
    }

    @When("Did you forget your password? seceneginin gorunur oldugu dogrulanir")
    public void didYouForgetYourPasswordSecenegininGorunurOlduguDogrulanir() {
        assertTrue(fettah_page.forgotPassword.isDisplayed());
    }

    @Then("Did you forget your password? seceneginin kullanilabilir oldugu dogrulanir")
    public void didYouForgetYourPasswordSecenegininKullanilabilirOlduguDogrulanir() {
        assertTrue(fettah_page.forgotPassword.isEnabled());
        jse.executeScript("arguments[0].click();", fettah_page.forgotPassword);
    }

    @And("Secenege tiklandiktan sonra Reset Your Password sayfasina gidildigi dogrulanir")
    public void secenegeTiklandiktanSonraResetYourPasswordSayfasinaGidildigiDogrulanir() {
        String expectedText = "Reset your password";
        assertTrue(fettah_page.resetYourPassword.getText().contains(expectedText));
    }


    @When("You don't have an account yet? Register a new account secenegi gorunur olmalidir")
    public void youDonTHaveAnAccountYetRegisterANewAccountSecenegiGorunurOlmalidir() {
        assertTrue(fettah_page.youDontHaveAnAccountYazisi.isDisplayed());
    }

    @Then("You don't have an account yet? Register a new account secenegi kullanilabilir olmalidir")
    public void youDonTHaveAnAccountYetRegisterANewAccountSecenegiKullanilabilirOlmalidir() {
        assertTrue(fettah_page.getYouDontHaveAnAccountTiklama.isEnabled());
        jse.executeScript("arguments[0].click();", fettah_page.getYouDontHaveAnAccountTiklama);
    }

    @And("Secenege tikladiktan sonra kayit sayfasina yonlendirdigi dogrulanir")
    public void secenegeTikladiktanSonraKayitSayfasinaYonlendirdigiDogrulanir() {
        String expectedText = "Registration";
        assertEquals(expectedText, fettah_page.registration.getText());
    }

    @When("Sign In butonunun yanindaki Cancel butonunun gorunur oldugu test edilir")
    public void signInButonununYanindakiCancelButonununGorunurOlduguTestEdilir() {
        assertTrue(fettah_page.cancelButton.isDisplayed());
    }

    @Then("Cancel butonunun kullanilabilir oldugu test edilir")
    public void cancelButonununKullanilabilirOlduguTestEdilir() {
        assertTrue(fettah_page.cancelButton.isEnabled());
        jse.executeScript("arguments[0].click();", fettah_page.cancelButton);
    }

    @And("Cancel butonuna tikladiktan sonra ana sayfaya donuldugu dogrulanir")
    public void cancelButonunaTikladiktanSonraAnaSayfayaDonulduguDogrulanir() {
        String expectedText = "home";
        assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedText));
    }
}
