package com.fitness.ecommerce.service;

import com.fitness.ecommerce.model.Order;
import com.fitness.ecommerce.model.OrderStatus;
import com.fitness.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order updateStatus(Long id, OrderStatus status) {
        Order order = findById(id);
        if (order != null) {
            order.setStatus(status);
            return orderRepository.save(order);
        }
        return null;
    }

    public Order save(Order order) {
        return orderRepository.save(order);
    }
}