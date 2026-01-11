package org.example;

import net.datafaker.Faker;

public class BankAccount {
    double balance;
    Faker faker = new Faker();
    public  BankAccount() {
        balance = faker.number().numberBetween(0.00, 10000000.00);
    }
    public void balanceLimit (){
        if (balance < 1000){
            System.out.println("ბალანსი დაბალია");
        }
        else {
            System.out.println("ხელფასი ჩაგერიცხა");
        }

    }
}
