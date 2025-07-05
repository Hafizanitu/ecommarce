package com.eCommerce.demo.repository;


import com.eCommerce.demo.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Integer > {
}
