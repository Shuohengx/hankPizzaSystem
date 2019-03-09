package com.hank.pizzSystem.hankPizzaSystem.entity.Info;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Sauce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = false)
    private Timestamp createdTime;

    @Column(nullable = false, unique = false)
    private Timestamp lastUpdateTime;

    @Column(nullable = false, unique = true)
    private String SauceName;

    @Column(nullable = false, unique = true)
    private float unitPrice;




}
