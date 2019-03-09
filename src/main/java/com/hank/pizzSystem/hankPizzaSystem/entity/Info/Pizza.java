package com.hank.pizzSystem.hankPizzaSystem.entity.Info;

import com.hank.pizzSystem.hankPizzaSystem.entity.PizzaOrderItem;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = false)
    private Timestamp createdTime;

    @Column(nullable = false, unique = false)
    private Timestamp lastUpdateTime;

    @Column(nullable = false, unique = false)
    private String size;

    @Column(nullable = false, unique = false)
    private String pizzaName;

    @Column(nullable = false, unique = true)
    private int unitPrice; //cent


    @ManyToMany
    private List<Topping> toppingList;

    @ManyToMany
    private List<Cheese> cheeseList;

    @ManyToMany
    private List<Sauce> sauceList;

    @ManyToMany
    private List<Crust> crustList;

    public Long getId() {
        return id;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public Timestamp getLastUpdateTime() {
        return lastUpdateTime;
    }

    public String getSize() {
        return size;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public List<Cheese> getCheeseList() {
        return cheeseList;
    }

    public List<Sauce> getSauceList() {
        return sauceList;
    }

    public List<Crust> getCrustList() {
        return crustList;
    }
}
