package stepDefinitions.apiStepDef;

import base_url_setup.base_url;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static utilities.Authentication2.generateToken;

public class US_18_StepDefinitionApi extends base_url {
    @Given("Admin physician bilgilerini Get request ile alir")
    public void adminPhysicianBilgileriniGetRequestIleAlir() {
        spec.pathParams("bir", "api", "iki", "patients", "uc", 361212);
        response = given().spec(spec).headers("Authorization", "Bearer " + generateToken()).when().get("/{bir}/{iki}/{uc}");

        response.prettyPrint();

    }

    @When("Adminn Status kodunu {int} oldugunu dogrular")
    public void adminnStatusKodunuOldugunuDogrular(int arg0) {
        response.then().assertThat().statusCode(200);
    }

    @Then("Admin gelen physician datalarini alir ve dogrular.")
    public void adminGelenPhysicianDatalariniAlirVeDogrular() {
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
