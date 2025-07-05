package com.eCommerce.demo.repository;


import com.eCommerce.demo.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer >{
}