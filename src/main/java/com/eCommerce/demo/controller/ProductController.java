package com.eCommerce.demo.controller;

import com.eCommerce.demo.entity.Order;
import com.eCommerce.demo.entity.Product;
import com.eCommerce.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/product/add")
    public String addProduct(
            @RequestBody    Product product
    ){
        productService.addProduct(product);
        return "success";
    }
    @GetMapping("/product/get")
    public List<Product> getProduct(){
        return  productService.getOrder();
    }
    @PutMapping("/product/update/{id}")
    public String updateProduct(
            @PathVariable int id,
            @RequestBody Product product
    ){
        productService.updateProduct(id,product);
        return "success";
    }
    @DeleteMapping("/ product/delete/{id}")
    public String deleteOrder(
            @PathVariable int id
    ){
        productService.deleteProduct(id);
        return "success";
    }

}
