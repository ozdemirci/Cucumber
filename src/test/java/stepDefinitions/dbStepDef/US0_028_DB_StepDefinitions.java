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

public class US0_028_DB_StepDefinitions {

    @When("Kullanici kayitli ulkeler listesini gormek icin query olusturur")
    public void kullaniciKayitliUlkleriGorebilmekIcinQueryOlusturur() {
        String query_country="select * from country";
    }

    @And("Kullanici olusturulan ulkeler tablosunun sutun basliklarini getirir")
    public void kullaniciOlusturulanUlkelerTablosununSutunBAslikalriniGetirir() {
        String query_country="select * from country";
        System.out.println("Tablo sutun basliklari= " + DatabaseUtility.getColumnNames(query_country));
    }

    @And("Kullanici dogrulama yapabilmek icin ulkeleri idlere gore kaydeder")
    public void kullaniciDogrulamaYapabilmekIcinUlkeIsimleriniKaydeder() {
        String query_country="select * from country";
    //    List<Object> countryList=DatabaseUtility.getColumnData(query_country,"name");
    //    String fileName="src/test/resources/testData/countryName.txt";
    //    WriteToTxt.saveCountryName(fileName,countryList);
        List<Object> countryList=DatabaseUtility.getColumnData(query_country,"id");
        String fileName="src/test/resources/testData/cuntryIds.txt";
        WriteToTxt.saveCountryName(fileName,countryList);

    }

    @And("Kullanici Ulke isimlerine gore dogrulama yapar")
    public void kullaniciUlkeIsimlerineGoreDogrulamaYapar() {
      //  String fileName="src/test/resources/testData/countryName.txt";
        String fileName="src/test/resources/testData/cuntryIds.txt";
        List<Object> actualCountryIdsList= ReadTxt.returnCountryIdsList(fileName);
        System.out.println("actualCountryList = " + actualCountryIdsList);

       List<Object> expectedCountryIdsList=new ArrayList<>();
        expectedCountryIdsList.add(238474);
        expectedCountryIdsList.add(27951);

        Assert.assertTrue(actualCountryIdsList.containsAll(expectedCountryIdsList));
    }

    @Given("Kullanici kayitli sehirler listesini gormek icin query olusturur")
    public void kullaniciKayitliSehirlerListesiniGormekIcinQueryOlusturur() {
        String query_city="select * from c_state";
    }

    @Then("Kullanici olusturulan sehirler tablosunun sutun basliklarini getirir")
    public void kullaniciOlusturulanSehirlerTablosununSutunBasliklariniGetirir() {
        String query_city="select * from c_state";
        System.out.println("Sehir column isimleri= " + DatabaseUtility.getColumnNames(query_city));
    }

    @When("Kullanici olusturulan sehirleri sehir id no'ya gore getirir")
    public void kullaniciOlusturulanSehirleriSehirIdNoYaGoreGetirir() {
        String query_city="select * from c_state";
        System.out.println("Id ye gore sehirler listesi= " + DatabaseUtility.getColumnData(query_city, "id"));
    }

    @And("Kullanici dogrulama yapabilmek sehirleri idlere gore kaydeder")
    public void kullaniciDogrulamaYapabilmekIcinBirÜlkeIdSineBaglıSehirIsimleriniKaydeder() {
        String query_city="select * from c_state";
        List<Object> cityIdList=DatabaseUtility.getColumnData(query_city,"id");
        System.out.println("cityIdList = " + cityIdList);
        String fileName="src/test/resources/testData/cityIds.txt";
        WriteToTxt.cityIds(fileName,cityIdList);
    }

    @And("Kullanici sehir isimlerini dogrular")
    public void kullaniciSehirIsimleriniDogrular() {
        String fileName="src/test/resources/testData/cityIds.txt";
        List<Object> actualCityIdList=ReadTxt.returnCityIdsList(fileName);
        System.out.println("actualCountryIdList = " + actualCityIdList);
        List<Object> expectedCityIdsList=new ArrayList<>();
        expectedCityIdsList.add(207076);
        expectedCityIdsList.add(1262);

        Assert.assertTrue(actualCityIdList.containsAll(expectedCityIdsList));
    }



}
