package ru.netology.serviceTests ;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void ShouldReturnPostData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello World!")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .log().body()
                .body("data", equalTo("Hello World"))
        ;
    }
}
