package com.hank.pizzSystem.hankPizzaSystem.entity.Info;


import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
public class Sauce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = false)
    private LocalDate createdTime;

    @Column(nullable = false, unique = false)
    private LocalDate lastUpdateTime;

    @Column(nullable = false, unique = true)
    private String SauceName;

    @Column(nullable = false, unique = true)
    private int unitPrice;




}
