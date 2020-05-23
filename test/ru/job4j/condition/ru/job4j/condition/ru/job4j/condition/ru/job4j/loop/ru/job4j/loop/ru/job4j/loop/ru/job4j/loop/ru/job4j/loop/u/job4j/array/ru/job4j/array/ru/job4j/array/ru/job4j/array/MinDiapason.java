package ru.job4j.condition.ru.job4j.condition.ru.job4j.condition.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.ru.job4j.loop.u.job4j.array.ru.job4j.array.ru.job4j.array.ru.job4j.array;

public class MinDiapason {

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = 1; index <= finish; index++) {

            if (index - 1 >= start) {

                if (min > array[index]) {
                    min = array[index];
                }
                /* проверить, что эталон больше, чем элемент. записать в эталон элемент массива. */
            }
        }
        return min;
    }

}
