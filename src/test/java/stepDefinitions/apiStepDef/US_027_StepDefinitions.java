package stepDefinitions.apiStepDef;

import baseUrl.MedunnaUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Message;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US_027_StepDefinitions extends MedunnaUrl {
    Message expectedData;
    Response response;
    Message actualData;
    String url;
    @Given("Kullanici mesajlari okumak icin baseUrl'den url getirir")
    public void kullanici_mesajlari_okumak_icin_base_url_den_url_getirir() {
        //https://medunna.com/api/c-messages/249766
        String url="https://medunna.com/api/c-messages/249766";
      //  spec.pathParams("first","api","second","c-messages","third",249766);

    }
    @Then("Kullanici olusturulmus mesajlari test etmek icin expected data olusturur")
    public void kullanici_olusturulmus_mesajlari_test_etmek_icin_expected_data_olusturur() {
        expectedData=new Message(249766,"Randy","benton.blanda@hotmail.com",
                "Team57","mesaj guncellendi");
        System.out.println("expectedData = " + expectedData);
    }
    @Then("Kullanici mesajlar icin get request gonderip response alir")
    public void kullanici_mesajlar_icin_get_request_gonderip_response_alir() {
    //   response=given().spec(spec).headers("Authorization","Bearer "+generateToken()).
    //           contentType(ContentType.JSON).body(expectedData).when().get("/{first}/{second}/{third}");
    //   response.prettyPrint();

        response=given().headers("Authorization","Bearer "+generateToken()).
                contentType(ContentType.JSON).when().get("https://medunna.com/api/c-messages/249766");
        response.prettyPrint();


    }
    @Then("Kullanici get status kod {int} oldugunu dogrular")
    public void kullanici_status_kod_oldugunu_dogrular(Integer int1) {
        Assert.assertEquals(200,response.getStatusCode());
    }
    @Then("Kullanici mesajlar icin actual datayi cagirir")
    public void kullanici_mesajlar_icin_actual_datayi_cagirir() {
        actualData=response.as(Message.class);
        System.out.println("actualData = " + actualData);
    }
    @Then("Kullanici mesajlar icin expected data ile actual datayi karsilastirarark dogrulama yapar")
    public void kullanici_mesajlar_icin_expected_data_ile_actual_datayi_karsilastirarark_dogrulama_yapar() {
        Assert.assertEquals(expectedData.getMessage(),actualData.getMessage());
    }
    @Given("Kullanici yeni mesaj olusturmak icin baseUrl'den url getirir")
    public void kullanici_yeni_mesaj_olusturmak_icin_base_url_den_url_getirir() {
        //  https://medunna.com/api/c-messages/
        String url="https://medunna.com/api/c-messages/";
      //  spec.pathParams("first","api","second","c-messages");
    }
    @Then("Kullanici yeni olusturulan mesaji test etmek icin expected data olusturur")
    public void kullanici_yeni_olusturulan_mesaji_test_etmek_icin_expected_data_olusturur() {
        expectedData=new Message(null,"Fatihkirac","fatih@gmail.com",
                "mesaj","mesaj olusturulabiliyor");
        System.out.println("expectedData = " + expectedData);
    }
    @Then("Kullanici yeni mesaj icin post request gonderip response alir")
    public void kullanici_yeni_mesaj_icin_post_request_gonderip_response_alir() {
    //    response=given().spec(spec).headers("Authorization","Bearer "+generateToken()).
    //            contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
    //    response.prettyPrint();

        response=given().headers("Authorization","Bearer "+generateToken()).
                contentType(ContentType.JSON).body(expectedData).when().post("https://medunna.com/api/c-messages/");
        response.prettyPrint();
    }

    @Then("Kullanici post status kod {int} oldugunu dogrular")
    public void kullanici_post_status_kod_oldugunu_dogrular(Integer int1) {
        Assert.assertEquals(201,response.getStatusCode());
    }

    @Then("Kullanici yeni olusturulan mesaj icin actual datayi cagirir")
    public void kullanici_yeni_olusturulan_mesaj_icin_actual_datayi_cagirir() {
        actualData=response.as(Message.class);
        System.out.println("actualData = " + actualData);
    }
    @Then("Kullanici yeni mesaj icin expected data ile actual datayi karsilastirarark dogrulama yapar")
    public void kullanici_yeni_mesaj_icin_expected_data_ile_actual_datayi_karsilastirarark_dogrulama_yapar() {
        Assert.assertEquals(expectedData.getMessage(),actualData.getMessage());
    }

}
