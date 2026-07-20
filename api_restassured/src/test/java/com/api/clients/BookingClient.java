package com.api.clients;

import com.api.data.model.Booking;
import com.api.specs.RequestSpec;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BookingClient {

    public Response makeBooking(String token,Object body){
        return given()
                .spec(RequestSpec.bookingRequest(token))
                .body(body)
                .when()
                .post("");
    }
}
