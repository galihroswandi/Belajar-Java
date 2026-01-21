package com.belajar.oop.learning.tostringmethod;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Without toString
    // System.out.println(person);
    // Output: Person@15db9742(memory address)

    // Override toString
    @Override
    public String toString() {
        return "Person{name=" + name + ", age=" + age + "}";
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println(person);
    }
}