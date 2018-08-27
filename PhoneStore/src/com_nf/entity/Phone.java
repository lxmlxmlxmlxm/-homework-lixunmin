package com_nf.entity;

public class Phone {
    private int id;
    private String name;
    private   double price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Phone(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Phone() {

    }
}
