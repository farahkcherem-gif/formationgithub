package com.example.gitgithub;

import java.util.Date;

public class Order {
    private Long id;
    private User user;
    private Product product;
    private Integer quantity;
    private Double totalPrice;
    private Date orderDate;

    // Constructeurs, getters, setters...
    
    public Order() {
        this.orderDate = new Date();
    }

    public Order(Long id, User user, Product product, Integer quantity) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
        this.orderDate = new Date();
    }

    // Getters et setters...
}