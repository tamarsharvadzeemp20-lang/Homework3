package org.example;

import net.datafaker.Faker;

public class User {
    String name;
    String email;
    Faker faker = new Faker();

    public User(String name) {
        this.name = faker.name().firstName();
        this.email = null;
    }

    public User(String name, String email) {
        this.name = faker.name().firstName();
        this.email = faker.internet().emailAddress();
    }

    public void printInfo() {
        System.out.println("User name is: " + name);
        if (email != null) {
            System.out.println("User email is: " + email);
        }
    }

}