package com.hank.pizzSystem.hankPizzaSystem.service;

import com.hank.pizzSystem.hankPizzaSystem.entity.Info.Pizza;
import com.hank.pizzSystem.hankPizzaSystem.entity.Info.Topping;
import com.hank.pizzSystem.hankPizzaSystem.model.PizzaDto;
import com.hank.pizzSystem.hankPizzaSystem.model.ToppingDto;
import com.hank.pizzSystem.hankPizzaSystem.repository.PizzaRepository;
import com.hank.pizzSystem.hankPizzaSystem.repository.ToppingRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ToppingService {

    private ToppingRepository repo;


    public List<ToppingDto> listTopping(){

        List<Topping> toppings = repo.findAll();


        return toppings.stream().map(i -> new ToppingDto(i)).collect(Collectors.toList());
        //     return Arrays.asList();
        //     return pizzas.stream().map(i -> new PizzaDto(...)).Collect(Collectors)
    }
}
