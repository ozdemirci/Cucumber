package stepDefinitions.dbStepDef;

import io.cucumber.java.en.*;
import utilities.DatabaseUtility;

import static utilities.DatabaseUtility.createConnection;

public class US_16 {

    @Given("Admin baglanti kurar")
    public void admin_baglanti_kurar(){
        DatabaseUtility.createConnection();
    }
    @When("Admin olusturulan oda bilgilerini db den alir {string} ve {string}")
    public void admin_olusturulan_oda_bilgilerini_db_den_alir_ve(String string, String string2) {

    }
    @Then("Kullanici bilgilerini dogrular")
    public void kullanici_bilgilerini_dogrular() {

    }

}
