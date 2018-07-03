package com.second_try.c2.a2_OOP.Kotlin_class_in_Java;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob",true);
        System.out.println(person.toString());
        person.setMale(null);
        System.out.println(person.toString());
    }
}
