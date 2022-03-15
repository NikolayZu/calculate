package com.zuzex.calculator.entity;

import javax.persistence.*;

@Entity
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String downloadAddress;
    private String shippingAddress;
    private double weight;
    private double size;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
