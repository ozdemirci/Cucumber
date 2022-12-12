package stepDefinitions.dbStepDef;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DatabaseUtility;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("price", 195.00);
        expectedData.put("id", (long)360776);
        expectedData.put("room_number", 4342363);
        expectedData.put("description", "team08");
        expectedData.put("room_type", "TWIN");
        expectedData.put("status", true);
        expectedData.put("created_date", "2022-12-01 11:05:23.713918");
        expectedData.put("last_modified_date", "22022-12-01 11:05:23.713918");
        expectedData.put("last_modified_by", "team08");
        expectedData.put("created_by", "team08");

    }

    @Then("Admin databaseden gelen oda bilgilerini dogrular")
    public void adminDatabasedenGelenOdaBilgileriniDogrular() {
        Assert.assertEquals(expectedData.get("price"),actualData.get("price"));
        Assert.assertEquals(expectedData.get("id"),actualData.get("id"));
        Assert.assertEquals(expectedData.get("room_number"),actualData.get("room_number"));
        Assert.assertEquals(expectedData.get("description"),actualData.get("description"));
        Assert.assertEquals(expectedData.get("room_type"),actualData.get("room_type"));
        Assert.assertEquals(expectedData.get("status"),actualData.get("status"));
        Assert.assertEquals(expectedData.get("last_modified_date"),actualData.get("last_modified_date"));
        Assert.assertEquals(expectedData.get("created_date"),actualData.get("created_date"));
        Assert.assertEquals(expectedData.get("last_modified_by"),actualData.get("last_modified_by"));
        Assert.assertEquals(expectedData.get("created_by"),actualData.get("created_by"));



    }

    @And("Admin databse ile baglantısını kapatır")
    public void adminDatabseileBaglantisiniKapatir() {
        
        DatabaseUtility.closeConnection();
    }

}
