package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.u.job4j.array.ru.job4j.array.ru.job4j.array;

public class Min {

    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {

            if (min > array[index]) {
                min = array[index];
            }
            /* проверить, что эталон больше, чем элемент. записать в эталон элемент массива. */
        }
        return min;
    }

}
