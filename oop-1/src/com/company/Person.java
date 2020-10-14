package com.company;

public class Person {
    int age;
    String name;
    int id;

    Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    Person() {

    }

    void sayHello() {
        System.out.println("Hi, I'm " + name);
    }
}
