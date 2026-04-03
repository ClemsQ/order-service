package com.example.orders.service;

import com.example.orders.domain.model.Order;
import com.example.orders.repository.OrderRepository;

public class OrderService {

    private final OrderRepository repo = new OrderRepository();
    private final CustomerService customerService = new CustomerService();
    private final PaymentService paymentService = new PaymentService();

    public Order create(Order order) {

        boolean isVip = customerService.isVip(order.getCustomerId());

        if (order.getAmount() > 1000 && !isVip) {
            order.setStatus("REJECTED");
            return repo.save(order);
        }

        paymentService.process(order);

        order.setStatus("CREATED");
        return repo.save(order);
    }
}