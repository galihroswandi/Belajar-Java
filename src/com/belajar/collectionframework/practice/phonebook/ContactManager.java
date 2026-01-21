package com.belajar.collectionframework.practice.phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ContactManager {
    private final HashMap<String, String> contacts = new HashMap<>();

    public void addContact(String name, String phone){
        contacts.put(name, phone);
        System.out.println("Add contact successful");
    }

    public void findByName(String name){
        if(!contacts.containsKey(name)){
            System.err.println("Phone with name "+name+" Not found!");
            return;
        }

        System.out.println("===== FIND CONTACT BY NAME =====");
        System.out.println("Name: "+name+"\nPhone: "+contacts.get(name));
    }

    public void updatePhoneNumber(String name, String newPhoneNumber){
        if(!contacts.containsKey(name)){
            System.err.println("Phone with name "+name+" Not found!");
            return;
        }
        contacts.put(name, newPhoneNumber);
    }

    public void deleteContact(String name){
        if(!contacts.containsKey(name)){
            System.err.println("Phone with name "+name+" Not found!");
            return;
        }
        contacts.remove(name);
    }

    public void displayAllContact(){
      ArrayList<String> sorted = new ArrayList<>(contacts.keySet());
        Collections.sort(sorted);

        for(String sortedContact: sorted){
            System.out.println(sortedContact + ": "+contacts.get(sortedContact));
        }
    }
}
