package com.api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ResponseSpec {

   public static ResponseSpecification okResponse(){
       return new ResponseSpecBuilder()
               .expectStatusCode(200)
               .expectContentType(ContentType.JSON)
               .build();
   }


    public static ResponseSpecification createdResponse(){
        return new ResponseSpecBuilder()
                .expectStatusCode(201)
                .expectContentType(ContentType.JSON)
                .expectBody(matchesJsonSchemaInClasspath("schemas/booking.schema.json"))
                .build();
    }
}
