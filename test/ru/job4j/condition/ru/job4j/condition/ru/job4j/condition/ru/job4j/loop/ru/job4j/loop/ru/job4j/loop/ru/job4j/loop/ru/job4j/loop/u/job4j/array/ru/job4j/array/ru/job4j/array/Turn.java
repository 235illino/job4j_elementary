package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.u.job4j.array.ru.job4j.array.ru.job4j.array;


public class Turn {
    public static int[] back(int[] array) {

        int k = array.length - 1;

        for (int i = 0; i < array.length / 2; i++) {

            int tmp = array[i];
            array[i] = array[k];
            array[k] = tmp;
            k--;


        }
        return array;

    }
}


