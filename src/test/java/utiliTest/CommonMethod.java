package utiliTest;

import groovy.util.logging.Log;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class CommonMethod {
    public static Response
    get(String endpoint, Map<String, Object> queryParams) {
        return
                given().header("Content-Type", "application/json").
                        queryParams(queryParams).when().get(endpoint);

    }
    public static void validateStatusCode(Response response, int expectedStatusCode) {
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode, "Expected status code: " + expectedStatusCode);
    }
}
