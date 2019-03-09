package com.hank.pizzSystem.hankPizzaSystem.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
//@Table(name = "[pizzaOrderItem]")
public class PizzaOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String pizzaId;

    @Column(nullable = false, unique = false)
    private Timestamp createdTime;

    @Column(nullable = false, unique = false)
    private Timestamp lastUpdateTime;


    @Column(nullable = false)
    private String orderItemName;


    @Column(nullable = false)
    private int orderItemQuantity;


    @Transient
    private  float subtotal;








   // @Column(nullable = false, unique = true)
  //  foreign key(id) reference class(PizzaOrder)


}
