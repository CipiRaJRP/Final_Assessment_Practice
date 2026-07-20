package com.api.tests;

import com.api.data.Testdata.TestUser;
import com.api.data.builder.BookingBuilder;
import com.api.data.builder.CustomerBuilder;
import com.api.data.model.Booking;
import com.api.data.model.Customer;
import com.api.specs.ResponseSpec;
import com.api.support.log.ExtentTestListener;
import com.api.support.log.Report;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

@ExtendWith(ExtentTestListener.class)
public class BookingTest extends BaseTest{

    @Test
    @DisplayName("Test for Bus Booking")
    public void busBookingCompleteFlow(){
        Report.step("Creating customer");

        Customer customer = new CustomerBuilder().setCustomer(TestUser.getName()).build();

        Report.step("Authenticating customer");
        String token = authClient.authentication(customer).then().extract().jsonPath().getString("token");
        Report.info("Auth Token", token);

        Booking booking = new BookingBuilder()
                .setJourneyType("bus")
                .setInventoryId("BUS-CCUDEL-02")
                .setSeatIds(List.of("S1","S2"))
                .setRefundable(true)
                .build();
        Report.step("Booking request prepared");

        Response response = bookingClient.makeBooking(token,booking);

        Report.info("Status Code", response.statusCode());
        response.then().spec(ResponseSpec.createdResponse());
        Report.pass("Bus booking created successfully");

    }

}





