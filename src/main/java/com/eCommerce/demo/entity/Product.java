package com.eCommerce.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String review;
    private int price;
    @ManyToMany(mappedBy = "product")
    @JsonBackReference
    private List<User> user;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="Inventory_id")
    Inventory inventory;
    

}