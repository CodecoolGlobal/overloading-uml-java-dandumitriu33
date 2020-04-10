package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    static private List<Product> productlist = new ArrayList<>();

    public void addProduct(Product product) {
        productlist.add(product);
    }

    public List<Product> getProducts() {
        return productlist;
    }

    public static List<Product> getAllProductsBy (ProductCategory productCategory) {
        return productlist; //TODO change return
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        return productlist; //TODO change return
    }

}
