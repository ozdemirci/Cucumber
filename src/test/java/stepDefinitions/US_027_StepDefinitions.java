package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Fatih_Page;
import utilities.Driver;

public class US_027_StepDefinitions {
    Fatih_Page fatih_page=new Fatih_Page();
    Actions action=new Actions(Driver.getDriver());
    @Then("Items&Titles sekmesinde Messages bolumune tiklar")
    public void ıtemsTitlesSekmesindeMessagesBolumuneTiklar() {
    fatih_page.itemsTitlesButton.click();
    fatih_page.messagesButton.click();

    }

    @And("Acilan ekranda yazilan mesajları, yazarlarini ve  epostalarinin gorulebildigini test eder")
    public void acilanEkrandaYazilanMesajlarıYazarlariniVeEpostalarininGorulebildiginiTestEder() {
        Assert.assertTrue(fatih_page.messagerName.isDisplayed());
        Assert.assertTrue(fatih_page.messagerEmail.isDisplayed());
        Assert.assertTrue(fatih_page.messageText.isDisplayed());

    }

    @And("Create a new massage butonuna tiklar")
    public void createANewMassageButonunaTiklar() {
        fatih_page.createMessageButton.click();
    }

    @And("Acilan ekranda name, email,subject,message bolumlerini doldurarark save butonuna tiklayarak mesaj olusturur")
    public void acilanEkrandaNameEmailSubjectMessageBolumleriniDoldurararkSaveButonunaTiklayarakMesajOlusturur() {
        fatih_page.createNameForMessage.sendKeys("Dr.Fatih");
        action.sendKeys(Keys.TAB).
                sendKeys("dr.fatih@gmail.com").sendKeys(Keys.TAB).
                sendKeys("Tests Results").sendKeys(Keys.TAB).
                sendKeys("Can u sent me results").sendKeys(Keys.TAB).sendKeys(Keys.TAB,Keys.ENTER).perform();

    }

    @And("Acilan listede guncellemek istedigi mesaj satirindaki edit butonuna tiklar")
    public void acilanListedeGuncellemekIstedigiMesajSatirindakiEditButonunaTiklar() {
        fatih_page.messageEditButton.click();
    }

    @And("Messge alanini güncelleyerek save butonuna tiklar")
    public void messgeAlaniniGüncelleyerekSaveButonunaTiklar() throws InterruptedException {
        Thread.sleep(2000);
        fatih_page.messageSubject.sendKeys(Keys.BACK_SPACE);
        action.sendKeys(Keys.TAB).sendKeys("mesaj edit yapilabiliyor").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();
    }

    @And("Silinmesi istenen mesaj satirindaki delete butonuna tiklar")
    public void silinmesiIstenenMesajSatirindakiDeleteButonunaTiklar() {
        fatih_page.messageDeleteButton.click();

    }

    @And("Confirm delete operation uyarı ekranında Delete butonuna tiklar")
    public void confirmDeleteOperationUyarıEkranındaDeleteButonunaTiklar() {
        fatih_page.messageDeleteConfirmButton.click();

    }
}
