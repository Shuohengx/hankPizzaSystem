package com.hank.pizzSystem.hankPizzaSystem.controller;

import com.hank.pizzSystem.hankPizzaSystem.model.PizzaDto;
import com.hank.pizzSystem.hankPizzaSystem.model.ToppingDto;
import com.hank.pizzSystem.hankPizzaSystem.service.PizzaService;
import com.hank.pizzSystem.hankPizzaSystem.service.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ToppingController {
    @Autowired
    private ToppingService toppingService;

    @GetMapping("/pizzas")
    public List<ToppingDto> listPizaas(){
        return toppingService.listTopping();
    }

}
