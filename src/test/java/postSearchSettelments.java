import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class postSearchSettelments {
    @Test
    public void postSettelmentsOk() {
        String JSON_STRING = "{\n" +
                "\"apiKey\": \"f0a8ed3fd5f618970de71afbc1d9828c\",\n" +
                " \"modelName\": \"Address\",\n" +
                "    \"calledMethod\": \"searchSettlements\",\n" +
                "    \"methodProperties\": {\n" +
                "        \"CityName\": \"київ\",\n" +
                "        \"Limit\": 5\n" +
                "    }\n" +
                "}";

        Response responce = given()
                .baseUri("https://api.novaposhta.ua/")
                .basePath("v2.0/json/")
                .body(JSON_STRING)
                .when().post();
        responce.then().assertThat().statusCode(200);

    }
}
