package stepDefinitions.dbStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtility.getColumnData;

public class DBTest07 {
    @Given("Esra database ile baglanti kurar")
    public void esraDatabaseIleBaglantiKurar() {
        DatabaseUtility.createConnection();
    }

    @When("Esra randevulari goruntuleyebilmek icin query olusturur")
    public void esraRandevulariGoruntuleyebilmekIcinQueryOlusturur() {
        String query ="select * from appointment";

    }

    @Then("Esra randevulari id sutununa gore listeler")
    public void esraRandevulariIdSutununaGoreListeler() {
        String query ="select * from appointment";
        System.out.println(DatabaseUtility.getColumnNames(query)+ "/n");
        System.out.println(getColumnData(query,"id")+"/n");
    }

    @And("Esra randevulari goruntuleyebilmek icin kaydeder")
    public void esraRandevulariGoruntuleyebilmekIcinKaydeder() {
        System.out.println("===============Id list===========");
        String query ="select * from appointment";
        List<Object> idList= getColumnData(query,"id");
        System.out.println(idList+"/n");
        String fileName1= "src/test/resources/testdata/AppointmentData";
        WriteToTxt.saveAppointmenIds(fileName1,idList);



    }

    @And("Esra randevulari dogrular")
    public void esraRandevulariDogrular() {
        String fileName1= "src/test/resources/testdata/AppointmentData";
        List<Object> actualAppointmentIDs= ReadTxt.returnAppointmentIDsList(fileName1);
        List<Object> expectedAppointmentIDs= new ArrayList<>();
        expectedAppointmentIDs.add(337470);

        Assert.assertTrue("id`ler uyusmuyor",actualAppointmentIDs.containsAll(expectedAppointmentIDs));
    }

}

