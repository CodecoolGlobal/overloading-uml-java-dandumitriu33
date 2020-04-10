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
        List<Product> result = new ArrayList<>();
        for (int i=0; i<productlist.size(); i++) {
            if (productlist.get(i).getProductCategory()==productCategory) {
                result.add(productlist.get(i));
            }
        }
        return result;
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> result = new ArrayList<>();
        for (int i=0; i<productlist.size(); i++) {
            if (productlist.get(i).getSupplier()==supplier) {
                result.add(productlist.get(i));
            }
        }
        return result;
    }

}
