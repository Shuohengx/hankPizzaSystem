package com.hank.pizzSystem.hankPizzaSystem.service;



import com.hank.pizzSystem.hankPizzaSystem.entity.Info.Pizza;
import com.hank.pizzSystem.hankPizzaSystem.model.PizzaDto;
import com.hank.pizzSystem.hankPizzaSystem.repository.PizzaRepository;

import java.util.Arrays;
import java.util.List;

public class PizzaService {
    private PizzaRepository repo;
    public List<PizzaDto> listPizza(){
        List<Pizza> pizzas = repo.findAll();
        return Arrays.asList();
   //     return pizzas.stream().map(i -> new PizzaDto(...)).Collect(Collectors)
    }

}
