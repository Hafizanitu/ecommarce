package com.eCommerce.demo.controller;

import com.eCommerce.demo.entity.Admin;
import com.eCommerce.demo.service.AdminService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    @PostMapping("/admin/add")
    public String addAdmin(
            @RequestBody Admin admin
    ){
        adminService.addAdmin(admin);
        return "success";
    }
    @GetMapping("/admin/get")
    public List<Admin> getAdmin(){
        return adminService.getAdmin();
    }
    @PutMapping("/admin/update/{id}")
    public String updateAdmin(
            @PathVariable int id,
            @RequestBody Admin admin
    ){
        adminService.updateAdmin(id,admin);
        return "success";
    }
    @DeleteMapping("/admin/delete/{id}")
    public String deleteAdmin(
            @PathVariable int id
    ){
        adminService.deleteAdmin(id);
        return "success";
    }

}
