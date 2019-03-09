package com.hank.pizzSystem.hankPizzaSystem.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class Voucher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private boolean isUsed;

    @Column(nullable = false, unique = true)
    private LocalDate validateDate;

    @Column(nullable = false, unique = true)
    private int moneyReduced; //cent

}
