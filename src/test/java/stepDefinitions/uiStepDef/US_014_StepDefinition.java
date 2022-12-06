package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.EsraPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_014_StepDefinition {
    EsraPage page = new EsraPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    //TC01


    @And("Doktor {string}\" bilgilerini goruntuleyebildigini dogrular")
    public void doktorBilgileriniGoruntuleyebildiginiDogrular(String inPatientBilgileri){
         Assert.assertTrue(page.inPatientBilgileri.isDisplayed());

    }
    //TC03
     @And("Doktor acilan dropdownda my inpatients butonuna tiklar")
     public void doktorAcilanDropdowndaMyInpatientsButonunaTiklar() {
        page.doctorInpatients.click();

     }


     @And("Doktor acilan sayfada status butonuna tiklar ve hastanin durumunu CANCELLED olarak guncelleyebilir.")
    public void doktorAcilanSayfadaStatusButonunaTiklarVeHastaninDurumunuCANCELLEDOlarakGuncelleyebilir() {
       ReusableMethods.jsclick(page.statusButton);
        ReusableMethods.waitFor(2);

        page.cancelled.isSelected();

    }

     @And("Doktor Save butonuna tiklar")
    public void doktorSaveButonunaTiklar() {

         ReusableMethods.jsclick(page.saveButton);
         ReusableMethods.waitFor(2);

         ReusableMethods.jsclick(page.doctorMyPage);
         ReusableMethods.jsclick(page.doctorInpatients); // cancelled butonunun aktif oldugunu goruntuler
         page.doctorInpatients.isDisplayed();
       ReusableMethods.waitFor(2);
     }



    }
