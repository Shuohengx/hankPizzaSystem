package com.hank.pizzSystem.hankPizzaSystem.entity;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Entity
//@Table(name = "[order]")
public class PizzaOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private Timestamp createdTime;

    @Column(nullable = false, unique = true)
    private Timestamp lastUpdateTime;
/*
    private enum status{


    };
    */

//    private float Voucher;

    @Column(nullable = false, unique = true)
    private String unitNumber;
    @Column(nullable = false, unique = true)
    private int streetNumber;
    @Column(nullable = false, unique = true)
    private String streetName;
    @Column(nullable = false, unique = true)
    private String suburbName;
    @Column(nullable = false, unique = true)
    private int postCode;
    @Column(nullable = false, unique = true)
    private String mobileNumber;

    @Column(nullable = false, unique = true)
    private int storeId;


    @OneToMany
    private List<PizzaOrderItem> orderItemList;



    public PizzaOrder(){

    }



}

