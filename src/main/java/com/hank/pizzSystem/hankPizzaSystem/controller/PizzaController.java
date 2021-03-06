package com.hank.pizzSystem.hankPizzaSystem.controller;

import com.hank.pizzSystem.hankPizzaSystem.model.PizzaDto;
import com.hank.pizzSystem.hankPizzaSystem.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/pizzas")
    public List<PizzaDto> listPizaas(){
        return pizzaService.listPizza();
    }


}
