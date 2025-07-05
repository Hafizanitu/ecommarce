package com.eCommerce.demo.service;


import com.eCommerce.demo.entity.Order;
import com.eCommerce.demo.entity.Product;
import com.eCommerce.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public void addOrder(Product product) {
        productRepository.save(product);
    }

    public List<Product> getOrder() {
        return productRepository.findAll();
    }

    public void updateOrder(int id, Product product) {
        Product b = productRepository.findById(id).get();
        b.setName(product.getName());
        productRepository.save(b);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    public void updateProduct(int id, Product product) {
        Product b = productRepository.findById(id).get();
        b.setName(product.getName());
        productRepository.save(b);
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }
}

