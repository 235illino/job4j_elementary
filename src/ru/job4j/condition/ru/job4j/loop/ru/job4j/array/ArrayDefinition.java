package ru.job4j.condition.ru.job4j.loop.ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Ol Po";
        names[1] = "Oll Poo";
        names[2] = "Pall Cat";
        names[3] = "Roll Set";

        for (String name : names) {
            System.out.println(name);
        }
    }

}
