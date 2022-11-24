package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DonePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_015_StepDefinitions {
    DonePages done = new DonePages();


    @Given("Admin medunnaUrl ine gider")
    public void adminMedunnaUrlIneGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Admin sag ust kosedeki insan emojisine tiklar")
    public void adminSagUstKosedekiInsanEmojisineTiklar() {
        done.insanIcon.click();
    }

    @When("Admin Sing in secenegine tiklar")
    public void adminSingInSecenegineTiklar() {
        done.firstSingIn.click();
    }

    @Then("Admin gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar")
    public void adminGelenPopUpAGecerliBirUsernameVePasswordGirerVeSignInButonunaTiklar() {
        done.usernameTextBox.sendKeys("team08" + Keys.TAB);
        done.passwordTextBox.sendKeys("12345");
        done.singInButton.click();
    }

    @And("Admin giris yaptigini dogrular")
    public void adminGirisYaptiginiDogrular() {
        Assert.assertEquals("Administration", done.administrationText.getText());

    }

    @And("Admin items&Titles secenegini dogrular ve tiklar")
    public void adminItemsTitlesSeceneginiDogrularVeTiklar() {
        Assert.assertEquals("Items&Titles", done.itemAndTitles.getText());
        done.itemAndTitles.click();
    }

    @And("Admin items&Titles seceneginden Patient secenegini secer")
    public void adminItemsTitlesSecenegindenPatientSeceneginiSecer() {
        done.itemAndTitlesPatient.click();
    }

    @And("Admin Patiens sayfasinda oldugunu dogrular")
    public void adminPatiensSayfasindaOldugunuDogrular() {
        Assert.assertEquals("Patients", done.AdminPatientS.getText());
    }

    @And("Admin Patiens sayfasinda Create a new Patient secenegine tiklar")
    public void adminPatiensSayfasindaCreateANewPatientSecenegineTiklar() {
        done.AdminCreateANewPatientButton.click();
    }

    @And("Admin Create or edit a Patient sayfasinda oldugunu dogrular")
    public void adminCreateOrEditAPatientSayfasindaOldugunuDogrular() {
        Assert.assertEquals("Create or edit a Patient", done.AdminCreateOrCreaditPatientText.getText());
    }

    //TC02
    @Given("Personel Medunna url ine gider")
    public void personelMedunnaUrlIneGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Personel sag ust kosedeki insan emojisine tiklar")
    public void personelSagUstKosedekiInsanEmojisineTiklar() {
        done.insanIcon.click();
    }

    @Then("Personel Sing in secenegine tiklar")
    public void personelSingInSecenegineTiklar() {
        done.firstSingIn.click();
    }

    @And("Personel gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar")
    public void personelGelenPopUpAGecerliBirUsernameVePasswordGirerVeSignInButonunaTiklar() {
        done.usernameTextBox.sendKeys("PersonelEla" + Keys.TAB);
        done.passwordTextBox.sendKeys("Asdf1234.");
        done.singInButton.click();
    }

    @And("Personel giris yaptigini dogrular")
    public void personelGirisYaptiginiDogrular() {
        Assert.assertEquals("Personel Ela", done.personelElaText.getText());
    }

    @And("Personel items&Titles seceneginin olmadigini dogrular")
    public void personelItemsTitlesSecenegininOlmadiginiDogrular() {
        Assert.assertFalse(done.personelElaIslemMenu.getText().contains("Items&Titles"));
    }

    //TC03
    @Given("Hasta Medunna url ine gider")
    public void hastaMedunnaUrlIneGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Hasta sag ust kosedeki insan emojisine tiklar")
    public void hastaSagUstKosedekiInsanEmojisineTiklar() {
        done.insanIcon.click();
    }

    @Then("Hasta Sing in secenegine tiklar")
    public void hastaSingInSecenegineTiklar() {
        done.firstSingIn.click();
    }

    @And("Hasta gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar")
    public void hastaGelenPopUpAGecerliBirUsernameVePasswordGirerVeSignInButonunaTiklar() {
        done.usernameTextBox.sendKeys("HastaEla" + Keys.TAB);
        done.passwordTextBox.sendKeys("Asdf1234.");
        done.singInButton.click();
    }

    @And("Hasta giris yaptigini dogrular")
    public void hastaGirisYaptiginiDogrular() {
        Assert.assertEquals("Hasta Ela", done.hastaElaText.getText());
    }

    @And("Hasta items&Titles seceneginin olmadigini dogrular")
    public void hastaItemsTitlesSecenegininOlmadiginiDogrular() {
        Assert.assertFalse(done.hastaElaIslemMenu.getText().contains("Items&Titles"));
    }

    //TC04
    @Given("Doktor Medunna url ine gider")
    public void doktorMedunnaUrlIneGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Doktor sag ust kosedeki insan emojisine tiklar")
    public void doktorSagUstKosedekiInsanEmojisineTiklar() {
        done.insanIcon.click();
    }

    @Then("Doktor Sing in secenegine tiklar")
    public void doktorSingInSecenegineTiklar() {
        done.firstSingIn.click();
    }

    @And("Doktor gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar")
    public void doktorGelenPopUpAGecerliBirUsernameVePasswordGirerVeSignInButonunaTiklar() {
        done.usernameTextBox.sendKeys("DoktorEla" + Keys.TAB);
        done.passwordTextBox.sendKeys("Asdf1234.");
        done.singInButton.click();
    }

    @And("Doktor giris yaptigini dogrular")
    public void doktorGirisYaptiginiDogrular() {
        Assert.assertEquals("Doktor Ela", done.doktorElaText.getText());
    }

    @And("Doktor items&Titles seceneginin olmadigini dogrular")
    public void doktorItemsTitlesSecenegininOlmadiginiDogrular() {
        Assert.assertFalse(done.doktorElaIslemMenu.getText().contains("Items&Titles"));
    }

    //TC05
    @Given("User Medunna url ine gider")
    public void userMedunnaUrlIneGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("User sag ust kosedeki insan emojisine tiklar")
    public void userSagUstKosedekiInsanEmojisineTiklar() {
        done.insanIcon.click();
    }

    @Then("User Sing in secenegine tiklar")
    public void userSingInSecenegineTiklar() {
        done.firstSingIn.click();
    }

    @And("User gelen pop-up a gecerli bir username ve password girer ve Sign in butonuna tiklar")
    public void userGelenPopUpAGecerliBirUsernameVePasswordGirerVeSignInButonunaTiklar() {
        done.usernameTextBox.sendKeys("UserEla" + Keys.TAB);
        done.passwordTextBox.sendKeys("Asdf1234");
        done.singInButton.click();
    }

    @And("User giris yaptigini dogrular")
    public void userGirisYaptiginiDogrular() {
        Assert.assertEquals("User Ela", done.userElaText.getText());
    }

    @And("User items&Titles seceneginin olmadigini dogrular")
    public void userItemsTitlesSecenegininOlmadiginiDogrular() {
        Assert.assertFalse(done.userElaText.getText().contains("Items&Titles"));
    }

    //TC06
    @And("Admin Patiens sayfasinda oldugunu dogrular ve SSN,First Name,Last Name,Birth Date,Phone,Gender,Blood Group,Address,Description,Created Date,User,Country and state-City gibi secenekleri dogrular\"")
    public void adminPatiensSayfasindaOldugunuDogrularVeSSNFirstNameLastNameBirthDatePhoneGenderBloodGroupAddressDescriptionCreatedDateUserCountryAndStateCityGibiSecenekleriDogrular() {
        Assert.assertTrue(done.AdminPatientS.isDisplayed());
        Assert.assertTrue(done.AdminPatientSWebTable.isDisplayed());
    }


    @And("Admin Patiens sayfasinda en sagdaki sutunlarda View-Edit-Delete seceneklerini dogrular")
    public void adminPatiensSayfasindaEnSagdakiSutunlardaViewEditDeleteSecenekleriniDogrular() {
        Assert.assertTrue(done.PatientsWievEditDeleteButton.isDisplayed());

    }

    @And("Admin Patients sayfasinda bir hasta belirler")
    public void adminPatientsSayfasindaBirHastaBelirler() {
        ReusableMethods.jshover(done.AdminPatientSOlduguSayfa);
        ReusableMethods.jsclick(done.AdminPatientSOlduguSayfa);

    }

    @And("Admin belirledigi hastanin Delete secenegine tiklar")
    public void adminBelirledigiHastaninDeleteSecenegineTiklar() {
        done.AdminPatientSDexterDeleteButton.click();
    }

    @And("Admin Confirm delete operation ekraninin acildigini dogrular")
    public void adminConfirmDeleteOperationEkranininAcildiginiDogrular() {
        Assert.assertTrue(done.AdminConfirmDeleteOperationsAlert.isDisplayed());
    }

    @And("Admin Confirm delete operation ekraninda Delete butonuna tiklar")
    public void adminConfirmDeleteOperationEkranindaDeleteButonunaTiklar() {
        done.AdminPatientSDexterDeleteButton.click();
    }

    @And("Admin onay mesajini dogrular")
    public void adminOnayMesajiniDogrular() {
        Assert.assertTrue(done.AdminDeleteOnayMesaji.isDisplayed());
    }

    @And("Admin sing out yapar")
    public void adminSingOutYapar() {
        done.adminRoleicon.click();
        done.SingOut.click();


    }

    @And("Personel sing out yapar")
    public void personelSingOutYapar() {
done.personelRoleicon.click();
done.SingOut.click();
    }

    @And("Hasta sing out yapar")
    public void hastaSingOutYapar() {
        done.hastaRoleicon.click();
        done.SingOut.click();
    }


    @And("Doktor sing out yapar")
    public void doktorSingOutYapar() {
        done.doktorRoleicon.click();
        done.SingOut.click();
    }

    @And("User sing out yapar")
    public void userSingOutYapar() {
        done.userRoleicon.click();
        done.SingOut.click();
    }
}



