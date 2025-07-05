package com.eCommerce.demo.controller;

import com.eCommerce.demo.entity.Order;

import com.eCommerce.demo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/order/add")
    public String addOrder(
            @RequestBody Order order
    ){
        orderService.addOrder(order);
        return "success";
    }
    @GetMapping("/order/get")
    public List<Order> getOrder(){
        return orderService.getOrder();
    }
    @PutMapping("/order/update/{id}")
    public String updateOrder(
            @PathVariable int id,
            @RequestBody Order order
    ){
        orderService.updateOrder(id,order);
        return "success";
    }
    @DeleteMapping("/order/delete/{id}")
    public String deleteOrder(
            @PathVariable int id
    ){
        orderService.deleteOrder(id);
        return "success";
    }

}
