package ru.job4j.oop;

public class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal " + name);
    }

    public Animal() {
        super();
        System.out.println("Animal");
    }


}
