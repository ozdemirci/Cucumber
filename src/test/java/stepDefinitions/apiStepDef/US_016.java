package stepDefinitions.apiStepDef;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.RoomPost;

import static base_url_setup.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.*;
import static utilities.Authentication2.generateToken;

public class US_016 {

    Response response;
    RoomPost roomOlustur= new RoomPost();

    @Given("Admin oda olusturmak icin POST request gonderir")
    public void admin_oda_olusturmak_icin_post_request_gonderir() {
        spec.pathParams("bir", "api", "iki", "rooms");

        //Room data olusturma

        roomOlustur.setRoomNumber(3259884);
        roomOlustur.setRoomType("DELUXE");
        roomOlustur.setPrice(100);
        roomOlustur.setDescription("team08");
        roomOlustur.setStatus(true);

        response=given().headers("Authorization", "Bearer " + generateToken(),
                        "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON).spec(spec).contentType(ContentType.JSON).
                body(roomOlustur).when().post("/{bir}/{iki}");
    }


    @When("Admin Status kodunu {int} oldugunu dogrular")
    public void adminStatusKodunuOldugunuDogrular(int arg0) {
        response.then().assertThat().statusCode(201);
    }


    @Then("Admin gelen datalari alir ve dogrular")
    public void admin_gelen_datalari_alir_ve_dogrular() {


    }
}
