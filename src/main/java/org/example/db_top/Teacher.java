package org.example.db_top;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int age;

    public Teacher() {
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int saary) {
        this.salary = saary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{id: " + id + ", " +
                "name: " + name + ", " +
                "salary: " + salary + ", " +
                "age: " + age + "}";
    }
}
