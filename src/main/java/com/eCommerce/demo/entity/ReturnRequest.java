package com.eCommerce.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class ReturnRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int quantity;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="OrderItem_id")
    OrderItem orderItem;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="Refund_id")
    Refund refund;
}
