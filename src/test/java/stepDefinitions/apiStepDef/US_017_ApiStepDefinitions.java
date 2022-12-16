package stepDefinitions.apiStepDef;

import base_url_setup.MedunnaBaseUrl;
import base_url_setup.base_url;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.hamcrest.core.IsEqual;
import org.junit.Test;
import utilities.Authentication2;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static utilities.Authentication.generateToken;

public class US_017_ApiStepDefinitions extends base_url {

    @Given("Admin testItems bilgilerini Get request ile alir")
    public void adminTestItemsBilgileriniGetRequestIleAlir() {
        spec.pathParams("bir", "api", "iki", "patients", "uc", 361212);
        response = given().spec(spec).headers("Authorization", "Bearer " + Authentication2.generateToken()).when().get("/{bir}/{iki}/{uc}");

        response.prettyPrint();


    }

    @When("Admin Status kodunu {int} oldugunu dogrular.")
    public void adminStatusKodunuOldugunuDogrular(int arg0) {

        response.then().assertThat().statusCode(200);
    }

    @Then("Admin gelen test items datalarini alir ve dogrular.")
    public void adminGelenTestItemsDatalariniAlirVeDogrular() {
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
        response.then().assertThat().body("id", IsEqual.equalTo(361212),
                "firstName", IsEqual.equalTo("Dianna"),
                "lastName", IsEqual.equalTo("Anderson"),
                "birthDate", IsEqual.equalTo("1995-12-11T22:00:00Z"),
                "phone", IsEqual.equalTo("2834304680"),
                "gender", IsEqual.equalTo("FEMALE"),
                "bloodGroup", IsEqual.equalTo("Anegative"),
                "adress", IsEqual.equalTo("1234.cd Ankara "),
                "email", IsEqual.equalTo("neville.hudson@yahoo.com"),
                "description", IsEqual.equalTo("team08"));
    }
}
