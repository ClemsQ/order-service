package com.example.orders.repository;

import com.example.orders.domain.model.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
    private final Map<Long, Order> db = new HashMap<>();

    public Order save(Order order) {
        return order;
    }
}
