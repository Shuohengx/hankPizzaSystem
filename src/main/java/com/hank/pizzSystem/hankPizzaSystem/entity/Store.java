package com.hank.pizzSystem.hankPizzaSystem.entity;

import javax.persistence.*;


@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(nullable = false, unique = true)
    private String storeUnitNumber;
    @Column(nullable = false, unique = true)
    private int storeStreetNumber;
    @Column(nullable = false, unique = true)
    private String storeStreetName;
    @Column(nullable = false, unique = true)
    private String storeSuburbName;
    @Column(nullable = false, unique = true)
    private int storePostCode;
    @Column(nullable = false, unique = true)
    private int storeContactNumber;

}
