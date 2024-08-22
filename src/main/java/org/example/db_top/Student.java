package org.example.db_top;

import java.sql.Date;
import java.time.LocalDateTime;

public class Student {
    private int id;
    private String name;
    private int age;
    private Date registrationDate;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id: " + id +
                ", name=: " + name + '\'' +
                ", age: " + age +
                ", registrationDate: " + registrationDate +
                '}';
    }
}
