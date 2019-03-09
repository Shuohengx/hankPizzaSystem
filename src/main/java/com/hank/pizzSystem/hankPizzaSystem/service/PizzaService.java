package com.hank.pizzSystem.hankPizzaSystem.service;



import com.hank.pizzSystem.hankPizzaSystem.entity.Info.Pizza;
import com.hank.pizzSystem.hankPizzaSystem.model.PizzaDto;
import com.hank.pizzSystem.hankPizzaSystem.repository.PizzaRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PizzaService {

    private PizzaRepository repo;

    public List<PizzaDto> listPizza(){

        List<Pizza> pizzas = repo.findAll();

        return pizzas.stream().map(i -> new PizzaDto(i)).collect(Collectors.toList());
   //     return Arrays.asList();
   //     return pizzas.stream().map(i -> new PizzaDto(...)).Collect(Collectors)
    }

}
