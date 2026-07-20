package com.api.data.model;

import java.util.List;

public record Booking (
    String journeyType,
    String inventoryId,
    List<String>  seatIds,
    boolean refundable,
    Integer holdTtlSec
){}
