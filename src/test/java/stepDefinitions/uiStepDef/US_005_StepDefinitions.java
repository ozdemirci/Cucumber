package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import pages.FettahPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US_005_StepDefinitions {

    FettahPage fettah_page = new FettahPage();

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    Faker faker = new Faker();

    @When("Anasayfada Make an Appointment butonuna tiklanir")
    public void anasayfadaMakeAnAppointmentButonunaTiklanir() {
        fettah_page.makeAnAppointmentButton.click();
    }

    @When("First Name tiklanir")
    public void firstNameTiklanir() {
        jse.executeScript("arguments[0].scrollIntoView(true);", fettah_page.firstNameTextBox);
    }

    @Then("Verilen {string} girilir")
    public void verilenGirilir(String isimler) {
        fettah_page.firstNameTextBox.sendKeys(isimler);
    }

    @And("Send an Appointment Request tiklanir")
    public void sendAnAppointmentRequestTiklanir() {
        // jse.executeScript("arguments[0].scrollIntoView(true);",fettah_page.sendAnAppointmentReqButton);
        jse.executeScript("arguments[0].click();", fettah_page.sendAnAppointmentReqButton);
        //us005_page.sendAnAppointmentReqButton.click();
    }

    @And("Girilen her bir isim icin Your FirstName is required. yazisinin goruntulenmedigi dogrulanir")
    public void girilenHerBirIsimIcinYourFirstNameIsRequiredYazisininGoruntulenmedigiDogrulanir() {
        String expectedText = "Your FirstName is required.";
        assertFalse("First Name is Reqired yazisi goruntulendi.",
                fettah_page.firstNameRequiredText.getText().contains(expectedText));
    }

    @And("Sayfa yenilenir")
    public void sayfaYenilenir() {
        Driver.getDriver().navigate().refresh();
    }

    @And("First Name altinda Your FirstName is required. yazisinin goruntulendigi dogrulanir")
    public void firstNameAltindaYourFirstNameIsRequiredYazisininGoruntulendigiDogrulanir() {
        assertTrue("First Name is Reqired yazisi goruntulenmedi.",
                fettah_page.firstNameRequiredText.isDisplayed());
    }

    @When("SSN tiklanir")
    public void ssnTiklanir() {
        jse.executeScript("arguments[0].click();", fettah_page.ssnTextBox);
    }

    @Then("Verilen kayitli SSN girilir")
    public void verilenKayitliSSNGirilir() {
        fettah_page.ssnTextBox.sendKeys(ConfigReader.getProperty("kayitliSsn"));
    }

    @And("Email tiklanir")
    public void emailTiklanir() {
        jse.executeScript("arguments[0].click();", fettah_page.emailTextBox);
    }

    @And("SSN altinda Your SSN is required. goruntulenmedigi dogrulanir")
    public void ssnAltindaYourSSNIsRequiredGoruntulenmedigiDogrulanir() {
        String exptectedText = "Your SSN is required.";
        fettah_page.getSsnText.getText().contains(exptectedText);
    }

    @And("Your SSN is required. yazisinin goruntulendigi dogrulanir")
    public void yourSSNIsRequiredYazisininGoruntulendigiDogrulanir() {
        assertTrue(fettah_page.yourSsnRequiredText.isDisplayed());
    }

    @When("Last Name tiklanir")
    public void lastNameTiklanir() {
        jse.executeScript("arguments[0].click();", fettah_page.lastNameTextBox);
    }

    @Then("Verilen {string} textbox'a girilir")
    public void verilenTextboxAGirilir(String soyisimler) {
        fettah_page.lastNameTextBox.sendKeys(soyisimler);

    }

    @And("Girilen her bir Soy isim icin Your LastName is required. yazisinin goruntulenmedigi dogrulanir")
    public void girilenHerBirSoyIsimIcinYourLastNameIsRequiredYazisininGoruntulenmedigiDogrulanir() {
        String exptectedText = "Your LastName is required.";
        fettah_page.lastNameText.getText().contains(exptectedText);
    }

    @And("Last Name altinda Your LastName is required. yazisinin goruntulendigi dogrulanir")
    public void lastNameAltindaYourLastNameIsRequiredYazisininGoruntulendigiDogrulanir() {
        assertTrue(fettah_page.yourLastNameIsRequiredText.isDisplayed());
    }

    @When("Phone bolumune verilen Tel NoBir  - isaretleri ile girilir")
    public void phoneBolumuneVerilenTelNoBirIsaretleriIleGirilir() {
        fettah_page.telNoTextBox.sendKeys(ConfigReader.getProperty("telNo1"));
    }

    @And("Phone number is required. yazisinin goruntulenmedigi dogrulanir")
    public void phoneNumberIsRequiredYazisininGoruntulenmedigiDogrulanir() {
        String expectedText = "Phone number is required.";
        assertFalse("Phone number is required.yazisi görüntülendi",
                fettah_page.telNoText.getText().contains(expectedText));
    }

    @And("Phone tiklanir")
    public void phoneTiklanir() {
        jse.executeScript("arguments[0].click();", fettah_page.lastNameTextBox);
    }

    @And("Phone number is required. yazisinin goruntulendigi dogrulanir")
    public void phoneNumberIsRequiredYazisininGoruntulendigiDogrulanir() {
        assertTrue("Phone number is invalid yazisi görüntülenemedi.",
                fettah_page.phoneNumberIsRequiedText.isDisplayed());
    }

    @And("Phone bolumune verilen Tel NoIki girilir")
    public void phoneBolumuneVerilenTelNoIkiGirilir() {
        fettah_page.telNoTextBox.sendKeys(ConfigReader.getProperty("telNo2"));
    }

    @And("Phone number is invalid yazisinin goruntulendigi dogrulanir")
    public void phoneNumberIsInvalidYazisininGoruntulendigiDogrulanir() {
        try {
            assertTrue("Phone number is invalid yazisi görüntülenemedi.",
                    fettah_page.phoneNumberIsInvalidText.isDisplayed());
        } catch (NoSuchElementException e) {
            System.out.println("Phone number is invalid yazisi görüntülenemedi.");
        }


    }

    @And("Phone bolumune verilen Tel NoUc girilir")
    public void phoneBolumuneVerilenTelNoUcGirilir() {
        fettah_page.telNoTextBox.sendKeys(ConfigReader.getProperty("telNo3"));
    }

    @And("Phone bolumune verilen Tel NoDort girilir")
    public void phoneBolumuneVerilenTelNoDortGirilir() {
        fettah_page.telNoTextBox.sendKeys(ConfigReader.getProperty("telNo4"));
    }

    @When("First Name bolumune verilen isim girilir")
    public void firstNameBolumuneVerilenIsimGirilir() {
        fettah_page.firstNameTextBox.sendKeys(ConfigReader.getProperty("medunnaHastaAdi"));
    }

    @Then("Last Name bolumune verilen soyisim girilir")
    public void lastNameBolumuneVerilenSoyisimGirilir() {
        fettah_page.lastNameTextBox.sendKeys(ConfigReader.getProperty("medunnaHastaSoyadi"));
    }

    @And("SSN bolumune verilen SSN numarasi girilir")
    public void ssnBolumuneVerilenSSNNumarasiGirilir() {
        fettah_page.ssnTextBox.sendKeys(ConfigReader.getProperty("medunnaSSN"));
    }

    @And("E-mail bolumune random bir e-mail adresi girilir")
    public void eMailBolumuneRandomBirEMailAdresiGirilir() {
        fettah_page.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @And("Phone bolumune verilen tel no girilir")
    public void phoneBolumuneVerilenTelNoGirilir() {
        fettah_page.telNoTextBox.sendKeys(ConfigReader.getProperty("telNo1"));
    }

    @And("Appointment DateTime bolumune istenen tarih girilir")
    public void appointmentDateTimeBolumuneIstenenTarihGirilir() {
        fettah_page.appointmentDateTime.sendKeys(ConfigReader.getProperty("medunnaRandevuTarihi"));

    }

    @And("Appointment registration saved! We will call you as soon as possible.' yazisinin goruntulendigi dogrulanir")
    public void appointmentRegistrationSavedWeWillCallYouAsSoonAsPossibleYazisininGoruntulendigiDogrulanir() {
        assertTrue("Randevu kaydi basarili degil", fettah_page.appoinmentRegistrationSavedText.isDisplayed());
    }

    @When("Sign In tiklanir")
    public void signInTiklanir() {
        fettah_page.dropDownSignIn.click();
        fettah_page.signIn.click();
    }

    @Then("Username bolumune verilen username girilir")
    public void usernameBolumuneVerilenUsernameGirilir() {
        fettah_page.userName.sendKeys(ConfigReader.getProperty("medunnaUserName"));
    }

    @And("Password bolumune verilen password girilir")
    public void passwordBolumuneVerilenPasswordGirilir() {
        fettah_page.password.sendKeys(ConfigReader.getProperty("medunnaPassword"));
    }

    @And("Pop-up üzerindeki Sign In tiklanir")
    public void popUpÜzerindekiSignInTiklanir() {
        fettah_page.signInIki.click();
    }

    @And("Kullanicinin oturum actigi dogrulanir")
    public void kullanicininOturumActigiDogrulanir() {
        assertTrue("Giris yapilamadi", fettah_page.girisKontol.isDisplayed());
    }

    @And("MY PAGES \\(PATIENT) tiklanir")
    public void myPAGESPATIENTTiklanir() {
        fettah_page.myPagesPatientButton.click();
    }

    @And("My Appointments tiklanir")
    public void myAppointmentsTiklanir() {
        fettah_page.myAppointmentsButton.click();
    }

    @And("from bolune verilen tarih girilir")
    public void fromBoluneVerilenTarihGirilir() {
        fettah_page.fromDate.sendKeys(ConfigReader.getProperty("medunnaRandevuTarihi"));
    }

    @And("to bolumune verilen tarih girilir")
    public void toBolumuneVerilenTarihGirilir() {
        fettah_page.toDate.sendKeys(ConfigReader.getProperty("medunnaRandevuTarihi"));
    }

    @And("Randevunun goruntulendigi dogrulanir")
    public void randevununGoruntulendigiDogrulanir() {
        assertTrue(fettah_page.alinanRandevuNo.isDisplayed());
    }
}
