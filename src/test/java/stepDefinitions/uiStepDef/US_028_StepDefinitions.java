package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Fatih_Page;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_028_StepDefinitions {
    Fatih_Page fatih_page=new Fatih_Page();
    @Then("Items&Titles sekmesinde Country bolumune tiklar")
    public void ıtemsTitlesSekmesindeCountryBolumuneTiklar() {
        fatih_page.itemsTitlesButton.click();
        fatih_page.countryButton.click();
    }

    @And("Acilan ekranda Create a new Country butonuna tiklar")
    public void acilanEkrandaCreateANewCountryButonunaTiklar() {
    fatih_page.createNewCountryButton.click();
    }

    @And("Name bolumune ulke ismi girilir ve save butonu tiklanarak kayit yapilir")
    public void nameBolumuneUlkeIsmiGirilirVeSaveButonuTiklanarakKayitYapilir() {
        fatih_page.countryName.sendKeys("KABRİSTAN");
        fatih_page.saveCountryButton.click();

    }

    @Then("Items&Titles sekmesinde State_City bolumune tiklar")
    public void ıtemsTitlesSekmesindeState_CityBolumuneTiklar() {
        fatih_page.itemsTitlesButton.click();
        fatih_page.stateCityButton.click();
    }

    @And("Create a new State_City butonu tiklanir")
    public void createANewState_CityButonuTiklanir() {
        fatih_page.createNewStateCity.click();
    }

    @And("Name bolumune ilgili state_City yazilir ve save butonuna tiklanir")
    public void nameBolumuneIlgiliState_CityYazilirVeSaveButonunaTiklanir() {
        fatih_page.stateCityName.sendKeys("Lion");
        fatih_page.saveButtonCity.click();

    }

    @And("Ulkeleye sehir eklenebildigi test edilir")
    public void ulkeleyeSehirEklenebildigiTestEdilir() throws IOException {
        Assert.assertTrue("Ulkeye sehir eklenemiyor",fatih_page.createCityAlertMessage.isEnabled());
        ReusableMethods.getScreenshotWebElement("Alert Message", fatih_page.createCityAlertMessage);
    }

    @And("Silinmesi istenen country satirindaki delete butonuna tiklanir")
    public void silinmesiIstenenCountrySatirindakiDeleteButonunaTiklanir() {
        fatih_page.deleteCountryButton.click();
    }

    @And("Confirm delete operation uyarı ekranında Ulke silmek icin Delete butonuna tiklar")
    public void confirmDeleteOperationUyarıEkranındaUlkeSilmekIcinDeleteButonunaTiklar() {
        fatih_page.deleteCountryConfirmButton.click();
    }

    @And("Ilgili Ulkenin silindigi test edilir.")
    public void ılgiliUlkeninSilindigiTestEdilir() throws InterruptedException, IOException {
        Thread.sleep(2000);
        Assert.assertTrue("Ulke silme islemi yapilamamaktadir",fatih_page.deleteCountryAllertMessage.isEnabled());
        ReusableMethods.getScreenshotWebElement("Alert Message",fatih_page.deleteCountryAllertMessage);
    }


}
