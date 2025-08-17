import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostmanTests {

    static {
        RestAssured.baseURI = "https://postman-echo.com";
    }

    @Test
    void testGet() {
        when()
                .get("/get")
                .then()
                .statusCode(200);
    }

    @Test
    void testPost() {
        when()
                .post("/post")
                .then()
                .statusCode(200);
    }

    @Test
    void testPut() {
        when()
                .put("/put")
                .then()
                .statusCode(200);
    }

    @Test
    void testPatch() {
        when()
                .patch("/patch")
                .then()
                .statusCode(200);
    }

    @Test
    void testDelete() {
        when()
                .delete("/delete")
                .then()
                .statusCode(200);
    }

    @Test
    void testHead() {
        when()
                .head("/get")
                .then()
                .statusCode(200);
    }
}