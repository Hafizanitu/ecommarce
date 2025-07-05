package com.eCommerce.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Refund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantity;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="ReturnRequest_id")
    private ReturnRequest returnRequest;
}