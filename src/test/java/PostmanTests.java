import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostmanTests {

    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    void testGetWithQueryParam() {
        given()
            .queryParam("name", "Boris")
        .when()
            .get("/get")
        .then()
            .statusCode(200)
            .body("args.name", equalTo("Boris"))
            .body("url", containsString("name=Boris"));
    }

    @Test
    void testPostWithJsonBody() {
        String json = "{\"message\":\"Привет, Борис!\"}";

        given()
            .header("Content-Type", "application/json")
            .body(json)
        .when()
            .post("/post")
        .then()
            .statusCode(200)
            .body("data", equalTo(json))
            .body("json.message", equalTo("Привет, Борис!"));
    }

    @Test
    void testPutWithJsonBody() {
        String json = "{\"update\":\"true\"}";

        given()
            .header("Content-Type", "application/json")
            .body(json)
        .when()
            .put("/put")
        .then()
            .statusCode(200)
            .body("json.update", equalTo("true"))
            .body("data", equalTo(json));
    }

    @Test
    void testPatchWithJsonBody() {
        String json = "{\"patch\":\"yes\"}";

        given()
            .header("Content-Type", "application/json")
            .body(json)
        .when()
            .patch("/patch")
        .then()
            .statusCode(200)
            .body("json.patch", equalTo("yes"))
            .body("data", equalTo(json));
    }

    @Test
    void testDeleteWithJsonBody() {
        String json = "{\"delete\":\"me\"}";

        given()
            .header("Content-Type", "application/json")
            .body(json)
        .when()
            .delete("/delete")
        .then()
            .statusCode(200)
            .body("json.delete", equalTo("me"))
            .body("data", equalTo(json));
    }
