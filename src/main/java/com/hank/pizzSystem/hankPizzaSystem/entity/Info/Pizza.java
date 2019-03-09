package com.hank.pizzSystem.hankPizzaSystem.entity.Info;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = false)
    private Timestamp createdTime;

    @Column(nullable = false, unique = false)
    private Timestamp lastUpdateTime;

    @Column(nullable = false, unique = false)
    private String size;

    @Column(nullable = false, unique = false)
    private String pizzaName;

    @Column(nullable = false, unique = true)
    private float unitPrice;

    @Column(nullable = false, unique = false)
    private String toppingId;
    @Column(nullable = false, unique = false)
    private String cheeseId;
    @Column(nullable = false, unique = false)
    private String sauceId;




}
