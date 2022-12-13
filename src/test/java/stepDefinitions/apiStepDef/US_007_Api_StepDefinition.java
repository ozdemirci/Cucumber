package stepDefinitions.apiStepDef;

import base_url_setup.base_url;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import io.restassured.http.ContentType;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import pojos.Appointments;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static utilities.Authentication2.generateToken;


public class US_007_Api_StepDefinition extends base_url {

    Response response;
    Map<String, Object> expectedData;
     Json json;


    @Given("Esra  {int}  id nolu hastanin randevularini get reguest ile ulasir")
    public void esraIdNoluHastaninRandevulariniGetReguestIleUlasir(int arg0) {


    spec.pathParams("1","api","2","appointments", "3",347300);
        response = given().spec(spec).headers("Authorization", "Bearer " + generateToken()).when().get("/{1}/{2}/{3}");
         response.prettyPrint();
    }

    @When("Esra gelen response'un status kodunun {int} oldugunu test eder")
    public void esraGelenResponseUnStatusKodununOldugunuTestEder(int arg0) {

        response.then().assertThat().statusCode(200);
    }





    @Then("Esra response bodydeki {int} nolu idnin  datalarla ayni oldugunu dogrular")
    public void esraResponseBodydekiNoluIdninDatalarlaAyniOldugunuDogrular(int arg0) {

     JsonPath json =response.jsonPath();
  Assert.assertEquals("patient",json.getString("patient.firstName"));
  Assert.assertEquals("Dilaraaa",json.getString("patient.lastName"));
  Assert.assertEquals(347300,json.getInt("id"));


    }



}
