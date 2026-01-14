package com.belajar.oop.learning.gettersetter;

public class Person {
    // Private attributes
    private String name;
    private int age;
    private String email;

    // Constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invelid age!");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email!");
        }
    }

}

class Main {
    public static void main(String[] args) {
        Person person = new Person("Jhon", 25, "jhon@example.com");

        person.setAge(26);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
