package com.hank.pizzSystem.hankPizzaSystem.model;

import com.hank.pizzSystem.hankPizzaSystem.entity.Info.Pizza;
import com.hank.pizzSystem.hankPizzaSystem.entity.Info.Topping;

import javax.persistence.Column;

public class ToppingDto {
    private String name;

    public ToppingDto(Topping topping){
        this.name = topping.getName();
    }
}
