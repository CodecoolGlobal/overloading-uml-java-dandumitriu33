package com.codecool.uml.overloading;

import java.util.Calendar;
import java.util.Date;

public class Webshop {

    public static void main(String[] args) {

        System.out.println("Creating new warehouse.");
        Warehouse Bucharest = new Warehouse();
        System.out.println("<<< TESTING SUPPLIERS >>>");
        System.out.println("Creating new Supplier 'abc'.");
        Supplier abc = new Supplier("ABC", "notebook manufacturer");
        System.out.println("Supplier created.");
        System.out.println(abc.toString());
        System.out.println("Creating new Supplier 'pencils'.");
        Supplier pencils = new Supplier("Pencil Maker", "pencil manufacturer");
        System.out.println("Supplier created.");
        System.out.println(pencils.toString());
        System.out.println("Creating new unnamed Supplier.");
        Supplier noName = new Supplier();
        System.out.println("Supplier created.");
        System.out.println(noName.toString());
        System.out.println("Setting name to unnamed Supplier.");
        noName.setName("Eraser Co.");
        System.out.println("Name set successful.");
        System.out.println(noName.toString());
        System.out.println("<<< TESTING PRODUCT CATEGORIES >>>");
        System.out.println("Creating unnamed default category.");
        ProductCategory unnamed = new ProductCategory();
        System.out.println("Category created successfully.");
        System.out.println(unnamed.toString());
        System.out.println("Creating defined category 'schoolSupplies'");
        ProductCategory schoolSupplies = new ProductCategory("School Supplies", "writing",
                "writing school supplies");
        System.out.println(schoolSupplies.toString());
        System.out.println("<<< TESTING FEATURED PRODUCT CATEGORIES >>>");
        System.out.println("Creating Pencils featured category.");
        ProductCategory pencilsFeatured = new FeaturedProductCategory();
        System.out.println("Featured category created successfully.");
        System.out.println(pencilsFeatured.toString());
        System.out.println("Scheduling.");
        Date d1 = new Date(120, Calendar.MAY,20);
        Date d2 = new Date(120, Calendar.JUNE,19);
        ((FeaturedProductCategory) pencilsFeatured).schedule(d1, d2);
        System.out.println(pencilsFeatured.toString());
        System.out.println("<<< TESTING PRODUCT >>>");
        System.out.println("Creating product 'pencil01'.");
        Product pencil01 = new Product();
        System.out.println("Product created successfully.");
        System.out.println(pencil01.toString());
        System.out.println("Setting partial details.");
        pencil01.setProductCategory(pencilsFeatured);
        pencil01.setSupplier(pencils);
        pencil01.setDefaultPrice(0.50F);
        System.out.println("Details set successfully.");
        System.out.println(pencil01.toString());

    }
}
