package com.eCommerce.demo.repository;


import com.eCommerce.demo.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer > {
}
