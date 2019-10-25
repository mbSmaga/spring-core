package com.smaga.core3;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> favoriteBeers;

    public Person(String name, int age, List<String> favoriteBeers) {
        this.name = name;
        this.age = age;
        this.favoriteBeers = favoriteBeers;
    }
}
