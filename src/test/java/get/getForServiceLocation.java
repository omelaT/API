package get;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class getForServiceLocation {

    @Test
    public void getStatusForLocationService() {
    /*
   Задача:
1. Отправить get запрос для сервис Location на сайте www.metaweather.com
с помощью Rest Assured.
URL: https://www.metaweather.com/api/location/44418/
2. Проверить, что код ответа == 200
     */
    given().baseUri("https://www.metaweather.com/")
            .basePath("api/location/44418/")
            .when()
            .get()
            .then()
            .assertThat()
            .statusCode(200);

    }


}
