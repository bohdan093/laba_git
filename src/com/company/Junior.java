package com.company;

public class Junior {
    private int age;
    private String name;
    public Junior(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Junior{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
