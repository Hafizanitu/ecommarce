package com.eCommerce.demo.service;

import com.eCommerce.demo.entity.User;
import com.eCommerce.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void addUser(User user) {
        userRepository.save(user);
    }

    public List<User> getUser() {
        return userRepository.findAll();
    }

    public void updateUser(int id, User user) {
        User b = userRepository.findById(id).get();
        b.setName(user.getName());
        userRepository.save(b);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}

