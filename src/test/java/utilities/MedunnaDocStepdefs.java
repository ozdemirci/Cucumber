package utilities;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US10_Page;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MedunnaDocStepdefs {
    US10_Page page = new US10_Page();
    Actions actions = new Actions(Driver.getDriver());
    String password;
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("doktor medunna ana sayfasina gider")
    public void doktorMedunnaAnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("BaseUrl"));
    }

    @When("doktor signin sekmesine tiklar")
    public void doktorSigninSekmesineTiklar() {
        page.signInHome.click();
        page.signinSekmesi.click();
    }

    @And("doktor gecerli username girer")
    public void doktorGecerliUsernameGirer() {
        page.username.sendKeys(ConfigReader.getProperty("validDocname"), Keys.TAB);

    }

    @And("doktor gecerli password girer")
    public void doktorGecerliPasswordGirer() {
        actions.sendKeys(ConfigReader.getProperty("validDocPassword")).perform();

    }

    @And("doktor signin butonuna tiklar")
    public void doktorSigninButonunaTiklar() {
        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).perform();
    }

    @Then("doktor giris yaptigini dogrular")
    public void doktorGirisYaptiginiDogrular() {
        Assert.assertTrue(page.doc.isDisplayed());
    }

    @When("doktor my pages sekmesine tiklar")
    public void doktorMyPagesSekmesineTiklar() {
        page.docMyPage.click();

    }

    @And("doktor my appointments sekmesine tiklar")
    public void doktorMyAppointmentsSekmesineTiklar() {
        page.docAppointmentPage.click();
    }

    @Then("doktor randevularının görunur oldugunu dogrular")
    public void doktorRandevularınınGörunurOldugunuDogrular() {
        assertTrue(page.docPatientId.isDisplayed());
    }


    @And("doktor sayfayi kapatir")
    public void doktor_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("doktor randevularina ait {string} gorunur oldugunu dogrular")
    public void doktorRandevularinaAitGorunurOldugunuDogrular(String str) {
        switch (str) {
            case "patient id":
                page.docPatientId.isDisplayed();
                break;
            case "start date":
                page.docStartDateTime.isDisplayed();
                break;
            case "end date":
                page.docEndDateTime.isDisplayed();
                break;
            case "status":
                page.docStatus.isDisplayed();
                break;
            case "Anamnesis":
                page.docEditAnamnesis.isDisplayed();
                break;
            case "Treatment":
                page.docTreatment.isDisplayed();
                break;
            case "Diagnosis":
                page.docDiagnosis.isDisplayed();
                break;
        }
    }

    @And("doktor randevularinda Edit butonuna tiklar")
    public void doktorRandevularindaEditButonunaTiklar() {
        js.executeScript("arguments[0].click();",page.docAppointmentEdit);

    }

    @And("doktor anemnesis, treatment, diagnosis bolumlerini doldurur")
    public void doktorAnemnesisTreatmentDiagnosisBolumleriniDoldurur() {
        js.executeScript("arguments[0].click();",page.docAnamnesis);

        page.docAnamnesis.sendKeys(Faker.instance().medical().diseaseName());
        actions.sendKeys(Keys.TAB,Faker.instance().medical().diseaseName() ).
                sendKeys(Keys.TAB,Faker.instance().medical().diseaseName() ).
                sendKeys(Keys.TAB,Faker.instance().medical().diseaseName() ).
                sendKeys(Keys.TAB,Faker.instance().medical().diseaseName()).perform();
    }

    @And("doktor Save butonuna tiklar")
    public void doktorSaveButonunaTiklar() {
        js.executeScript("arguments[0].click();",page.docAppointmentSave);
    }

    @Then("Doktor {string} mesajini gorunur oldugunu dogrular")
    public void doktorMesajiniGorunurOldugunuDogrular(String str) {
       assertEquals(ConfigReader.getProperty("approveMessageClass"),page.docAppointmentApprove.getAttribute("class"));
    }

    @And("doktor anemnesis, treatment, diagnosis bolumlerini bos birakir")
    public void doktorAnemnesisTreatmentDiagnosisBolumleriniBosBirakir() {
        js.executeScript("arguments[0].click();",page.docAnamnesis);
        page.docAnamnesis.clear();
        actions.sendKeys(Keys.TAB,Keys.DELETE).
                sendKeys(Keys.TAB,Keys.DELETE).
                sendKeys(Keys.TAB).perform();

    }

    @Then("Doktor {string} mesajinin gorunur oldugunu dogrular")
    public void doktorMesajininGorunurOldugunuDogrular(String message) {
        assertEquals(message,page.docInvalidfeedback.getText());
    }

    @And("doktor  {string}  butonuna tiklar")
    public void doktorButonunaTiklar(String arg0) {
        ReusableMethods.waitForClickablility(page.docTest,15);
        ReusableMethods.jsclick(page.docTest);

    }

    @Then("Doktor testlerin seçilebilir oldugunu dogrular")
    public void doktorTestlerinSeçilebilirOldugunuDogrular() throws AWTException {

        Robot robot = new Robot();
        for (int i = 0; i <4 ; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL); //CTRL ye tiklandi
            robot.keyPress(KeyEvent.VK_SUBTRACT); // - ye tiklandi
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // CTRL yi birakti
            robot.keyRelease(KeyEvent.VK_CONTROL); //- yi birakti
            // CTRL (-) ye basılarak ekran belirlenen miktarda küçültülmüş oldu.
        }

        assertTrue(page.docFirstTest.isDisplayed());

    }

    @And("doktor {string} testlerini ister")
    public void doktorTestleriniIster(String arg0) throws AWTException {

        Robot robot = new Robot();
        for (int i = 0; i <4 ; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL); //CTRL ye tiklandi
            robot.keyPress(KeyEvent.VK_SUBTRACT); // - ye tiklandi
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // CTRL yi birakti
            robot.keyRelease(KeyEvent.VK_CONTROL); //- yi birakti
            // CTRL (-) ye basılarak ekran belirlenen miktarda küçültülmüş oldu.
        }
        ReusableMethods.jshover(page.docUreaTest);
        ReusableMethods.jsclick(page.docUreaTest);
        ReusableMethods.jshover(page.docCreatinineTest);
        ReusableMethods.jsclick(page.docCreatinineTest);
        ReusableMethods.jshover(page.docGlucoTest);
        ReusableMethods.jsclick(page.docGlucoTest);
        ReusableMethods.jshover(page.docTestSave);
        ReusableMethods.jsclick(page.docTestSave);

         }

    @Then("testlerin istenildiğini dogrular")
    public void testlerinIstenildiğiniDogrular() {

        assertEquals(ConfigReader.getProperty("approveMessageClass"),page.docTestApprove.getAttribute("class"));

    }

    @And("doktor prescription ve description bolumleri haric bolumleri doldurur")
    public void doktorPrescriptionVeDescriptionBolumleriHaricBolumleriDoldurur() {
        page.docAnamnesis.sendKeys(Faker.instance().medical().diseaseName());
        actions.sendKeys(Keys.TAB,Faker.instance().medical().diseaseName() ).
                sendKeys(Keys.TAB,Faker.instance().medical().diseaseName() ).perform();
    }


    @And("doktor status bolumunu {string} olarak secer")
    public void doktorStatusBolumunuOlarakSecer(String arg0) {
        Select options=new Select(page.docAppointmentStatus);
        options.selectByIndex(2);
    }
}
