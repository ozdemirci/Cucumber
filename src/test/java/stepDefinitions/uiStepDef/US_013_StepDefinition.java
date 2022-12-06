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

public class US_013_StepDefinition {
    EsraPage page = new EsraPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("Doktor Medunna url`sine gider")
    public void doktor_medunna_url_sine_gider() {
            Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));

        }

    @When("Doktor profil simgesine tiklar")
    public void doktor_profil_simgesine_tiklar() {

        page.accountMenu.click();

    }

    @Then("Doktor Sign in sekmesine tiklar")
        public void doktorSignInSekmesineTiklar() {
        page.signIn.click();

    }
    @Then("Doktor username ve password girer.")
    public void doktor_username_ve_password_girer() {
        page.doctorusername.sendKeys(ConfigReader.getProperty("doctorusername"));
        page.doctorpassword.sendKeys(ConfigReader.getProperty("doctorpassword"));

    }
    @And("Doktor Sign in butonuna tiklar")
    public void doktorSignInButonunaTiklar() {
        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).perform();


    }

    @Then("Doktor My Pages butonuna tiklar")
    public void doktor_my_pages_butonuna_tiklar() {

        page.doctorMyPage.click();

    }

    @Then("Doktor acilan dropdownda My Appointments butonuna tiklar")
    public void doktor_acilan_dropdownda_my_appointments_butonuna_tiklar() {

        page.doctorMyAppointment.click();
        ReusableMethods.waitFor(2);

    }
    @Then("Doktor acilan sayfada edit butonuna tiklar")
    public void doktor_acilan_sayfada_edit_butonuna_tiklar() {
       page.doctorMyAppointmentEdit.click();
       ReusableMethods.waitFor(2);
    }
    @Then("Doktor Show Test Result sekmsine tiklar")
    public void doktor_show_test_result_sekmsine_tiklar() {
    ReusableMethods.jsclick(page.resultsButton);
    ReusableMethods.waitFor(2);
    }
    @And("Doktor Appointment kisminda hasta id`sinden islem yapacagi hastayi bulur ve sag taraftaki View Result butonuna tiklar")
    public void doktorAppointmentKismindaHastaIdSindenIslemYapacagiHastayiBulurVeSagTaraftakiViewResultButonunaTiklar() {
      ReusableMethods.jsclick(page.viewButton);
     ReusableMethods.waitFor(2);
    }

    @Then("Doktor {string} bilgilerini gorebildigini dogrular")
    public void doktor_bilgilerini_gorebildigini_dogrular(String resultTable) {
        Assert.assertTrue(page.resultTable.isDisplayed());


    }

    //TC02
    @And("Doktor acilan sayfadan Request Impatient butonunun aktif oldugunu dogrular")
    public void doktorAcilanSayfadanRequestImpatientButonununAktifOldugunuDogrular() {
        page.inpatientButton.click();
        Assert.assertTrue(page.inpatientButton.isDisplayed());

    }


}