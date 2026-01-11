package org.example;

import net.datafaker.Faker;

public class CarTest {
    String brand;
    String model;
    int year;
    Faker faker= new Faker();
    public void testCar(){
        brand=faker.brand().car();
        model= faker.vehicle().model();
        year=faker.number().numberBetween(2000, 2025);

    }
    public void testPrintInfo(){
        testCar();
        System.out.println("Car brand is: " + brand);
        System.out.println("Car model is: "+ model);
        System.out.println("Car release year is: " + year);
    }
}
