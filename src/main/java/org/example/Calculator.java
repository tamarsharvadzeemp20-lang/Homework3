package org.example;

import net.datafaker.Faker;

public class Calculator {
    Faker faker = new Faker();

    public int multiply(int one, int two) {
        int x = faker.number().numberBetween(0,10);
        int y = faker.number().numberBetween(10, 44);
        int finalNumber = x * y;
        System.out.println(x + " * " + y + " = " + finalNumber);
        return finalNumber;
    }

    public int multiply(int one, int two, int three) {
        int x = faker.number().numberBetween(20, 56);
        int y = faker.number().numberBetween(11, 628);
        int z = faker.number().numberBetween(12, 383);
        int finalNumber = x * y * z;
        System.out.println(x + " * " + y + " * "+ z + " = " + finalNumber);
        return finalNumber;
    }
}
