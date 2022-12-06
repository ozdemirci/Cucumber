package stepDefinitions.uiStepDef;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.SumeyyePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_024_StepDefinitions {


    SumeyyePage sumeyyePage=new SumeyyePage();

    @Given("Hasta <sumeyyeUrl> sayfasina gider")
    public void hastaSumeyyeUrlSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("sumeyyeUrl"));
    }


    @When("Hasta ilk sign in butonuna tiklar")
    public void hastaIlkSignInButonunaTiklar() {

        sumeyyePage.ilkSignInButton.click();
    }

    @And("Hasta patient sign in butonuna tiklar")
    public void hastaPatientSignInButonunaTiklar() {
        Assert.assertTrue(sumeyyePage.patientSignButton.isDisplayed());
        sumeyyePage.patientSignButton.click();
    }

    @Then("Hasta gecerli bir username girer")
    public void hasta_gecerli_bir_username_girer() {
        sumeyyePage.patientUserName8.sendKeys("hasta81proje");

    }

    @And("Hasta gecerli bir password girer")
    public void hastaGecerliBirPasswordGirer() {

        sumeyyePage.patientpassword8.sendKeys("qa123456789!");
    }

    @When("Hasta ikinci sign in butonuna tiklar")
    public void hastaIkinciSignInButonunaTiklar() {

        sumeyyePage.ikinciSignInButton.click();
    }


    @When("Hasta MY PAGES\\(PATIENT) butonuna tiklar")
    public void hasta_my_pages_patient_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sumeyyePage.myPagesButton.isDisplayed());
        sumeyyePage.myPagesButton.click();
    }

    @When("Hasta My Appointments butonuna tiklar")
    public void hasta_my_appointments_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sumeyyePage.myAppointmentsButton.isDisplayed());
        sumeyyePage.myAppointmentsButton.click();
    }

    @When("Hasta Show Tests butonuna tiklar")
    public void hasta_show_tests_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        sumeyyePage.showTestsButton.click();

    }

    @When("Hasta View Results butonuna tiklar")
    public void hasta_view_results_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(3000);
        sumeyyePage.viewResultsButton.click();
    }
    @Then("Hasta Id, Name for test, Default Min. Value, Default Max. Value")
    public void hasta_id_name_for_test_default_min_value_default_max_value() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sumeyyePage.idHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucid.isDisplayed());


        Assert.assertTrue(sumeyyePage.nameForTestHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucNameForTest.isDisplayed());


        Assert.assertTrue(sumeyyePage.defaultMinValueHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucDefaultMinValue.isDisplayed());


        Assert.assertTrue(sumeyyePage.defaultMaxValueHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucDefaultMaxValue.isDisplayed());



    }
    @When("Description ve Date'in gorunur oldugunu test eder")
    public void description_ve_date_in_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(sumeyyePage.descriptionHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucDescription.isDisplayed());


        Assert.assertTrue(sumeyyePage.dateHeader.isDisplayed());
        Assert.assertTrue(sumeyyePage.sonucDate.isDisplayed());


    }



    @When("Hasta Show Invoice butonuna tiklar")
    public void hasta_show_invoice_butonuna_tiklar() {

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        sumeyyePage.showInvoiceButton.click();

    }
    @Then("Hasta faturanin gorunur oldugunu test eder")
    public void hasta_faturanin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(sumeyyePage.patientShowInvoice.isDisplayed());
    }

}
