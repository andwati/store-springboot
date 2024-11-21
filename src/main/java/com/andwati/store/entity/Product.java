package com.andwati.store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;

    public Product() {}

    public Product(String name, String description, Double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
