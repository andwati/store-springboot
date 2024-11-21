package com.andwati.store.dto;

public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;

    public ProductDTO(){}

    public ProductDTO(Long id, String name, String description, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
