package com.hank.pizzSystem.hankPizzaSystem.entity.Info;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Topping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = false)
    private Timestamp createdTime;

    @Column(nullable = false, unique = false)
    private Timestamp lastUpdateTime;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = false)
    private int unitPrice;//cent


    public String getName() {
        return name;
    }
}
