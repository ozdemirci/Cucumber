package stepDefinitions.apiStepDef;

import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.Driver;

public class US_015 {
    /*
    "{
    ""createdBy"": ""team08"",
    ""createdDate"": ""2022-12-01T11:07:12.703141Z"",
    ""id"": 361212,
    ""firstName"": ""Dianna"",
    ""lastName"": ""Anderson"",
    ""birthDate"": ""1995-12-11T22:00:00Z"",
    ""phone"": ""2834304680"",
    ""gender"": ""FEMALE"",
    ""bloodGroup"": ""Anegative"",
    ""adress"": ""1234.cd Ankara "",
    ""email"": ""neville.hudson@yahoo.com"",
    ""description"": ""team08"",
    ""user"": {
        ""createdBy"": ""anonymousUser"",
        ""createdDate"": ""2021-12-25T15:59:36.508061Z"",
        ""id"": 3309,
        ""login"": ""jonathan"",
        ""firstName"": ""Gok"",
        ""lastName"": ""Ahmet1"",
        ""email"": ""ahmet@gmail.com"",
        ""activated"": true,
        ""langKey"": ""en"",
        ""imageUrl"": null,
        ""resetDate"": null,
        ""ssn"": ""128-65-1234""
    },
    ""appointments"": null,
    ""inPatients"": null,
    ""country"": {
        ""id"": 80065,
        ""name"": ""USA""
    },
    ""cstate"": null
}"
     */

    @Given("Admin medunna base url ine gider")
    public void admin_medunna_base_url_ine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty());
    }
    @When("Admin hasta bilgileri icin GET request gonderir ve GET response alir")
    public void admin_hasta_bilgileri_icin_get_request_gonderir_ve_get_response_alir() {

    }
    @Then("Admin deserialization yapar Json-Java")
    public void admin_deserialization_yapar_json_java() {

    }
    @And("Admin Status kodunun {string} oldugunu dogrular")
    public void adminStatusKodununOldugunuDogrular(String arg0) {
    }
    @Then("Admin verileri dogrular")
    public void admin_verileri_dogrular() {

    }


}
