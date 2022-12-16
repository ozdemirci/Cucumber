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

public class US_17dbStepDefinition {
    @Given("Kullanici database ie baglanti kurar")
    public void kullaniciDatabaseIeBaglantiKurar() {

        DatabaseUtility.createConnection();
    }

    @When("Kullanici Test items\\(öğe) bilgilerini gorebilmek icin query olusturur")
    public void kullaniciTestItemsÖğeBilgileriniGorebilmekIcinQueryOlusturur() {
        String query_country="select * from c_test_item";
    }

    @Then("Kullanici olusturulan Test items\\(öğe) bilgileri tablosunu sutun isimlerine gore getirir")
    public void kullaniciOlusturulanTestItemsÖğeBilgileriTablosunuSutunIsimlerineGoreGetirir() {
        String query_country="select * from c_test_item";
        System.out.println("Tablo sutun basliklari= " + DatabaseUtility.getColumnNames(query_country));

    }

    @And("Kullanıcı kayitli Test items\\(öğe) bilgilerini dogrulama yapabilmek icin idlere gore kaydeder")
    public void kullanıcıKayitliTestItemsÖğeBilgileriniDogrulamaYapabilmekIcinIdlereGoreKaydeder() {

        String query_country="select * from c_test_item";
        //    List<Object> countryList=DatabaseUtility.getColumnData(query_country,"name");
        //    String fileName="src/test/resources/testData/countryName.txt";
        //    WriteToTxt.saveCountryName(fileName,countryList);
        List<Object> countryList=DatabaseUtility.getColumnData(query_country,"id");
        String fileName="src/test/resources/testData/cuntryIds.txt";
        WriteToTxt.saveCountryName(fileName,countryList);
    }

    @And("Kullanici kayitli Test items\\(öğe) dogrular")
    public void kullaniciKayitliTestItemsÖğeDogrular() {


        //  String fileName="src/test/resources/testData/countryName.txt";
        String fileName="src/test/resources/testData/cuntryIds.txt";
        List<Object> actualCountryIdsList= ReadTxt.returnCountryIdsList(fileName);
        System.out.println("actualCountryList = " + actualCountryIdsList);

        List<Object> expectedCountryIdsList=new ArrayList<>();
        expectedCountryIdsList.add(238474);
        expectedCountryIdsList.add(27951);

        Assert.assertTrue(actualCountryIdsList.containsAll(expectedCountryIdsList));
    }
}
