package com.thetestingacademy.APITesting_GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_003_BDDStyle_GetRequest {
    @Test
    public void test_GET_PositiveRequest() {
        String pin_code= "560037";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560037")
                .when()
                .log()
                .all()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);

    }
    @Test
    public void test_GET_NigativeRequest() {
        String pin_code= "-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pin_code)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);

    }
}
