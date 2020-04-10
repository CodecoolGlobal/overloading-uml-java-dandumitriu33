package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {
    private static int counter=0;
    private int id;
    private String name;
    private String description;

    public Supplier() {
        counter++;
        id = counter;
        name = "undefined";
        description = "undefined";
    }

    public Supplier(String name, String description) {
        counter++;
        id = counter;
        name = name;
        description = description;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts(Warehouse warehouse) {
        return Warehouse.getAllProductsBy(this);
    }

    public String toString() {
        return "Supplier id: " + this.id + ", name: " + this.name + ", description: " + this.description;
    }

}
