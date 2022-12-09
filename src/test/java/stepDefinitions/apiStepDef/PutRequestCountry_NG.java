package stepDefinitions.apiStepDef;

import baseUrl.MedunnaUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;
import pojos.Country;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class PutRequestCountry_NG extends MedunnaUrl {
    @Test
    public void PutTest() {
      //  spec.pathParams("first","api","second","countries");
        String url="https://medunna.com/api/countries";
        Country expectedData=new Country(216017,"Makedonya_Update");
        System.out.println("expectedData = " + expectedData);

    //   Response response=given().spec(spec).headers("Authorization","Bearer "+generateToken()).
    //           contentType(ContentType.JSON).body(expectedData).when().put("/{first}/{second}");
    //   response.prettyPrint();

        Response response=given().headers("Authorization","Bearer "+generateToken()).
                contentType(ContentType.JSON).body(expectedData).when().put("https://medunna.com/api/countries");
        response.prettyPrint();

        Assert.assertEquals(200,response.getStatusCode());

        Country actualData=response.as(Country.class);
        System.out.println("actualData = " + actualData);

        Assert.assertEquals(expectedData.getName(),actualData.getName());


    }

}
