package com.eCommerce.demo.controller;

import com.eCommerce.demo.entity.Admin;
import com.eCommerce.demo.entity.User;
import com.eCommerce.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user/add")
    public String addUser(
            @RequestBody User user
    ){
        userService.addUser(user);
        return "success";
    }
    @GetMapping("/user/get")
    public List<User> getUser(){
        return userService.getUser();
    }

    @PutMapping("/user/update/{id}")
    public String updateUser(
            @PathVariable int id,
            @RequestBody User user
    ){
        userService.updateUser(id,user);
        return "success";
    }
    @DeleteMapping("/user/delete/{id}")
    public String deleteUser(
            @PathVariable int id
    ){
        userService.deleteUser(id);
        return "success";
    }

}

