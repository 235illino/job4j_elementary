package ru.job4j.pojo;

public class Book {

    private String name;
    private int papers;

    public Book(String name, int papers) {
        this.name = name;
        this.papers = papers;
    }

    public String getName() {
        return name;
    }

    public int getPapers() {
        return papers;
    }
}
