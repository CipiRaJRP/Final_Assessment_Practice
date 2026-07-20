package com.api.data.builder;

import com.api.data.model.Booking;

import java.util.List;

public class BookingBuilder {

    private String journeyType = "Buses";
    private String inventoryId = "FL-DELBLR-51";
    private List<String> seatIds = List.of("12A","12B");
    private boolean refundable = true;
    private Integer holdTtlSec = 120;

    public BookingBuilder newBuilder() {
       return new BookingBuilder();
    }


    public String getJourneyType() {
        return journeyType;
    }

    public BookingBuilder setJourneyType(String journeyType) {
        this.journeyType = journeyType;
        return this;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public BookingBuilder setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }

    public List<String> getSeatIds() {
        return seatIds;
    }

    public BookingBuilder setSeatIds(List<String> seatIds) {
        this.seatIds = seatIds;
        return this;
    }

    public boolean isRefundable() {
        return refundable;
    }

    public BookingBuilder setRefundable(boolean refundable) {
        this.refundable = refundable;
        return this;
    }

    public Integer getHoldTtlSec() {
        return holdTtlSec;
    }

    public BookingBuilder setHoldTtlSec(Integer holdTtlSec) {
        this.holdTtlSec = holdTtlSec;
        return this;
    }

    public Booking build(){
        return new Booking(getJourneyType(),getInventoryId(),getSeatIds(),isRefundable(),getHoldTtlSec());
    }


}
