package org.example;

import net.datafaker.Faker;

public class Student {
    private String name;
    private int age;
    private int grade;
    Faker faker = new Faker();
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getGrade(){
        return grade;
    }
    public void setName (){
        name = faker.name().fullName();
    }
    public void setAge (){
        age = faker.number().numberBetween(18,50);
    }
    public void setGrade (){
        grade = faker.number().numberBetween(1,100);
    }
}
