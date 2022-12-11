package stepDefinitions.dbStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class US_005_DB_StepDefinitions extends DatabaseUtility {

    String request;
    List<String> actualData;
    List<String> expectedData;

    @Given("User connects to the database")
    public void userConnectsToTheDatabase() {
        createConnection();
    }

    @Then("User gets appointments data from DB")
    public void userGetsAppointmentsDataFromDB() {
        request = "SELECT patient_id, created_by, created_date FROM public.appointment WHERE id=393601";
        actualData = new ArrayList<>();
        actualData.add(getColumnData(request, "patient_id").toString());
        actualData.add(getColumnData(request, "created_by").toString());
        actualData.add(getColumnData(request, "created_date").toString());
    }

    @And("User validates appointment using id with DB")
    public void userValidatesAppointmentUsingIdWithDB() {
        expectedData = new ArrayList<>();
        expectedData.add("[3356]");
        expectedData.add("[hastafaruk]");
        expectedData.add("[2022-12-10 17:00:14.746482]");

        for (int i = 0; i < actualData.size(); i++) {
            assertEquals(i+" inci sutun eslesmedi", expectedData.get(i), actualData.get(i));

        }
    }

    @And("User closes to database connection")
    public void userClosesToDatabaseConnection() {
        closeConnection();
    }
}
