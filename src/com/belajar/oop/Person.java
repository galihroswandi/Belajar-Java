package com.belajar.oop;

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
        this.name = name;
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
