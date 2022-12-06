package stepDefinitions.dbStepDef;

import org.junit.Assert;
import org.testng.annotations.Test;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtility.getColumnData;

public class US007_Db_Stepdefinitions {

    @Test
    public void test(){

        //Esra database ile baglanti kurar
        DatabaseUtility.createConnection();


        //Esra randevulari goruntuleyebilmek icin query olusturur
        String query ="select * from appointment";



        // Esra randevulari id sutununa gore listeler
        System.out.println(DatabaseUtility.getColumnNames(query)+ "/n");
        System.out.println(getColumnData(query,"id")+"/n");


        //337470 randevu id`li hastanin bilgilerini listeler
        // String hastaquery= "select * from appointment where id=337470";
        //System.out.println("337470 id`li data" + DatabaseUtility.getRowList(hastaquery)+"/n");

        // Esra randevulari goruntuleyebilmek icin kaydeder
        System.out.println("===============Id list===========");
        List<Object> idList= getColumnData(query,"id");
        System.out.println(idList+"/n");
        String fileName1= "src/test/resources/testdata/AppointmentData";
        WriteToTxt.saveAppointmenIds(fileName1,idList);



        // Esra randevulari dogrular
        List<Object> actualAppointmentIDs= ReadTxt.returnAppointmentIDsList(fileName1);
        List<Object> expectedAppointmentIDs= new ArrayList<>();
        expectedAppointmentIDs.add(337470);

        Assert.assertTrue("id`ler uyusmuyor",actualAppointmentIDs.containsAll(expectedAppointmentIDs));
    }

}
