package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TulayPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_001_StepDefinitions {
    TulayPage page=new TulayPage();
    Actions actions= new Actions(Driver.getDriver());

    @Given("Medunna anasayfasina gidilir")
    public void medunnaAnasayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
    }

    @Then("Account menu butonu tiklanir")
    public void accountMenuButonuTiklanir() {
        ReusableMethods.jsclickTulay(page.accountMenu);
    }

    @And("Registration sayfasina gidilir")
    public void registrationSayfasinaGidilir() {
        ReusableMethods.jsclickTulay(page.register);
    }
    @Given("Gecerli {string} girilir")
    public void gecerliGirilir(String arg0) {
        ReusableMethods.jsclickTulay(page.ssnBox);
        page.ssnBox.sendKeys(ConfigReader.getProperty("validSSN"));
    }
    @Then("First Name buttonuna tiklanir")
    public void firstNameButtonunaTiklanir() {
        ReusableMethods.jsclickTulay(page.firstNameBox);
    }

    @And("Gecerli bir SSN numarasinin girildigi dogrulanir")
    public void gecerliBirSSNNumarasininGirildigiDogrulanir() {
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertNotEquals(ConfigReader.getProperty("SSNInvalidFeedBack"),page.SSNFeedback.getText());
    }

    @Given("Gecersiz bir {string} girilir")
    public void gecersizBirGirilir(String SSN) {
        ReusableMethods.jsclickTulay(page.ssnBox);
        page.ssnBox.sendKeys(SSN);
    }

    @Then("First Name buttonuna tiklanır")
    public void firstNameButtonunaTiklanır() {
        ReusableMethods.jsclickTulay(page.firstNameBox);
    }

    @And("Your SSN is invalid mesajinin goruldugu test edilir")
    public void yourSSNIsInvalidMesajininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("SSNInvalidFeedBack"),page.SSNFeedback.getText());
    }

    @Given("SSN butonuna tiklanir")
    public void ssnButonunaTiklanir() {
        ReusableMethods.jsclickTulay(page.ssnBox);
    }

    @And("Your SSN is required. mesajinin goruldugu test edilir")
    public void yourSSNIsRequiredMesajininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("SSNRequiredFeedBack"),page.SSNRequiredFeedback.getText());
    }

    @Given("Gecerli bir {string} girilir")
    public void gecerliBirGirilir(String FirstName) {
        ReusableMethods.jsclickTulay(page.firstNameBox);
        page.firstNameBox.sendKeys(FirstName);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
    }

    @Given("Last Name kutusuna gecerli bir {string} girilir")
    public void lastNameKutusunaGecerliBirGirilir(String lastName) {
        ReusableMethods.jsclickTulay(page.lastNameBox);
        page.lastNameBox.sendKeys(lastName);
    }
    @Then("LastName buttonuna tiklanir")
    public void lastnameButtonunaTiklanir() {
        ReusableMethods.jsclickTulay(page.lastNameBox);
    }

    @And("Your FirstName is required. mesajinin gorulmedigi dogrulanir.")
    public void yourFirstNameIsRequiredMesajininGorulmedigiDogrulanir() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(ConfigReader.getProperty("ValidFeedBack")));
    }

    @Then("Last Name buttonuna tiklanir")
    public void lastNameButtonunaTiklanir() {
        ReusableMethods.jsclickTulay(page.lastNameBox);
    }

    @And("Your FirstName is required. mesajinin goruldugu test edilir")
    public void yourFirstNameIsRequiredMesajininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("FirstNameRequiredFeedBack"),page.firstNameRequiredFeedback.getText());
    }


    @And("Your LastName is required. mesajinin gorulmedigi dogrulanir")
    public void yourLastNameIsRequiredMesajininGorulmedigiDogrulanir() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(ConfigReader.getProperty("ValidFeedBack")));
    }

    @And("Your LastName is required. mesajinin goruldugu test edilir")
    public void yourLastNameIsRequiredMesajininGorulduguTestEdilir() {
        Assert.assertEquals(ConfigReader.getProperty("LastNameRequiredFeedBack"),page.lastNameRequiredFeedback.getText());
    }


}
