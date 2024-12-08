package com.thetestingacademy.APITesting_GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_GET_Request_TestNg {
    @Test
    public void test_GET_Request() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1")
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
}