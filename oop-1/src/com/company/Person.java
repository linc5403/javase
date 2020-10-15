package com.company;

public class Person {
    private int age;
    private String name;
    private int id;

    private void setAge(int age) {
        this.age = age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Person(String name) {
        this.name = name;
    }

    Person(String name, int age, int id) {
        setAge(age);
        setId(id);
        setName(name);
    }

    Person() {

    }

    void sayHello() {
        System.out.println("Hi, I'm " + name);
    }
}
