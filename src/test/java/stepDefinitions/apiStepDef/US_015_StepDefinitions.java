package stepDefinitions.apiStepDef;

import baseUrl.MedunnaUrl;
import base_url_setup.base_url;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.junit.Test;
import pojos.Patient;
import utilities.Authentication;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static utilities.Authentication2.generateToken;


public class US_015_StepDefinitions extends base_url {
    Response response;
    Patient patient;
    @Given("Admin hasta bilgilerini Get request ile alir")
    public void admin_hasta_bilgilerini_get_request_ile_alir() {
       spec.pathParams("bir", "api", "iki", "patients", "uc", 361212);
       response = given().spec(spec).headers("Authorization", "Bearer " + generateToken()).when().get("/{bir}/{iki}/{uc}");

        response.prettyPrint();

    }

    @Then("Admin status konunun {int} oldugunu dogrular")
    public void admin_status_konunun_oldugunu_dogrular(Integer int1) {
        response.then().assertThat().statusCode(200);

    }

    @Then("admin hasta bilgilerini dogrular")
    public void admin_hasta_bilgilerini_dogrular() {
        /*
        {
    "id": 361212,
    "firstName": "Dianna",
    "lastName": "Anderson",
    "birthDate": "1995-12-11T22:00:00Z",
    "phone": "2834304680",
    "gender": "FEMALE",
    "bloodGroup": "Anegative",
    "adress": "1234.cd Ankara ",
    "email": "neville.hudson@yahoo.com",
    "description": "team08",}
        */
        response.then().assertThat().body("id", equalTo(361212),
                "firstName",equalTo("Dianna"),
                "lastName",equalTo("Anderson"),
                "birthDate",equalTo("1995-12-11T22:00:00Z"),
                "phone",equalTo("2834304680"),
                "gender",equalTo("FEMALE"),
                "bloodGroup",equalTo("Anegative"),
                "adress",equalTo("1234.cd Ankara "),
                "email",equalTo("neville.hudson@yahoo.com"),
                "description",equalTo("team08"));

    }
}
