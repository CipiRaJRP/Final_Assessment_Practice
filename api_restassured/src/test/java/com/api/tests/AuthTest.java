package com.api.tests;

import com.api.clients.AuthClient;
import com.api.data.Testdata.TestUser;
import com.api.data.builder.CustomerBuilder;
import com.api.data.model.Customer;
import com.api.specs.ResponseSpec;
import com.api.support.log.ExtentTestListener;
import com.fasterxml.jackson.databind.ser.Serializers;
import io.restassured.response.Response;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ExtentTestListener.class)
public class AuthTest extends BaseTest{


    @Test
    @DisplayName("Authentication of the User")
    public void authenticationOfTheUserHeidi(){
        Customer customer = new CustomerBuilder().setCustomer(TestUser.getName()).build();
        authClient.authentication(customer).then().spec(ResponseSpec.okResponse());
    }
}
