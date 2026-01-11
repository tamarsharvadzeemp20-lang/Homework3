package org.example;

import net.datafaker.Faker;

import java.awt.*;

public class Product {
    int price;
    int discount;
    Faker faker = new Faker();
    public Product() {
        price = faker.number().numberBetween(10, 500);
        discount = faker.number().numberBetween(10, 20);
    }
    public double DiscountedPrice(){
        return (price - (price * discount/100));
    }
    public void printInfo (){
        System.out.println("Prodact wrice was " +price + " product discount was " + discount+"%"+ " and now product price is " + DiscountedPrice());
    }

}
