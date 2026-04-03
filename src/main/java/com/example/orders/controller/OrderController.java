package com.example.orders.controller;

import com.example.orders.domain.model.Order;
import com.example.orders.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service = new OrderService();

    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.create(order);
    }
}