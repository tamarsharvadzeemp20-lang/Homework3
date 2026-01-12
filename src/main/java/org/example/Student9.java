package org.example;

import net.datafaker.Faker;
import java.util.Objects;

public class Student9 {

    private int StudentID;

    public Student9() {
        Faker faker = new Faker();
        StudentID = faker.number().numberBetween(100000, 1000000);

    }

    public int getStudentID() {
        return StudentID;
    }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student9 student = (Student9) o;
        return Objects.equals(StudentID, student.StudentID);
    }
    @Override
    public int hashCode(){
        return Objects.hash(StudentID);
    }
}