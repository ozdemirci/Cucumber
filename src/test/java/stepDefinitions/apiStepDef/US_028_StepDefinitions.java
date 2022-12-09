package stepDefinitions.apiStepDef;

import baseUrl.MedunnaUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Country;
import pojos.CountryInner;
import pojos.Cstate;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US_028_StepDefinitions extends MedunnaUrl {
    Country expectedData;
    Country actualData;

    Response response;
    @Given("Kullanici ulke icin baseUrl'den url getirir")
    public void kullanici_ulke_icin_base_url_den_url_getirir() {

        //https://medunna.com/api/countries
        String url="https://medunna.com/api/countries";
     //   spec.pathParams("first","api","second","countries");
    }
    @Then("Kullanici yeni bir ulke olusturulabildigini test etmek icin expected data olusturur")
    public void kullanici_yeni_bir_ulke_olusturulabildigini_test_etmek_icin_expected_data_olusturur() {
        expectedData=new Country(null,"Elbistan");
        System.out.println("expectedData = " + expectedData);
    }
    @Then("Kullanici ulke icin  request gonderip response alir")
    public void kullanici_ulke_icin_request_gonderip_response_alir() {
    //    response=given().spec(spec).headers("Authorization","Bearer "+generateToken()).
    //            contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
    //    response.prettyPrint();

        response=given().headers("Authorization","Bearer "+generateToken()).
                contentType(ContentType.JSON).body(expectedData).when().post("https://medunna.com/api/countries");
        response.prettyPrint();
    }

    @Then("Kullanici Country post status kod {int} oldugunu dogrular")
    public void kullanici_Country_post_status_kod_oldugunu_dogrular(Integer int1) {
        Assert.assertEquals(201,response.getStatusCode());
    }
    @Then("Kullanici ulke icin actual datayi cagirir")
    public void kullanici_ulke_icin_actual_datayi_cagirir() {
        actualData=response.as(Country.class);
        System.out.println("actualData = " + actualData);
    }
    @Then("Kullanici ulke icin expected data ile actual datayi karsilastirarark dogrulama yapar")
    public void kullanici_ulke_icin_expected_data_ile_actual_datayi_karsilastirarark_dogrulama_yapar() {
        Assert.assertEquals(expectedData.getName(),actualData.getName());
    }

    @Given("Kullanici sehir icin baseUrl'den url getirir")
    public void kullanici_sehir_icin_base_url_den_url_getirir() {
        //https://medunna.com//api/c-states

        String url="https://medunna.com//api/c-states";
       // spec.pathParams("first","api","second","c-states");
    }
    @Then("Kullanici yeni bir sehir olusturulabildigini test etmek icin expected data olusturur")
    public void kullanici_yeni_bir_sehir_olusturulabildigini_test_etmek_icin_expected_data_olusturur() {
        CountryInner country=new CountryInner(null,"Elbistan");
        Cstate expectedData=new Cstate(null,"yapalak",country);
        System.out.println("expectedData = " + expectedData);
    }
    @Then("Kullanici sehir icin request gonderip response alir")
    public void kullanici_sehir_icin_request_gonderip_response_alir() {
     //   Response response=given().spec(spec).headers("Authorization","Bearer "+generateToken()).
     //           contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
     //   response.prettyPrint();

        response=given().headers("Authorization","Bearer "+generateToken()).
                contentType(ContentType.JSON).body(expectedData).when().post("https://medunna.com//api/c-states}");
        response.prettyPrint();
    }


    @Then("Kullanici sehir post status kod {int} oldugunu dogrular")
    public void kullanici_sehir_post_status_kod_oldugunu_dogrular(Integer int1) {
        Assert.assertEquals(201,response.getStatusCode());
    }
    @Then("Kullanici sehir icin actual datayi cagirir")
    public void kullanici_sehir_icin_actual_datayi_cagirir() {
        Cstate actualData=response.as(Cstate.class);
        System.out.println("actualData = " + actualData);
    }
    @Then("Kullanici sehir icin expected data ile actual datayi karsilastirarark dogrulama yapar")
    public void kullanici_sehir_icin_expected_data_ile_actual_data_yi_karsilastirarark_dogrulama_yapar() {
        Assert.assertEquals(expectedData.getName(),actualData.getName());
    }

    @Then("Kullanici olusturulan ulkenin guncellenebildigini test etmek icin expected data olusturur")
    public void kullaniciOlusturulanUlkeninGuncellenebildiginiTestEtmekIcinExpectedDataOlusturur() {
        expectedData=new Country(216017,"Makedonya_Update");
        System.out.println("expectedData = " + expectedData);
    }

    @And("Kullanici guncellenecek ulke icin put request gonderip response alir")
    public void kullaniciGuncellenecekUlkeIcinPutRequestGonderipResponseAlir() {
        response=given().headers("Authorization","Bearer "+generateToken()).
                contentType(ContentType.JSON).body(expectedData).when().put("https://medunna.com/api/countries");
        response.prettyPrint();
    }

    @And("Kullanici guncellenen ulke icin actual datayi cagirir")
    public void kullaniciGuncellenenUlkeIcinActualDatayiCagirir() {
        actualData=response.as(Country.class);
        System.out.println("actualData = " + actualData);
    }

    @And("Kullanici guncellenen Country post status kod {int} oldugunu dogrular")
    public void kullaniciGuncellenenCountryPostStatusKodOldugunuDogrular(int arg0) {
        Assert.assertEquals(200,response.getStatusCode());
    }
    @And("Kullanici guncellenen ulke icin expected data ile actual datayi karsilastirarark dogrulama yapar")
    public void kullaniciGuncellenenUlkeIcinExpectedDataIleActualDatayiKarsilastirararkDogrulamaYapar() {
        Assert.assertEquals(expectedData.getName(),actualData.getName());
    }


}
