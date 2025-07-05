package com.eCommerce.demo.repository;


import com.eCommerce.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer > {
}
