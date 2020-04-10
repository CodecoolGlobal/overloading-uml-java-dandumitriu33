package com.codecool.uml.overloading;

import java.util.List;

public class ProductCategory {
    private static int counter = 0;
    private int id;
    private String name;
    private String department;
    private String description;

    public ProductCategory() {
        counter++;
        id = counter;
        name = "undefined";
        department = "undefined";
        description = "undefined";
    }

    public ProductCategory(String name, String department, String description) {
        counter++;
        id = counter;
        name = name;
        department = department;
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

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
        return "Product Category ID: " + this.id + ", name: " + this.name + ", department: " +
                this.department + ", description: " + this.description;
    }

}
