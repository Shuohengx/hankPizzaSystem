package com.hank.pizzSystem.hankPizzaSystem.entity;

import com.hank.pizzSystem.hankPizzaSystem.entity.Info.Topping;

import javax.persistence.*;
import java.util.List;

public class PizzaTopping {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;

    @Column(nullable = false, unique = true)
    private int pizzaId;

    @Column(nullable = false, unique = true)
    private int toppingId;


    @Column(nullable = false, unique = true)
    private float price;

    @Column(nullable = false, unique = true)
    private int quantity;
}
