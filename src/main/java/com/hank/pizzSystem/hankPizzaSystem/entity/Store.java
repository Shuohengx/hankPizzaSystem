package com.hank.pizzSystem.hankPizzaSystem.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(nullable = false, unique = true)
    private int storeAddressLine;

    @Column(nullable = false, unique = true)
    private String suburb;


    @Column(nullable = false, unique = false)
    private int storePostCode;

    @Column(nullable = false, unique = false)
    private String country;


    @Column(nullable = false, unique = true)
    private int storeContactNumber;

    @OneToMany
    private List<Staff> staffList;

}
