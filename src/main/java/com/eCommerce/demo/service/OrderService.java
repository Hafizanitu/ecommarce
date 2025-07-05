package com.eCommerce.demo.service;


import com.eCommerce.demo.entity.Order;
import com.eCommerce.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    public List<Order> getOrder() {
        return orderRepository.findAll();
    }

    public void updateOrder(int id, Order order) {
        Order b = orderRepository.findById(id).get();
        b.setName(order.getName());
        orderRepository.save(b);
    }

    public void deleteOrder(int id) {
        orderRepository.deleteById(id);
    }
}


