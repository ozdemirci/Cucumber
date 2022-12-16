package stepDefinitions.dbStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US_18dbStepDefinition {
    @Given("Kullanici database  baglanti kurar")
    public void kullaniciDatabaseBaglantiKurar() {
        DatabaseUtility.createConnection();

    }

    @When("Kullanici doktor bilgilerini gorebilmek icin query olusturur")
    public void kullaniciDoktorBilgileriniGorebilmekIcinQueryOlusturur() {
        String query="select * from physician";
    }

    @Then("Kullanici olusturulan doktor bilgileri tablosunu sutun isimlerine gore getirir")
    public void kullaniciOlusturulanDoktorBilgileriTablosunuSutunIsimlerineGoreGetirir() {
        String query="select * from physician";
        System.out.println("Tablo sutun basliklari= " + DatabaseUtility.getColumnData(query,"id")+"\n");
    }

    @And("Kullanıcı kayitli doktor bilgilerini dogrulama yapabilmek icin idlere gore kaydeder")
    public void kullanıcıKayitliDoktorBilgileriniDogrulamaYapabilmekIcinIdlereGoreKaydeder() {
        String query_physician="select * from physician where id=400001";
          // List<Object> physicianList=DatabaseUtility.getColumnData(query_physician,"id");
           //String fileName="src/test/resources/testData/physicianName.txt";
           //WriteToTxt.savePhysicianFirstName(fileName,physicianList);
        List<Object> List=DatabaseUtility.getColumnData(query_physician,"id");
        String fileName="src/test/resources/testData/physicianIds.txt";
      //  WriteToTxt.saveCountryName(fileName,physicianList);
    }

    @And("Kullanici kayitli doktorlari dogrular")
    public void kullaniciKayitliDoktorlariDogrular() {

        //  String fileName="src/test/resources/testData/countryName.txt";
        String fileName="src/test/resources/testData/cuntryIds.txt";
        List<Object> actualphysicianList= ReadTxt.returnCountryIdsList(fileName);
        System.out.println("actualCountryList = " + actualphysicianList);

        List<Object> expectedphysicianList=new ArrayList<>();
        expectedphysicianList.add(400001);
        expectedphysicianList.add(400001);

        Assert.assertTrue(actualphysicianList.containsAll(expectedphysicianList));
    }

    @And("Database kapatir")
    public void databaseKapatir() {
        DatabaseUtility.closeConnection();
    }
}
