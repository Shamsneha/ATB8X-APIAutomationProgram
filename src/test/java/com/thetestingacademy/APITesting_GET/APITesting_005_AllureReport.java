package com.thetestingacademy.APITesting_GET;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_005_AllureReport {
        static RequestSpecification r = RestAssured.given();
        @Description("TC1:Positive")
    @Test
    public void test_GET_Request_NonBDDStyle() {

        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/388620");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);

    }
@Description("TC2:Negative")
    @Test
    public void test_GET_Request_NonBDDStyle_negative() {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/-1");
        r.when().log().all().get();
        r.then().log().all().statusCode(404);
}}
