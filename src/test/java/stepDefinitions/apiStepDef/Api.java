package stepDefinitions.apiStepDef;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Api {
    @Test
    public void api() {
        String get="https://https://medunna.com/api/appointments";
        String body="{\n" +
                "  \"anamnesis\": \"string\",\n" +
                "  \"createdBy\": \"string\",\n" +
                "  \"createdDate\": \"\",\n" +
                "  \"ctests\": [\n" +
                "    {\n" +
                "      \"appointment\": \"string\",\n" +
                "      \"createdBy\": \"string\",\n" +
                "      \"createdDate\": \"2022-11-27T15:12:01.635Z\",\n" +
                "      \"ctestResults\": [\n" +
                "        {\n" +
                "          \"createdBy\": \"string\",\n" +
                "          \"createdDate\": \"2022-11-27T15:12:01.635Z\",\n" +
                "          \"ctest\": \"string\",\n" +
                "          \"ctestItem\": {\n" +
                "            \"createdBy\": \"string\",\n" +
                "            \"createdDate\": \"2022-11-27T15:12:01.635Z\",\n" +
                "            \"defaultValMax\": \"string\",\n" +
                "            \"defaultValMin\": \"string\",\n" +
                "            \"description\": \"string\",\n" +
                "            \"id\": 0,\n" +
                "            \"name\": \"string\",\n" +
                "            \"price\": 0\n" +
                "          },\n" +
                "          \"date\": \"2022-11-27T15:12:01.635Z\",\n" +
                "          \"description\": \"string\",\n" +
                "          \"id\": 0,\n" +
                "          \"result\": \"string\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"date\": \"2022-11-27T15:12:01.635Z\",\n" +
                "      \"description\": \"string\",\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"description\": \"string\",\n" +
                "  \"diagnosis\": \"string\",\n" +
                "  \"endDate\": \"2022-11-27T15:12:01.635Z\",\n" +
                "  \"id\": 0,\n" +
                "  \"patient\": {\n" +
                "    \"adress\": \"string\",\n" +
                "    \"appointments\": [\n" +
                "      \"string\"\n" +
                "    ],\n" +
                "    \"birthDate\": \"2022-11-27T15:12:01.635Z\",\n" +
                "    \"bloodGroup\": \"Apositive\",\n" +
                "    \"country\": {\n" +
                "      \"id\": 348061,\n" +
                "      \"name\": \"string\"\n" +
                "    },\n" +
                "    \"createdBy\": \"string\",\n" +
                "    \"createdDate\": \"2022-11-27T15:12:01.635Z\",\n" +
                "    \"cstate\": {\n" +
                "      \"country\": {\n" +
                "        \"id\": 0,\n" +
                "        \"name\": \"string\"\n" +
                "      },\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    },\n" +
                "    \"description\": \"string\",\n" +
                "    \"email\": \"string\",\n" +
                "    \"firstName\": \"string\",\n" +
                "    \"gender\": \"MALE\",\n" +
                "    \"id\": 0,\n" +
                "    \"inPatients\": [\n" +
                "      {\n" +
                "        \"appointment\": \"string\",\n" +
                "        \"createdBy\": \"string\",\n" +
                "        \"createdDate\": \"2022-11-27T15:12:01.635Z\",\n" +
                "        \"description\": \"string\",\n" +
                "        \"endDate\": \"2022-11-27T15:12:01.635Z\",\n" +
                "        \"id\": 0,\n" +
                "        \"patient\": \"string\",\n" +
                "        \"room\": {\n" +
                "          \"createdBy\": \"string\",\n" +
                "          \"createdDate\": \"2022-11-27T15:12:01.635Z\",\n" +
                "          \"description\": \"string\",\n" +
                "          \"id\": 0,\n" +
                "          \"price\": 0,\n" +
                "          \"roomNumber\": 0,\n" +
                "          \"roomType\": \"TWIN\",\n" +
                "          \"status\": true\n" +
                "        },\n" +
                "        \"startDate\": \"2022-11-27T15:12:01.635Z\",\n" +
                "        \"status\": \"UNAPPROVED\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"lastName\": \"string\",\n" +
                "    \"phone\": \"string\",\n" +
                "    \"ssn\": \"272-48-7699\",\n" +
                "    \"user\": {\n" +
                "      \"activated\": true,\n" +
                "      \"createdBy\": \"string\",\n" +
                "      \"createdDate\": \"2022-11-27T15:12:01.636Z\",\n" +
                "      \"email\": \"string\",\n" +
                "      \"firstName\": \"string\",\n" +
                "      \"id\": 0,\n" +
                "      \"imageUrl\": \"string\",\n" +
                "      \"langKey\": \"string\",\n" +
                "      \"lastName\": \"string\",\n" +
                "      \"login\": \"string\",\n" +
                "      \"resetDate\": \"2022-11-27T15:12:01.636Z\",\n" +
                "      \"ssn\": \"411-86-7951\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"physician\": {\n" +
                "    \"adress\": \"string\",\n" +
                "    \"appointments\": [\n" +
                "      \"string\"\n" +
                "    ],\n" +
                "    \"birthDate\": \"2022-11-27T15:12:01.636Z\",\n" +
                "    \"bloodGroup\": \"Apositive\",\n" +
                "    \"country\": {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    },\n" +
                "    \"createdBy\": \"string\",\n" +
                "    \"createdDate\": \"2022-11-27T15:12:01.636Z\",\n" +
                "    \"cstate\": {\n" +
                "      \"country\": {\n" +
                "        \"id\": 0,\n" +
                "        \"name\": \"string\"\n" +
                "      },\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    },\n" +
                "    \"description\": \"string\",\n" +
                "    \"examFee\": 0,\n" +
                "    \"firstName\": \"string\",\n" +
                "    \"gender\": \"MALE\",\n" +
                "    \"id\": 0,\n" +
                "    \"image\": \"string\",\n" +
                "    \"imageContentType\": \"string\",\n" +
                "    \"lastName\": \"string\",\n" +
                "    \"phone\": \"string\",\n" +
                "    \"speciality\": \"ALLERGY_IMMUNOLOGY\",\n" +
                "    \"ssn\": \"273-96-7100\",\n" +
                "    \"user\": {\n" +
                "      \"activated\": true,\n" +
                "      \"createdBy\": \"string\",\n" +
                "      \"createdDate\": \"2022-11-27T15:12:01.637Z\",\n" +
                "      \"email\": \"string\",\n" +
                "      \"firstName\": \"string\",\n" +
                "      \"id\": 0,\n" +
                "      \"imageUrl\": \"string\",\n" +
                "      \"langKey\": \"string\",\n" +
                "      \"lastName\": \"string\",\n" +
                "      \"login\": \"string\",\n" +
                "      \"resetDate\": \"2022-11-27T15:12:01.637Z\",\n" +
                "      \"ssn\": \"333-95-6507\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"prescription\": \"string\",\n" +
                "  \"startDate\": \"\",\n" +
                "  \"status\": \"PENDING\",\n" +
                "  \"treatment\": \"string\"\n" +
                "}";
       Response response= given().when().body(body).put(get);
       response.prettyPrint();
    }


}
