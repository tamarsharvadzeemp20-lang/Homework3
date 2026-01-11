package org.example;
//ამოცანა პირველი გაწერილი მაქვს ტესტადაც

public class Main {
    public static void main(String[] args) {
        //პირველი დავალება
        Car car1 = new Car();
        car1.printInfo();
        //ამოცავან მეორე
        User user1 = new User("testName");
        user1.printInfo();
        User user2 = new User("testName", "testEmail");
        user2.printInfo();
        //ამოცანა მესამე
        Student student1 = new Student();
        student1.setName();
        student1.setAge();
        student1.setGrade();
        System.out.println("Student name is : " + student1.getName() + " the age is " + student1.getAge() +" and the final grade is " + student1.getGrade());
        //ამოცანა მეოთხე
        Calculator calculator1 = new Calculator();
       calculator1.multiply(1,2);
       calculator1.multiply(1,2,3);
       // ამოცანა მეხუთე
        Book book1 = new Book();
        book1.getBookPage();
        book1.getBookAuthor();
        book1.getBookTitle();
        System.out.println(book1);
        // ამოცანა მეექვსე
        BankAccount banckAccount1 = new BankAccount();
        banckAccount1.balanceLimit();
        //ამოცანა მეშვიდე
        Product product1= new Product();
        product1.printInfo();
        //ამოცანა მერვე
        Address address1 = new Address();
        address1.printInfo();
        User2 userNew = new User2();
        userNew.printInfo();
        //მეცხრე დავალება


    }
}
