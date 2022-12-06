package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.FettahPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_006_StepDefinitions {

    FettahPage fettah_page = new FettahPage();

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    Faker faker = new Faker();
    @Given("Belirtilen URL'e gidilir")
    public void belirtilenURLEGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @When("Ana sayfanın göründüğü doğrulanir")
    public void anaSayfanınGöründüğüDoğrulanir() {
        String expectedTitle = "MEDUNNA";
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Then("Sing In butonuna tiklanir")
    public void singInButonunaTiklanir() {
        fettah_page.dropDownSignIn.click();
        fettah_page.signIn.click();
    }

    @And("Acilan pencerede ilgili kisimlara geçerli e-mail ve şifre girildikten sonra Sign In butonuna tiklanir")
    public void acilanPenceredeIlgiliKisimlaraGeçerliEMailVeŞifreGirildiktenSonraSignInButonunaTiklanir() {
        fettah_page.userName.sendKeys(ConfigReader.getProperty("medunnaUserName"));
        fettah_page.password.sendKeys(ConfigReader.getProperty("medunnaPassword"));
        fettah_page.signInIki.click();
    }

    @And("Kullanicinin giris yaptigi dogrulanir")
    public void kullanicininGirisYaptigiDogrulanir() {
        assertTrue("Giris yapilamadi", fettah_page.girisKontol.isDisplayed());
    }

    @And("Settings secenegine tiklanir")
    public void settingsSecenegineTiklanir() {
        fettah_page.girisKontol.click();
        fettah_page.dropDownSettings.click();
    }

    @When("First Name in girerken kullanilan first name bilgisi oldugu dogrulanir")
    public void firstNameInGirerkenKullanilanFirstNameBilgisiOlduguDogrulanir() {
        String actualName = fettah_page.firstName.getAttribute("value");
        String expectedName = "Hasta Faruk";
        assertEquals(actualName, expectedName);
    }



    @When("Last Name in girerken kullanilan last name bilgisi oldugu dogrulanir")
    public void lastNameInGirerkenKullanilanLastNameBilgisiOlduguDogrulanir() {
        String actualLastName = fettah_page.lastName.getAttribute("value");
        String expectedLastName = "Kaya";
        assertEquals(actualLastName, expectedLastName);
    }

    @When("Email in girerken kullanilan email bilgisi oldugu dogrulanir")
    public void emailInGirerkenKullanilanEmailBilgisiOlduguDogrulanir() {
        String actualEmail = fettah_page.email.getAttribute("value");
        String expectedEmail = "farukkaya35@gmail.com";
        assertEquals(actualEmail, expectedEmail);
    }

    @Then("Sayfa kapatilir")
    public void sayfaKapatilir() {

            Driver.closeDriver();
    }

    @When("First Name kutucuguna tiklanir")
    public void firstNameKutucugunaTiklanir() {
        fettah_page.firstName.click();
    }

    @Then("Belirtilen yeni first name yazilir")
    public void belirtilenYeniFirstNameYazilir() {
        fettah_page.firstName.clear();
        fettah_page.firstName.sendKeys(ConfigReader.getProperty("medunnaYeniHastaAdi"));
    }

    @And("First Name in guncellendigi dogrulanir")
    public void firstNameInGuncellendigiDogrulanir() {
        String actualFirstName = fettah_page.firstName.getAttribute("value");
        String expectedFirstName = ConfigReader.getProperty("medunnaYeniHastaAdi");
        assertEquals(expectedFirstName, actualFirstName);
        System.out.println(expectedFirstName);
    }

    @When("Last Name kutucuguna tiklanir")
    public void lastNameKutucugunaTiklanir() {
        fettah_page.lastName.click();
    }

    @Then("Belirtilen yeni last name yazilir")
    public void belirtilenYeniLastNameYazilir() {
        fettah_page.lastName.clear();
        fettah_page.lastName.sendKeys(ConfigReader.getProperty("medunnaYeniHastaSoyadi"));
    }

    @And("Last Name in guncellendigi dogrulanir")
    public void lastNameInGuncellendigiDogrulanir() {
        String actualLastName = fettah_page.lastName.getAttribute("value");
        String expectedLastName = ConfigReader.getProperty("medunnaYeniHastaSoyadi");
        assertEquals(expectedLastName, actualLastName);
    }

    @When("Email kutucuguna tiklanir")
    public void emailKutucugunaTiklanir() {
        fettah_page.email.click();
    }

    @Then("Belirtilen yeni email yazilir")
    public void belirtilenYeniEmailYazilir() {
        fettah_page.email.clear();
        fettah_page.email.sendKeys(ConfigReader.getProperty("medunnaYeniHastaEmail"));
    }

    @And("Email in guncellendigi dogrulanir")
    public void emailInGuncellendigiDogrulanir() {
        String actualEmail = fettah_page.email.getAttribute("value");
        String expectedEmail = ConfigReader.getProperty("medunnaYeniHastaEmail");
        assertEquals(expectedEmail, actualEmail);
    }
}
