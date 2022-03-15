package com.zuzex.calculator.entity;

import javax.persistence.*;

@Entity
public class QueryLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String text;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
