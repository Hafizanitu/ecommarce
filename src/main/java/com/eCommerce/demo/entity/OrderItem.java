package com.eCommerce.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantity;
    @ManyToOne
    @JoinColumn(name= "Product_id")
    @JsonBackReference
    private Product product;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="ReturnRequest_id")
    private ReturnRequest returnRequest;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}

