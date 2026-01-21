package com.belajar.oop.learning.classobject;

public class Person {
    String name;
    byte age;
    String email;

    public Person(String name, byte age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Overloading
    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        // Direct Assignment
        // this.name = name;

        // Chaining
        this(name, (byte) 0);
    }

    void introduce() {
        System.out.println("Hi, I'm " + name);
        System.out.println("I'm " + age + " years old");
    }

    void celebrateBirthday() {
        age++;
        System.out.println("Happy birthday! Now I'm " + age);
    }
}

class Main {
    public static void main(String[] args) {
        // Create object (instance)
        Person person1 = new Person("Jhon", (byte) 25, "jhon@example.com");

        // Call methods
        person1.introduce();
        person1.celebrateBirthday();

        // Create another object
        Person person2 = new Person("Jane", (byte) 30, "jane@example.com");
        person2.introduce();

        Person person3 = new Person("Jack");
        person3.introduce();
    }
}