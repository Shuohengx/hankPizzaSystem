package com.hank.pizzSystem.hankPizzaSystem.model;

import com.hank.pizzSystem.hankPizzaSystem.entity.Info.Pizza;

import java.util.List;

public class PizzaDto {
    private long id;
    private String name;
    private List<String> sizes;
    private String description;


    public PizzaDto(Pizza pizza){
        this.id = pizza.getId();
        this.name = pizza.getPizzaName();
    //    this.sizes = pizza.

    }

}
