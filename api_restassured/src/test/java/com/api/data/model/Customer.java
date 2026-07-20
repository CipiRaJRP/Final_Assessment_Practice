package com.api.data.model;

import java.time.LocalDate;

public record Customer(
        String email,
        String password
) {
}
