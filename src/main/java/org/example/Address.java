package org.example;

import net.datafaker.Faker;

public class Address {
    String streetName;
    int buildingNumber;
    Faker faker = new Faker();
    public Address(){
        streetName = faker.address().streetName();
        buildingNumber = Integer.parseInt(faker.address().buildingNumber());

    }
    public void printInfo(){
        System.out.println("Street name is: " + streetName + ", building number is  "+buildingNumber);
    }
}
