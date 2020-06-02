package ru.job4j.oop;

import ru.job4j.inheritance.Pacient;

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("Predator");
    }

    public Predator(String name) {
        super(name);
    }

}
