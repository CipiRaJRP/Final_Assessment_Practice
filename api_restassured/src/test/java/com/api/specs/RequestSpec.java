package com.api.specs;

import com.api.config.Config;
import com.api.data.model.Customer;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RequestSpec {

    public static RequestSpecification requestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(Config.BASEURL())
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .build();
    }

    public static RequestSpecification authRequest(){
        return new RequestSpecBuilder()
                .addRequestSpecification(requestSpec())
                .setBasePath("/auth/login")
                .build();
    }

    public static RequestSpecification bookingRequest(String token) {
        return new RequestSpecBuilder()
                .addRequestSpecification(requestSpec())
                .setBasePath("/bookings")
                .addHeader("Authorization", "Bearer " + token)
                .build();
    }


}
