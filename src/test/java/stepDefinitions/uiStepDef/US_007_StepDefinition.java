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

public class US_007_StepDefinition {
    EsraPage page = new EsraPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    //TC01
    @Given("Hasta Medunna  sayfa url`sine gider")
    public void hasta_medunna_sayfa_url_sine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));


    }

    @When("Hasta profil simgesine tiklar")
    public void hasta_profil_simgesine_tiklar() {
        page.accountMenu.click();


    }

    @Then("Hasta sign in sekmesine tiklar")
    public void hastaSignInSekmesineTiklar() {
    page.signIn.click();

    }

    @Then("Hasta gecerli bir username ve password girer")
    public void hasta_gecerli_bir_username_ve_password_girer() {
        page.patientusername.sendKeys(ConfigReader.getProperty("patientusername"));
        page.patientpassword.sendKeys(ConfigReader.getProperty("patientpassword"));


    }
    @And("Hasta sign in butonuna tiklar")
    public void hastaSignInButonunaTiklar() {
        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).perform();
    }
    @Then("Hasta My Pages butonuna tiklar")
    public void hasta_my_pages_butonuna_tiklar() {
    page.mypagespatient.click();

    }


    @Then("Hasta acilan dropdownda Make an Appoitment butonuna tiklar")
    public void hasta_acilan_dropdownda_make_an_appoitment_butonuna_tiklar() {
    page.MakeanAppointment.click();

    }

    @Then("Hasta acilan sayfada; First Name, SSN, Email, Phone textboxlarini doldurur")
    public void hasta_acilan_sayfada_first_name_ssn_email_phone_textboxlarini_doldurur() {
    page.PhoneNumber.sendKeys("5555555555");

    }


    @Then("Hasta Send an Appointment Request butonunu tiklar")
    public void hasta_send_an_appointment_request_butonunu_tiklar() {

        page.patientRegisterSubmit.click();

    }

    @And("Hasta Appointment registration saved yazisini gorur ve randevu olusturdugunu dogrular")
    public void hastaAppointmentRegistrationSavedYazisiniGorurVeRandevuOlusturdugunuDogrular() {
        page.successbutton.isDisplayed();



    }


    //TC02
    @Then("Hasta Appointment DateTime kismina gelecekteki bir tarihi girer")
    public void hastaAppointmentDateTimeKisminaGelecektekiBirTarihiGirer() {
        page.appoDate.sendKeys("09.12.2022");

    }


    //TC03
    @And("Hasta Appointment DateTime kismina gecmis bir tarihi girer")
    public void hastaAppointmentDateTimeKisminaGecmisBirTarihiGirer() {
        page.appoDate.sendKeys("24.11.2022");

    }


    @And("Hasta Appointment date can not be past date yazisini goruntuler")
    public void hastaAppointmentDateCanNotBePastDateYazisiniGoruntuler() {
      Assert.assertTrue(page.notpastDate.isDisplayed());


    }



    //@TC04
    @And("Hasta Appointment DateTime kismina tarihi gun,ay,yil seklinde yazar")
    public void hastaAppointmentDateTimeKisminaTarihiGunAyYilSeklindeYazar() {
       page.appoDate.sendKeys("30.12.2022");
        page.patientRegisterSubmit.click();

    }

/*
    @And("Sayfa kapatilir")
   public void sayfaKapatilir() {
        Driver.closeDriver();
    }

    @And("Sayfa sign out yapilir")
    public void sayfaSignOutYapilir() {
        js.executeScript("argumants[0].click()",page.accountMenu);
        js.executeScript("argumants[0].click()",page.signout);

    }
    */
}

