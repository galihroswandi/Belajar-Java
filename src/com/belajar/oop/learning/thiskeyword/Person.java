package com.belajar.oop.learning.thiskeyword;

public class Person {
    private String name;
    private int age;

    // 1. Distinguish parameter from attribute
    public Person(String name, int age) {
        this.name = name; // this.name = attribute | name = parameter
        this.age = age;
    }

    // 2. Call another constructor
    public Person(String name) {
        this(name, 0);
    }

    // 3. Return current object (method chainning)
    public Person setName(String name) {
        this.name = name;
        return this; // return current object
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    // 4. Pass current object as parameter
    public void compare(Person other) {
        System.out.println(this.age + " vs " + other.age);
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        new Person("Jhon").setName("Johny").setAge(25).print();
    }
}
