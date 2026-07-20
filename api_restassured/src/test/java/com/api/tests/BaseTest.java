package com.api.tests;

import com.api.clients.AuthClient;
import com.api.clients.BookingClient;
import com.api.data.Testdata.TestUser;
import com.api.data.builder.CustomerBuilder;
import com.api.data.model.Customer;
import com.api.support.log.Report;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {


    static AuthClient authClient;
    static BookingClient bookingClient;
        @BeforeAll
        public static void setup() {
            authClient = new AuthClient();
            bookingClient = new BookingClient();
        }

}
