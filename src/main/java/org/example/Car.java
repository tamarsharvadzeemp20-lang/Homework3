package org.example;

import net.datafaker.Faker;

public class Car {
    String brand;
    String model;
    int year;
    Faker faker= new Faker();
    public Car (){
        brand = faker.brand().car();
        model = faker.vehicle().model();
        year = faker.number().numberBetween(1997, 2025);
    }
    public void printInfo(){
        System.out.println("Car brand is : " + brand + ", car model is  "+ model + ", car was released in  " + year + " year");

    }
}
