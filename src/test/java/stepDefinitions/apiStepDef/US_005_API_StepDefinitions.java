package stepDefinitions.apiStepDef;

import baseUrl.MedunnaUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.*;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US_005_API_StepDefinitions extends MedunnaUrl {

    Response response;

    Appointments appointmentsExpectedData;

    Appointments appointmentsActualData;

    Physician physicianExpectedData;


    Patient patientExpectedData;

    Patient patientActualData;

    InPatients[] inPatientsExpectedData;


    Test[] testExpectedData;


    Country countryExpectedData;


    CountryInner countryInnerExpectedData;


    Cstate cstateExpectedData;

    State stateExpectedData;


    @Given("User generates token with admin account")
    public void userGeneratesTokenWithAdminAccount() {

        //   spec.pathParams("first", "api", "second", "appointments");

        response = given()
                // .spec(spec)
                .header("Authorization", "Bearer " + generateToken())
                .when()
                // get("/{first}/{second}/" + ConfigReader.getProperty("AA_appointmentId"));
                .get(ConfigReader.getProperty("appointmentGetUrl"));
        response.prettyPrint();
    }

    @When("User prepares expected data to verify")
    public void userPreparesExpectedDataToVerify() {
        testExpectedData = new Test[]{};

        countryExpectedData = new Country();

        countryInnerExpectedData = new CountryInner(1202, "Türkiyem");

        inPatientsExpectedData = new InPatients[]{};

        cstateExpectedData = new Cstate(1302, "Adana", countryInnerExpectedData);

        stateExpectedData = new State();

        patientExpectedData = new Patient("hastafaruk", "2022-12-11T20:34:11.898189Z", 305881, "HastaFaruk", "Kayali",
                "", "555-252-9202", "MALE", "Opositive", "asdasdzxcasdqwe",
                "hastafaruk35@gmail.com", "", countryExpectedData, inPatientsExpectedData, stateExpectedData);
        appointmentsExpectedData = new Appointments("hastafaruk", "2022-12-11T20:34:11.898189Z", 396358,
                "2023-01-11T00:00:00Z", "2023-01-11T01:00:00Z", "2022-12-29T01:00:00Z",
                "UNAPPROVED", "", "", "", "", "",
                physicianExpectedData, patientExpectedData, testExpectedData);
    }

    @Then("User send get request for appointment and get response")
    public void userSendGetRequestForAppointmentAndGetResponse() {

    }

    @And("User deserializes the appointment data to java")
    public void userDeserializesTheAppointmentDataToJava() {
        appointmentsActualData = response.as(Appointments.class);
        System.out.println("appointmentsActualData = " + appointmentsActualData);


        patientActualData = response.as(Patient.class);
        System.out.println("patientActualData = " + appointmentsActualData.getPatient());
    }

    @And("User verifies the response with the expected data")
    public void userVerifiesTheResponseWithTheExpectedData() {
        response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");
        assertEquals("Appointment olusturan bilgisi uyusmuyor", appointmentsExpectedData.getCreatedBy(), appointmentsActualData.getCreatedBy());
        assertEquals("Appointment olusturma tarihi uyusmuyor", appointmentsExpectedData.getCreatedDate(), appointmentsActualData.getCreatedDate());
        assertEquals("Hasta email bilgisi uyusmuyor", appointmentsExpectedData.getPatient().getEmail(), appointmentsActualData.getPatient().getEmail());
        assertEquals("Hasta adi uyusmuyor", appointmentsExpectedData.getPatient().getFirstName(), appointmentsActualData.getPatient().getFirstName());
        assertEquals("Hasta soyadi uyusmuyor", appointmentsExpectedData.getPatient().getLastName(), appointmentsActualData.getPatient().getLastName());
        assertEquals("Hasta id'si uyusmuyor", appointmentsExpectedData.getPatient().getId(), appointmentsActualData.getPatient().getId());


    }
}
