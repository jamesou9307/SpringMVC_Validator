package com.james.springmvc.entity;

import java.util.Date;

public class Product {

    private String id;
    private String name;
    private float price;
    private Date inputDate;

    public Product() {
    }

    public Product(String id, String name, float price, Date inputDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inputDate = inputDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }
}
