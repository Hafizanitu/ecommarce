package com.eCommerce.demo.repository;


import com.eCommerce.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer >{

}

