package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.FettahPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_009_StepDefinitions {

    FettahPage fettahPage = new FettahPage();

    Faker faker = new Faker();

    Random random = new Random();

    @Given("Personel {string} e gider")
    public void personelEGider(String baseUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(baseUrl));
    }

    @And("Personel sayfanin sag ust  kosesindeki drop down a tiklar")
    public void personelSayfaninSagUstKosesindekiDropDownATiklar() {
        fettahPage.dropDownSignIn.click();
    }

    @And("Personel Sing in segmesine tiklar")
    public void personelSingInSegmesineTiklar() {
        fettahPage.signIn.click();
    }

    @And("Personel  Username box a gecerli {string} girer")
    public void personelUsernameBoxAGecerliGirer(String username) {
        fettahPage.userName.sendKeys(ConfigReader.getProperty(username));
    }

    @And("Personel Password box a gecerli {string} girer")
    public void personelPasswordBoxAGecerliGirer(String password) {
        fettahPage.password.sendKeys(ConfigReader.getProperty(password));
    }

    @And("Personel  giris yapmak uzere Sign in butonuna  tiklar")
    public void personelGirisYapmakUzereSignInButonunaTiklar() {
        fettahPage.signInIki.click();
    }

    @And("Personel MY PAGES sekmesine tiklar")
    public void personelMYPAGESSekmesineTiklar() {
        ReusableMethods.waitFor(3);
        fettahPage.myPagesDropDown.click();
    }

    @And("Personel Search Patient sekmesine tiklar")
    public void personelSearchPatientSekmesineTiklar() {
        ReusableMethods.waitFor(3);
        fettahPage.searchPatientText.click();
    }

    @Then("Gidilen sayfada hasta bilgilerinin gorunur oldugunu dogrular")
    public void gidilenSayfadaHastaBilgilerininGorunurOldugunuDogrular() {
        List<WebElement> patientsWE = fettahPage.hastaBilgileri;
        for (WebElement w : patientsWE) {
            assertTrue(w.isDisplayed());
        }
    }

    @And("Personel sayfayi kapatir")
    public void personelSayfayiKapatir() {
        Driver.closeDriver();
    }

    @When("Personel Patient SSN box a tiklar ve hasta {string} girer")
    public void personelPatientSSNBoxATiklarVeHastaGirer(String SSN) {
        ReusableMethods.waitFor(2);
        fettahPage.ssnBox.sendKeys(SSN);
        ReusableMethods.waitFor(2);
    }

    @Then("Personel hastanin Edit buttonuna tiklar")
    public void personelHastaninEditButtonunaTiklar() {
        fettahPage.editButton.click();
    }

    String id;

    @And("Personel ID yi duzenler")
    public void personelIDYiDuzenler() {
        id = faker.idNumber().valid();
        fettahPage.idBox.sendKeys(id);
    }

    String firstname;

    @And("Personel FirstName i duzenler")
    public void personelFirstNameIDuzenler() {
        //Driver.getDriver().navigate().refresh();
        firstname = faker.name().firstName();
        fettahPage.firstNameBox.clear();
        fettahPage.firstNameBox.sendKeys(firstname);
    }

    String lastname;

    @And("Personel LastName i duzenler")
    public void personelLastNameIDuzenler() {
        lastname = faker.name().lastName();
        fettahPage.lastNameBox.clear();
        fettahPage.lastNameBox.sendKeys(lastname);
    }

    @And("Personel Birth Date i duzenler")
    public void personelBirthDateIDuzenler() {
        fettahPage.birthDateBox.sendKeys("09.09.1994", Keys.ARROW_RIGHT, "10:30", Keys.ARROW_RIGHT, "PM");
    }

    @And("Personel Email i duzenler")
    public void personelEmailIDuzenler() {
        fettahPage.emailBox.clear();
        fettahPage.emailBox.sendKeys("fetkaya3235@gmail.com");
    }

    @And("Personel Phone u duzenler")
    public void personelPhoneUDuzenler() {
        fettahPage.phoneBox.clear();
        fettahPage.phoneBox.sendKeys("5455555555");
    }

    @And("Personel Gender i duzenler")
    public void personelGenderIDuzenler() {
        Select select = new Select(fettahPage.genderDropDown);
        List<WebElement> genderList = select.getOptions();
        select.selectByValue("MALE");
    }

    @And("Personel Blood Group u duzenler")
    public void personelBloodGroupUDuzenler() {
        Select select = new Select(fettahPage.bloodGroupDropDown);
        List<WebElement> bloodGroupList = select.getOptions();
        select.selectByVisibleText("O+");
    }

    String address;

    @And("Personel Address i duzenler")
    public void personelAddressIDuzenler() {
        address = faker.address().fullAddress();
        fettahPage.adressBox.clear();
        fettahPage.adressBox.sendKeys(address);
    }

    String description;

    @And("Personel Description i duzenler")
    public void personelDescriptionIDuzenler() {
        description = faker.book().title();
        fettahPage.descriptionTextarea.clear();
        fettahPage.descriptionTextarea.sendKeys(description);
    }

    @And("Personel User i duzenler")
    public void personelUserIDuzenler() {
        Select select = new Select(fettahPage.userDropDown);
        List<WebElement> userList = select.getOptions();
        select.selectByIndex(16);
    }

    @And("Personel Country i duzenler")
    public void personelCountryIDuzenler() {
        Select select = new Select(fettahPage.countryDropDown);
        List<WebElement> countryList = select.getOptions();
        ReusableMethods.waitFor(3);
        select.selectByVisibleText("Türkiyem");
        ReusableMethods.waitFor(3);
    }

    @And("Personel State-City i duzenler")
    public void personelStateCityIDuzenler() {
        Select select = new Select(fettahPage.stateCityDropDown);
        List<WebElement> cityList = select.getOptions();
        ReusableMethods.waitFor(3);
        select.selectByVisibleText("Adana");
    }

    @And("Personel save buttonuna basar")
    public void personelSaveButtonunaBasar() {
        ReusableMethods.waitFor(3);
        ReusableMethods.jsclick(fettahPage.saveButton);
        //fettahPage.saveButton.click();
        ReusableMethods.waitFor(3);
    }

    @And("Personel back tusuna basar")
    public void personelBackTusunaBasar() {
        ReusableMethods.waitFor(5);
        ReusableMethods.jsclick(fettahPage.backButton);
        //fettahPage.backButton.click();
    }

    @And("Personel yaptigi degisiklikleri dogrular")
    public void personelYaptigiDegisiklikleriDogrular() {
        ReusableMethods.waitFor(5);
        List<WebElement> guncelHastaBilgileri=fettahPage.guncelHastaBilgileri;
        List<String> guncelHastaString=new ArrayList<>();
        for (WebElement w:guncelHastaBilgileri) {
            guncelHastaString.add(w.getText());
        }
        Assert.assertNotEquals(id,guncelHastaString.get(0));
        Assert.assertEquals(firstname,guncelHastaString.get(2));
        Assert.assertEquals(lastname,guncelHastaString.get(3));
        Assert.assertEquals("09/09/05 10:30",guncelHastaString.get(4));
        Assert.assertEquals("2345662332",guncelHastaString.get(5));
        Assert.assertEquals("ayse1234@gmail.com",guncelHastaString.get(6));
        Assert.assertEquals("FEMALE",guncelHastaString.get(7));
        Assert.assertEquals("B-",guncelHastaString.get(8));
        Assert.assertEquals(address,guncelHastaString.get(9));
        Assert.assertEquals(description,guncelHastaString.get(10));
        Assert.assertEquals("team9",guncelHastaString.get(12));
        Assert.assertEquals("Turkiyem",guncelHastaString.get(13));
        Assert.assertNotEquals("Adana",guncelHastaString.get(14));
    }

    @Then("Personel hasta bilgilerinin dolduruldugunu dogrular")
    public void personelHastaBilgilerininDolduruldugunuDogrular() {
        List<WebElement> guncelHastaBilgileri=fettahPage.hastaBilgileri;

        for (WebElement w:guncelHastaBilgileri) {
            assertTrue(w.isDisplayed());
        }
    }

    @And("Personel hasta bilgilerini siler")
    public void personelHastaBilgileriniSiler() {
        personelBirthDateIDuzenler();
        personelDescriptionIDuzenler();

        fettahPage.birthDateBox.clear();
        fettahPage.descriptionTextarea.clear();
    }

    @And("Personel hasta bilgilerini sildigini dogrular")
    public void personelHastaBilgileriniSildiginiDogrular() {
        ReusableMethods.waitFor(5);
        List<WebElement> guncelHastaBilgileri=fettahPage.guncelHastaBilgileri;
        List<String> guncelHastaString=new ArrayList<>();
        for (WebElement w:guncelHastaBilgileri) {
            guncelHastaString.add(w.getText());
        }
        assertEquals("BirdDate silinemedi","",guncelHastaString.get(4));
        assertEquals("Description silinemedi","",guncelHastaString.get(10));
    }

    @And("Personel {int} saniye bekler")
    public void personelSaniyeBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi* 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
