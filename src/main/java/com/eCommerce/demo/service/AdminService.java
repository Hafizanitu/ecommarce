package com.eCommerce.demo.service;

import com.eCommerce.demo.entity.Admin;
import com.eCommerce.demo.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminRepository adminRepository;

    public List<Admin> getAdmin() {
        return adminRepository.findAll();
    }

    public void updateAdmin(int id, Admin admin) {
        Admin a = adminRepository.findById(id).get();
        a.setName(admin.getName());
        adminRepository.save(a);
    }

    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }

    public void addAdmin(Admin admin) {
        adminRepository.save(admin);
    }
}
