package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunnaUrl {

    protected static RequestSpecification spec;

    @Before
    public static void setUp(){
        spec=new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();
    }
}
