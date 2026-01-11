package org.example;

import net.datafaker.Faker;

public class User2 {
    Address address;
    Faker faker = new Faker();
    public User2 (){
        address = new Address();
    }
    public void printInfo(){
        address.printInfo();
    }
}
