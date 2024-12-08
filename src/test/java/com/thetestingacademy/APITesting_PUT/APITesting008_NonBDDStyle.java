package com.thetestingacademy.APITesting_PUT;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting008_NonBDDStyle {
    //{
    //    "bookingid": 2775,
    //    "booking": {
    //        "firstname": "Jim",
    //        "lastname": "Brown",
    //        "totalprice": 111,
    //        "depositpaid": true,
    //        "bookingdates": {
    //            "checkin": "2018-01-01",
    //            "checkout": "2019-01-01"
    //        },
    //        "additionalneeds": "Breakfast"
    //    }
    //}
    //Token="421ff030f1af540"


    @Description("Verify To test PUTRequest:Restful-Booker")
    @Test
            public void test_PUTRequest_NonBDDStyle(){
    String Token= "d5c18e00e6c57de";
    String Booking_ID=" 4431";
    String payload="{\n" +
            "    \"firstname\" : \"Jim\",\n" +
            "    \"lastname\" : \"Brown\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";
    RequestSpecification r = RestAssured.given();
    r.baseUri("https://restful-booker.herokuapp.com");
    r.basePath("/booking/1"+Booking_ID);
        r.contentType(ContentType.JSON);
        r.cookie("token",Token);
        r.body(payload).log().all();
        Response response=r.when().log().all().put();
        ValidatableResponse validatableResponse= response.then().log().all();
        validatableResponse.statusCode(200);

}}
