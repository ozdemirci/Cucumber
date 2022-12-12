package stepDefinitions.dbStepDef;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DatabaseUtility;

import java.util.HashMap;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;
import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getRowMap;

public class US_016_dbRoom {
    Map<String, Object> actualData;
    Map<String, Object> expectedData;
    @Given("Admin medunna database baglanir")
    public void adminMedunnaDatabaseBaglanir() {
     createConnection();
    }

    @When("Admin databseden ID si belirtilen odayi cagirir <query>")
    public void adminDatabsedenIDSiBelirtilenOdayiCagirirQuery() {
        actualData = getRowMap("select * from public.room where id=360776");
        System.out.println("actualData = " + actualData);

    }

    @Then("Admin expectedData larini olusturur")
    public void adminExpectedDataLariniOlusturur() {
        expectedData = new HashMap<>();
        expectedData.put("price", 195.00);
        expectedData.put("id", (long)360776);
        expectedData.put("room_number", 4342363);
        expectedData.put("description", "team08");
        expectedData.put("room_type", "TWIN");
        expectedData.put("status", true);
        expectedData.put("last_modified_by", "team08");
        expectedData.put("created_by", "team08");

    }

    @Then("Admin databaseden gelen oda bilgilerini dogrular")
    public void adminDatabasedenGelenOdaBilgileriniDogrular() {
        assertEquals(expectedData.get("created_by"),actualData.get("created_by"));
        assertEquals(expectedData.get("last_modified_by"),actualData.get("last_modified_by"));
        assertEquals(expectedData.get("status"),actualData.get("status"));
       assertEquals(expectedData.get("room_type"),actualData.get("room_type"));
       assertEquals(expectedData.get("description"),actualData.get("description"));
       assertEquals(expectedData.get("room_number"),actualData.get("room_number"));
       assertEquals(expectedData.get("id"),actualData.get("id"));

    }

    @And("Admin databse ile baglantısını kapatır")
    public void adminDatabseileBaglantisiniKapatir() {
        
        DatabaseUtility.closeConnection();
    }

}
