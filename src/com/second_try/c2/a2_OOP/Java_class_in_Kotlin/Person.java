package com.second_try.c2.a2_OOP.Java_class_in_Kotlin;

public class Person {
    private String name;
    private boolean isMarried;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
