package com.belajar.oop;

public class Main {
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
