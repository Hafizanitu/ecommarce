package com.eCommerce.demo.repository;


import com.eCommerce.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer > {
}
