package com.api.clients;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class ApiSpec {

    public RequestSpecification requestspec(){
        return  new RequestSpecBuilder()
                .setBaseUri()
    }
}
