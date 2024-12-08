package com.thetestingacademy.APITesting_PATCH;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_NonBDDStyle {
    @Description("Verify to PATCH Request:NonBDD Style")
    @Test
    public void test_NonBDDStyle(){
String payload="'{\\n\" +\n" +
        "                \"    \\\"firstname\\\" : \\\"James\\\",\\n\" +\n" +
        "                \"    \\\"lastname\\\" : \\\"Brown\\\"\\n\" +\n" +
        "                \"}'";

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
               r.basePath("/booking/:id");
                r.contentType(ContentType.JSON);
                r.log().all().body(payload);
                r.when().log().all().patch();
                r.then().log().all().statusCode(200);
    }
}
