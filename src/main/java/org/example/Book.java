package org.example;

import net.datafaker.Faker;

public class Book {
    String title;
    String author;
    int pages;
    Faker faker = new Faker();
    public String getBookTitle (){
        title=faker.book().title();
        return title;
    }
    public String getBookAuthor(){
        author= faker.book().author();
        return author;
    }
    public int getBookPage(){
        pages= faker.number().numberBetween(1,256);
        return pages;
    }
    public String toString(){
        return "Book title is: " + title + ", written by : " +author + ",  has " + pages + " pages";
    }


}
