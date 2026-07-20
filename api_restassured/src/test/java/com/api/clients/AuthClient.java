package com.api.clients;

import com.api.data.builder.CustomerBuilder;
import com.api.data.model.Customer;
import io.restassured.response.Response;
import com.api.specs.*;

import static io.restassured.RestAssured.given;

public class AuthClient {

  public Response authentication(Customer customer){
      return given()
              .spec(RequestSpec.authRequest())
              .body(customer)
              .when()
              .post("");
  }

}
