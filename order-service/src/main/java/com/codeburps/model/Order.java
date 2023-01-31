package com.codeburps.model;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private int orderId;
    private int customerId;
    private List<Item> items;
    private double value;

    private int regionId;

    public Order(int orderId, int customerId, List<Item> items, double value, int regionId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.items = items;
        this.value = value;
        this.regionId = regionId;
    }
}
